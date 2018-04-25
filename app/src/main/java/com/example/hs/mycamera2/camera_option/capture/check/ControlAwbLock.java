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

public class ControlAwbLock extends CameraOption<Boolean> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
    }

    @Override
    public CaptureRequest.Key<Boolean> getKey() {
        return CaptureRequest.CONTROL_AWB_LOCK;
    }

    @Override
    public String getDisplayName() {
        return "Control AWB Lock(자동 화이트 밸런스)";
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
