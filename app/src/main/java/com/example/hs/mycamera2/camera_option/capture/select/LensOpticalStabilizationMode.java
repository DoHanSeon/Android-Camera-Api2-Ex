package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.SelectDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class LensOpticalStabilizationMode implements CameraOption<Integer> {
    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "OIS MODE(광학 이미지 안정화)";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public SelectDetailOption getDetailOption() {
        return SelectDetailOption.LENS_OPTICAL_STABILIZATION_MODE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
