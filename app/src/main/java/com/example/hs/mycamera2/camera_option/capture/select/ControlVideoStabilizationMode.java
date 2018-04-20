package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlVideoStabilizationMode implements CameraOption<Integer> {
    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "VIDEO STABILIZATION MODE(비디오 안정화모드)";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.CONTROL_VIDEO_STABILIZATION_MODE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
