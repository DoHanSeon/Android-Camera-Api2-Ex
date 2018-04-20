package com.example.hs.mycamera2.camera_option;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

import com.example.hs.mycamera2.CameraApplication;
import com.example.hs.mycamera2.camera_option.capture.check.BlackLevelLock;
import com.example.hs.mycamera2.camera_option.capture.check.ControlAeLock;
import com.example.hs.mycamera2.camera_option.capture.check.ControlAwbLock;
import com.example.hs.mycamera2.camera_option.capture.check.StatisticsHotPixelMapMode;
import com.example.hs.mycamera2.camera_option.capture.select.ColorCorrectionAbeRationMode;
import com.example.hs.mycamera2.camera_option.capture.select.ColorCorrectionMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlAeAntibandingMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlAeMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlAfMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlAfTrigger;
import com.example.hs.mycamera2.camera_option.capture.select.ControlAwbMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlCaptureIntent;
import com.example.hs.mycamera2.camera_option.capture.select.ControlEffectMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlSceneMode;
import com.example.hs.mycamera2.camera_option.capture.select.ControlVideoStabilizationMode;
import com.example.hs.mycamera2.camera_option.capture.select.EdgeMode;
import com.example.hs.mycamera2.camera_option.capture.select.FlashMode;
import com.example.hs.mycamera2.camera_option.capture.select.HotPixelMode;
import com.example.hs.mycamera2.camera_option.capture.select.LensOpticalStabilizationMode;
import com.example.hs.mycamera2.camera_option.capture.select.NoiseReductionMode;
import com.example.hs.mycamera2.camera_option.capture.select.SensorTestpatternMode;
import com.example.hs.mycamera2.camera_option.capture.select.ShadingMode;
import com.example.hs.mycamera2.camera_option.capture.select.StatisticsFaceDetectMode;
import com.example.hs.mycamera2.camera_option.capture.select.StatisticsLensShadingMapMode;
import com.example.hs.mycamera2.camera_option.capture.select.TonemapMode;
import com.example.hs.mycamera2.camera_option.capture.select.TonemapPresetCurve;
import com.example.hs.mycamera2.camera_option.capture.set.ControlAeExposureCompensation;
import com.example.hs.mycamera2.camera_option.capture.set.JpegOrientation;
import com.example.hs.mycamera2.camera_option.capture.slide.ControlPostRawSensitivityBoost;
import com.example.hs.mycamera2.camera_option.detail_option.DetailOptionInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2018. 4. 18..
 */

public class CameraOptionManager {
    private static CameraOptionManager instance;

    public static CameraOptionManager getInstance() {
        if (instance == null) {
            instance = new CameraOptionManager();
        }
        return instance;
    }

    private Map<Integer, CameraOption> allCaptureKeys = new HashMap<>();


    private Map<Integer, CameraOption> cameraKeyMap = new HashMap<>();

    private CameraOptionManager() {
        //check key
        CameraOption option = new BlackLevelLock();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAeLock();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAwbLock();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new StatisticsHotPixelMapMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);

        //select
        option = new ColorCorrectionAbeRationMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ColorCorrectionMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAeAntibandingMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAeMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAfMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAfTrigger();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlAwbMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlCaptureIntent();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlEffectMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlSceneMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ControlVideoStabilizationMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new EdgeMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new FlashMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new HotPixelMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new LensOpticalStabilizationMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new NoiseReductionMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new SensorTestpatternMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new ShadingMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new StatisticsFaceDetectMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new StatisticsLensShadingMapMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new TonemapMode();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new TonemapPresetCurve();
        allCaptureKeys.put(option.getKey().hashCode(), option);

        //set
        option = new ControlAeExposureCompensation();
        allCaptureKeys.put(option.getKey().hashCode(), option);
        option = new JpegOrientation();
        allCaptureKeys.put(option.getKey().hashCode(), option);

        //slide
        option = new ControlPostRawSensitivityBoost();
        allCaptureKeys.put(option.getKey().hashCode(), option);

    }

    public Collection<CameraOption> getAvailableCameraOptions() {
        return cameraKeyMap.values();
    }

    public void initialize(String cameraId) throws CameraAccessException {
        CameraManager manager =(CameraManager) CameraApplication.getContext().getSystemService(Context.CAMERA_SERVICE);
        CameraCharacteristics character = manager.getCameraCharacteristics(cameraId);

        List<CaptureRequest.Key<?>> availableKeys = character.getAvailableCaptureRequestKeys();

        for (CaptureRequest.Key<?> key : availableKeys) {
            CameraOption cameraOption = allCaptureKeys.get(key.hashCode());
            if (cameraOption != null) {
                //TODO available value
                cameraOption.getDetailOption().initAvailableOption(character);
                cameraKeyMap.put(cameraOption.hashCode(), cameraOption);
                Log.d("hanseon--", "\n");
                logCameraOption(cameraOption);
            }
        }
    }

    private void logCameraOption(CameraOption cameraOption) {
        StringBuilder sb = new StringBuilder();
        sb.append(cameraOption.getDisplayName()).append("\n");
        sb.append("OptionType : ").append(cameraOption.getOptionType().name()).append("\n");

        List<DetailOptionInfo> detailOptionInfos = cameraOption.getDetailOption().getDetailOptionInfos();
        if (detailOptionInfos != null && detailOptionInfos.size() > 0) {
            sb.append("Detail Option exist - " + detailOptionInfos.size()).append("EA").append("\n").append("\t");
            for (int i=0; i<detailOptionInfos.size(); i++) {
                DetailOptionInfo info = detailOptionInfos.get(i);

                sb.append(info.getDisplayName());
                if (i == detailOptionInfos.size() - 1) {
                    sb.append("\n");
                } else {
                    sb.append("\t");
                }

            }
        } else {
            sb.append("Detail Option not exist").append("\n");
        }
        Log.d("hanseon--", sb.toString());


    }
}
