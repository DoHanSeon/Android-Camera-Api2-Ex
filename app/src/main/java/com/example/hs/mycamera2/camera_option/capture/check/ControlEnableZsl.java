package com.example.hs.mycamera2.camera_option.capture.check;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlEnableZsl implements CameraOption<Boolean> {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public CaptureRequest.Key<Boolean> getKey() {
        return CaptureRequest.CONTROL_ENABLE_ZSL;
    }

    @Override
    public String getDisplayName() {
        return "Control Enable ZSL(셔터 지연모드??)";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.CHECK;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.NONE;
    }
}
