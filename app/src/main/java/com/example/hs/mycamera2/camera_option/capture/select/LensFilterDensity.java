package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 24..
 */

public class LensFilterDensity extends CameraOption<Float> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
//        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
//            return;
//        }
        items.clear();
        float[] values = characteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FILTER_DENSITIES);
        if (values != null) {
            for (float value : values) {
                items.add(new DetailOptionInfo<>(value, String.valueOf(value)));
            }
        }
    }

    @Override
    public CaptureRequest.Key<Float> getKey() {
        return CaptureRequest.LENS_FILTER_DENSITY;
    }

    @Override
    public String getDisplayName() {
        return "Lens Filter Density";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.FLOAT_SELECT;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
