package com.example.hs.mycamera2.camera_option;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

import com.example.hs.mycamera2.CameraApplication;
import com.example.hs.mycamera2.camera_option.base_option.CameraOption;
import com.example.hs.mycamera2.camera_option.base_option.CheckOption;
import com.example.hs.mycamera2.camera_option.base_option.SelectOption;
import com.example.hs.mycamera2.camera_option.detail_option.DetailOption;
import com.example.hs.mycamera2.camera_option.detail_option.DetailOptionInfo;

import java.util.ArrayList;
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

    private Map<Integer, CameraOption> cameraKeyMap = new HashMap<>();

    private CameraOptionManager() {
    }

    public void initialize(String cameraId) throws CameraAccessException {
        CameraManager manager =(CameraManager) CameraApplication.getContext().getSystemService(Context.CAMERA_SERVICE);
        CameraCharacteristics character = manager.getCameraCharacteristics(cameraId);

        Map<Integer, CameraOption> keyMap = getAllCaptureKey();
        List<CaptureRequest.Key<?>> availableKeys = character.getAvailableCaptureRequestKeys();

        for (CaptureRequest.Key<?> key : availableKeys) {
            CameraOption cameraOption = keyMap.get(key.hashCode());
            if (cameraOption != null) {
                //TODO available value
                cameraOption.getDetailOption().initAvailableOption(character);
                cameraKeyMap.put(cameraOption.hashCode(), cameraOption);
                logCameraOption(cameraOption);
            }
        }



    }

    private Map<Integer, CameraOption> getAllCaptureKey() {
        Map<Integer, CameraOption> map = new HashMap<>();

        for (CameraOption option : CheckOption.values()) {
            map.put(option.getKey().hashCode(), option);
        }

        for (CameraOption option : SelectOption.values()) {
            map.put(option.getKey().hashCode(), option);
        }
        return map;
    }

    private void logCameraOption(CameraOption cameraOption) {
        StringBuilder sb = new StringBuilder();
        sb.append(cameraOption.getDisplayName()).append("\n");
        sb.append("OptionType : ").append(cameraOption.getOptionType().name()).append("\n");

        List<DetailOptionInfo> detailOptionInfos = cameraOption.getDetailOption().getDetailOptionInfos();
        if (detailOptionInfos != null && detailOptionInfos.size() > 0) {
            sb.append("Detail Option exist - " + detailOptionInfos.size()).append("EA").append("\n");
        } else {
            sb.append("Detail Option not exist").append("\n");
        }
        Log.d("hanseon--", sb.toString());


    }
}
