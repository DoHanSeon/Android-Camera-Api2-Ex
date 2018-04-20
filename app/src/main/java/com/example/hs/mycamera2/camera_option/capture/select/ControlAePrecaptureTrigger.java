package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlAePrecaptureTrigger implements CameraOption<Integer> {
    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
    }

    @Override
    public String getDisplayName() {
        return "CONTROL_AE_PRECAPTURE_TRIGGER";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.CONTROL_AE_PRECAPTURE_TRIGGER;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
