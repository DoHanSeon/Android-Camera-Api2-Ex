package com.example.hs.mycamera2.camera_option.capture.slide;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 24..
 */

public class TonemapGamma extends CameraOption<Float> {

    private static final float MIN_VALUE = 1.0f;
    private static final float MAX_VALUE = 5.0f;

    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
        items.add(new DetailOptionInfo<>(MIN_VALUE, (String.valueOf(MIN_VALUE) + "(default)")));
        items.add(new DetailOptionInfo<>(MAX_VALUE, String.valueOf(MAX_VALUE)));
    }

    @Override
    public CaptureRequest.Key<Float> getKey() {
        return CaptureRequest.TONEMAP_GAMMA;
    }

    @Override
    public String getDisplayName() {
        return "Tonemap Gamma";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.FLOAT_SLIDE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
