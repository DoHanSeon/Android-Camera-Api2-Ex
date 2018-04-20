package com.example.hs.mycamera2.camera_option.capture.set;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.detail_option.CameraDetailOption;
import com.example.hs.mycamera2.camera_option.detail_option.SetDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public class JpegOrientation implements CameraOption<Integer> {
    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.JPEG_ORIENTATION;
    }

    @Override
    public String getDisplayName() {
        return "ORIENTATION";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SETTING_VALUE;
    }

    @Override
    public CameraDetailOption getDetailOption() {
        return SetDetailOption.JPEG_ORIENTATION;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
