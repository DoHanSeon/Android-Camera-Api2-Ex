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

public class ColorCorrectionMode extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
        Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (value != null && value == CameraMetadata.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX, "TRANSFORM MATRIX"));
            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_FAST, "FAST"));
            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.COLOR_CORRECTION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "기본색상 -> 선형 sRGB 색상으로 변환되는 방법";
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
