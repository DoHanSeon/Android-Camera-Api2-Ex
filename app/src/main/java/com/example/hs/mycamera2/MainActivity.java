package com.example.hs.mycamera2;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hs.mycamera2.camera_option.CameraOptionManager;
import com.example.hs.mycamera2.camera_option.OptionFragment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String SAVE_DIRECTORY_NAME = "temp";

    private Button btnCapture;
    private TextureView textureView;
    private View optionFragmentView;

    private static final SparseIntArray ORIENTATIONS = new SparseIntArray();

    static {
        ORIENTATIONS.append(Surface.ROTATION_0, 90);
        ORIENTATIONS.append(Surface.ROTATION_90, 0);
        ORIENTATIONS.append(Surface.ROTATION_180, 270);
        ORIENTATIONS.append(Surface.ROTATION_270, 180);
    }

    private String cameraId;
    private CameraDevice cameraDevice;
    private CameraCaptureSession cameraCaptureSession;
    private CaptureRequest.Builder captureRequestBuilder;
    private Size imageDimension;
    private ImageReader imageReader;

    private File file;
    private static final int REQUEST_CAMERA_PERMISSION = 200;
    private boolean flashSupported;
    private Handler backgroundHandler;
    private HandlerThread backgroundThread;

    private Map<CaptureRequest.Key, Object> applyedOptions = new HashMap<>();

    private boolean cameraOptionInitSuccess;


    private TextureView.SurfaceTextureListener textureListener = new TextureView.SurfaceTextureListener() {
        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
            openCamera();
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surface) {

        }
    };

    CameraDevice.StateCallback stateCallback = new CameraDevice.StateCallback() {
        @Override
        public void onOpened(@NonNull CameraDevice camera) {
            cameraDevice = camera;
            createCameraPreview();
        }

        @Override
        public void onDisconnected(@NonNull CameraDevice camera) {
            cameraDevice.close();
        }

        @Override
        public void onError(@NonNull CameraDevice camera, int error) {
            cameraDevice.close();
            cameraDevice = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textureView = findViewById(R.id.textureView);
        textureView.setSurfaceTextureListener(textureListener);

        btnCapture = findViewById(R.id.btnCapture);
        btnCapture.setOnClickListener(v -> takePicture());

        optionFragmentView = findViewById(R.id.option_fragment_view);

        findViewById(R.id.btnOption).setOnClickListener(v -> {
            Log.d("hanseon--", "camera option click");
            if (!cameraOptionInitSuccess) {
                Toast.makeText(MainActivity.this, "아직 카메라 옵션 초기화 안됨", Toast.LENGTH_SHORT).show();
                return;
            }
            showOptionFragment();
        });
    }

    private void showOptionFragment() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentByTag(OptionFragment.TAG);
        if (fragment == null) {
            fragment = OptionFragment.createFragment(optionCallback);
            fm.beginTransaction().replace(optionFragmentView.getId(), fragment, OptionFragment.TAG).commitAllowingStateLoss();
        }
        optionFragmentView.setVisibility(View.VISIBLE);
    }

    private void hideOptionFragment() {
        optionFragmentView.setVisibility(View.GONE);
    }

    @Override
    public void onBackPressed() {
        if (optionFragmentView.getVisibility() == View.VISIBLE) {
            hideOptionFragment();
            return;
        }
        super.onBackPressed();
    }

    private void takePicture() {
        if (cameraDevice == null) {
            return;
        }
        CameraManager manager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            CameraCharacteristics characteristics = manager.getCameraCharacteristics(cameraDevice.getId());
            Size[] jpegSizes = null;
            if (characteristics != null) {
                jpegSizes = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP).getOutputSizes(ImageFormat.JPEG);
            }

            int width = 640;
            int height = 480;
            if (jpegSizes != null && jpegSizes.length > 0) {
                width = jpegSizes[0].getWidth();
                height = jpegSizes[1].getHeight();
            }

            ImageReader reader = ImageReader.newInstance(width, height, ImageFormat.JPEG, 1);
            List<Surface> outputSurface = new ArrayList<>(2);
            outputSurface.add(reader.getSurface());
            outputSurface.add(new Surface(textureView.getSurfaceTexture()));

            //TODO setting template option
            final CaptureRequest.Builder captureBuilder = cameraDevice.createCaptureRequest(CameraDevice.TEMPLATE_STILL_CAPTURE);
            captureBuilder.addTarget(reader.getSurface());
            //TODO setting capture option (ex key, value)
            for (CaptureRequest.Key key : applyedOptions.keySet()) {
                captureBuilder.set(key, applyedOptions.get(key));
            }

