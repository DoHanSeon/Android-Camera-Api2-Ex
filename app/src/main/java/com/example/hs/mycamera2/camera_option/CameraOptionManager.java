package com.example.hs.mycamera2.camera_option;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
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
import com.example.hs.mycamera2.camera_option.capture.select.ControlAePrecaptureTrigger;
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
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;

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

    private Map<Integer, CameraOption> allCaptureOption = new HashMap<>();


    private Map<Integer, CameraOption> cameraKeyMap = new HashMap<>();

    private CameraOptionManager() {
        //check key


    }

    public Map<Integer, CameraOption> getAvailableCameraOptions() {
        return cameraKeyMap;
    }

    public void initialize(String cameraId) throws CameraAccessException {
        CameraManager manager =(CameraManager) CameraApplication.getContext().getSystemService(Context.CAMERA_SERVICE);
        CameraCharacteristics character = manager.getCameraCharacteristics(cameraId);

        List<CaptureRequest.Key<?>> availableKeys = character.getAvailableCaptureRequestKeys();
        Map<Integer, CameraOption> allCaptureOption = getAllCaptureOption(character);

        for (CaptureRequest.Key<?> key : availableKeys) {
            CameraOption cameraOption = allCaptureOption.get(key.hashCode());
            if (cameraOption != null) {
                cameraOption.initailize(character);
                cameraKeyMap.put(cameraOption.hashCode(), cameraOption);
                Log.d("hanseon--", "\n");
                logCameraOption(cameraOption);
            }
        }
    }

    private Map<Integer, CameraOption> getAllCaptureOption(CameraCharacteristics characteristics) {
        Map<Integer, CameraOption> allCaptureOption = new HashMap<>();
        CameraOption option = new BlackLevelLock(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAeLock(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAwbLock(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new StatisticsHotPixelMapMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);

        //select
        option = new ColorCorrectionAbeRationMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ColorCorrectionMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAeAntibandingMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAeMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAePrecaptureTrigger(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAfMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAfTrigger(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlAwbMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlCaptureIntent(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlEffectMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlSceneMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ControlVideoStabilizationMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new EdgeMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new FlashMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new HotPixelMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new LensOpticalStabilizationMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new NoiseReductionMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new SensorTestpatternMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new ShadingMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new StatisticsFaceDetectMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new StatisticsLensShadingMapMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new TonemapMode(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new TonemapPresetCurve(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);

        //TODO  해당 주석부분 OOM 이슈 발생함
//        //set
//        option = new ControlAeExposureCompensation(characteristics);
//        allCaptureOption.put(option.getKey().hashCode(), option);
        option = new JpegOrientation(characteristics);
        allCaptureOption.put(option.getKey().hashCode(), option);
//
//        //slide
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            option = new ControlPostRawSensitivityBoost(characteristics);
            allCaptureOption.put(option.getKey().hashCode(), option);
        }
        return allCaptureOption;
    }

    private void logCameraOption(CameraOption cameraOption) {
        StringBuilder sb = new StringBuilder();
        sb.append(cameraOption.getDisplayName()).append("\n");
        sb.append("OptionType : ").append(cameraOption.getOptionType().name()).append("\n");

        List<DetailOptionInfo> detailOptionInfos = cameraOption.getItems();
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
