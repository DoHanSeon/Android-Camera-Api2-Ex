package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class ColorCorrectionAbeRationMode implements CameraOption<Integer> {
    private CaptureRequest.Key<Integer> key;

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "색수차 보정 알고리즘의 작동 모드";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.COLOR_CORRECTION_ABERRATION_MODE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
//        return name().toUpperCase();
    }
}