//            captureBuilder.set(CaptureRequest.CONTROL_MODE, CameraMetadata.CONTROL_MODE_AUTO);
//            captureBuilder.set();



            int rotation = getWindowManager().getDefaultDisplay().getRotation();
            captureBuilder.set(CaptureRequest.JPEG_ORIENTATION, ORIENTATIONS.get(rotation));
            final CaptureRequest captureRequest = captureBuilder.build();

            //file
            File parent = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/" + SAVE_DIRECTORY_NAME);
            if (!parent.exists()) {
                parent.mkdir();
            }
            file = new File(parent, UUID.randomUUID().toString() + ".jpg");
            ImageReader.OnImageAvailableListener readerListerner = new ImageReader.OnImageAvailableListener() {
                @Override
                public void onImageAvailable(ImageReader reader) {
                    Image image = null;
                    try {
                        image = reader.acquireLatestImage();
                        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                        byte[] bytes = new byte[buffer.capacity()];
                        buffer.get(bytes);
                        save(bytes);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (image != null) {
                            image.close();
                        }
                    }
                }

                private void save(byte[] bytes) throws IOException {
                    OutputStream outputStream = null;
                    try {
                        outputStream = new FileOutputStream(file);
                        outputStream.write(bytes);
                    } finally {
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        MainActivity.this.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file)));
                    }
                }
            };

            reader.setOnImageAvailableListener(readerListerner, backgroundHandler);
            final CameraCaptureSession.CaptureCallback captureListener = new CameraCaptureSession.CaptureCallback() {
                @Override
                public void onCaptureCompleted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull TotalCaptureResult result) {
                    super.onCaptureCompleted(session, request, result);
                    Toast.makeText(MainActivity.this, "Saved " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
                    createCameraPreview();
                }
            };
            cameraDevice.createCaptureSession(outputSurface, new CameraCaptureSession.StateCallback() {
                @Override
                public void onConfigured(@NonNull CameraCaptureSession session) {
                    try {
                        session.capture(captureRequest, captureListener, backgroundHandler);
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onConfigureFailed(@NonNull CameraCaptureSession session) {

                }
            }, backgroundHandler);

        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private void createCameraPreview() {
        try {
            SurfaceTexture texture = textureView.getSurfaceTexture();
            texture.setDefaultBufferSize(imageDimension.getWidth(), imageDimension.getHeight());
            Surface surface = new Surface(texture);
            CameraOptionManager.getInstance().initialize(cameraId)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(result -> {
                        Log.d("hanseon--", "camera option initialized");
                        cameraOptionInitSuccess = true;
                    });
            if (captureRequestBuilder == null) {
                captureRequestBuilder = cameraDevice.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW);
                captureRequestBuilder.addTarget(surface);
            }
            cameraDevice.createCaptureSession(Arrays.asList(surface), new CameraCaptureSession.StateCallback() {
                @Override
                public void onConfigured(@NonNull CameraCaptureSession session) {
                    if (cameraDevice == null) {
                        return;
                    }
                    cameraCaptureSession = session;
                    updatePreview();
                }

                @Override
                public void onConfigureFailed(@NonNull CameraCaptureSession session) {
                    Toast.makeText(MainActivity.this, "createCameraPreview onConfigureFailed", Toast.LENGTH_SHORT).show();
                }
            }, null);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private CameraSettingsView.OptionCallback optionCallback = new CameraSettingsView.OptionCallback() {
        @Override
        public void onChangeCheckOption(CaptureRequest.Key<Boolean> key, boolean isChecked) {
            if (captureRequestBuilder != null) {
                applyedOptions.put(key, isChecked);
                captureRequestBuilder.set(key, isChecked);
                updatePreview();
            }
        }

        @Override
        public void onChangeSelectOption(CaptureRequest.Key<Integer> key, int option) {
            if (captureRequestBuilder != null) {
                Log.d("hanseon--", "integer onChangeSelectOption : " + key.getName() + ", " + option);
                applyedOptions.put(key, option);
                captureRequestBuilder.set(key, option);
                updatePreview();
            }
        }

        @Override
        public void onChangeSelectOption(CaptureRequest.Key<Float> key, float option) {
            if (captureRequestBuilder != null) {
                Log.d("hanseon--", "float onChangeSelectOption : " + key.getName() + ", " + option);
                applyedOptions.put(key, option);
                captureRequestBuilder.set(key, option);
                updatePreview();
            }
        }

        @Override
        public void onChangeSlideOption(CaptureRequest.Key<Integer> key, int option) {
            if (captureRequestBuilder != null) {
                Log.d("hanseon--", "integer onChangeSlideOption : " + key.getName() + ", " + option);
                applyedOptions.put(key, option);
                captureRequestBuilder.set(key, option);
                updatePreview();
            }
        }

        @Override
        public void onChangeSlideOption(CaptureRequest.Key<Float> key, float option) {
            if (captureRequestBuilder != null) {
                Log.d("hanseon--", "float onChangeSlideOption : " + key.getName() + ", " + option);
                applyedOptions.put(key, option);
                captureRequestBuilder.set(key, option);
                updatePreview();
            }
        }

        @Override
        public void onChangeSlideOption(CaptureRequest.Key<Long> key, long option) {
            if (captureRequestBuilder != null) {
                Log.d("hanseon--", "Long onChangeSlideOption : " + key.getName() + ", " + option);
                applyedOptions.put(key, option);
                captureRequestBuilder.set(key, option);
                updatePreview();
            }
        }

        @Override
        public Object getCurrentValue(CaptureRequest.Key key) {
            return captureRequestBuilder.get(key);
        }
    };

    private void updatePreview() {
        if (cameraDevice == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(captureRequestBuilder.build(), null, backgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private void openCamera() {
        CameraManager manager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            cameraId = manager.getCameraIdList()[0];
            CameraCharacteristics characteristics = manager.getCameraCharacteristics(cameraId);
            StreamConfigurationMap map = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            imageDimension = map.getOutputSizes(SurfaceTexture.class)[0];

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CAMERA_PERMISSION);
                return;
            }
            manager.openCamera(cameraId, stateCallback, null);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        startBackgroundThread();

        if (textureView.isAvailable()) {
            openCamera();
        } else {
            textureView.setSurfaceTextureListener(textureListener);
        }
    }

    private void startBackgroundThread() {
        backgroundThread = new HandlerThread("Camera Background");
        backgroundThread.start();
        backgroundHandler = new Handler(backgroundThread.getLooper());
    }

    @Override
    protected void onPause() {
        stopBackgroundThread();
        super.onPause();

    }

    private void stopBackgroundThread() {
        backgroundThread.quitSafely();
        try {
            backgroundThread.join();
            backgroundThread = null;
            backgroundHandler = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CAMERA_PERMISSION) {
            if (grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                finish();
            }
        }
    }
}
