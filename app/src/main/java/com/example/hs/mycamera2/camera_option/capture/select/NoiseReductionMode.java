package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class NoiseReductionMode implements CameraOption<Integer> {
    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.NOISE_REDUCTION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "NOISE REDUCTION MODE(노이즈 감소 알고리즘 동작모드)";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.NOISE_REDUCTION_MODE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
