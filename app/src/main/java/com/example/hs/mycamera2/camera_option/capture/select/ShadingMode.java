package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;

/**
 * Created by user on 2018. 4. 20..
 */

public class ShadingMode extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
//        Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//        if (value != null && value == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_OFF, "OFF"));
            items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_FAST, "FAST"));
            items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_HIGH_QUALITY, "HIGH QUALITY"));
//        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.SHADING_MODE;
    }

    @Override
    public String getDisplayName() {
        return "SHADING MODE";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.INTEGER_SELECT;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
