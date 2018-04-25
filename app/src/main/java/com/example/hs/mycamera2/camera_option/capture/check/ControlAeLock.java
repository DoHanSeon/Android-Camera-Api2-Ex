package com.example.hs.mycamera2.camera_option.capture.check;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlAeLock extends CameraOption<Boolean> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {

    }

    @Override
    public CaptureRequest.Key<Boolean> getKey() {
        return CaptureRequest.CONTROL_AE_LOCK;
    }

    @Override
    public String getDisplayName() {
        return "Control AE Lock(자동 노출)";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.CHECK;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
