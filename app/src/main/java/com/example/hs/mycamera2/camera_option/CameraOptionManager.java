package com.example.hs.mycamera2.camera_option;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.CameraApplication;
import com.example.hs.mycamera2.camera_option.base_option.CameraOption;
import com.example.hs.mycamera2.camera_option.base_option.CheckOption;
import com.example.hs.mycamera2.camera_option.base_option.SelectOption;

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
                cameraKeyMap.put(cameraOption.hashCode(), cameraOption);
                cameraKe
            }
        }



    }

    private Map<Integer, CameraOption> getAllCaptureKey() {
        Map<Integer, CameraOption> map = new HashMap<>();

        for (CameraOption option : CheckOption.values()) {
            map.put(option.hashCode(), option);
        }

        for (CameraOption option : SelectOption.values()) {
            map.put(option.hashCode(), option);
        }
        return map;
    }
}
