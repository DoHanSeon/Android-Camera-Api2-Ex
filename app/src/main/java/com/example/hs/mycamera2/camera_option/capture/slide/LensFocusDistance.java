package com.example.hs.mycamera2.camera_option.capture.slide;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 24..
 */

public class LensFocusDistance extends CameraOption<Float> {

    private static final float MIN_VALUE = 0.0f;
    private static final float MAX_VALUE = 10.0f;

    public LensFocusDistance(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            return;
        }
        items.clear();
        items.add(new DetailOptionInfo<>(MIN_VALUE, (String.valueOf(MIN_VALUE) + "(default)")));
        items.add(new DetailOptionInfo<>(MAX_VALUE, String.valueOf(MAX_VALUE)));

    }

    @Override
    public CaptureRequest.Key<Float> getKey() {
        return CaptureRequest.LENS_FOCUS_DISTANCE;
    }

    @Override
    public String getDisplayName() {
        return "Lens Focus Distance";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SLIDE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
