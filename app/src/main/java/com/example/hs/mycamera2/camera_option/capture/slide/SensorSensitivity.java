package com.example.hs.mycamera2.camera_option.capture.slide;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 24..
 */

public class SensorSensitivity extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
//        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
//            return;
//        }
        items.clear();
        Range<Integer> range = characteristics.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range != null) {
            Integer lower = range.getLower();
            Integer upper = range.getUpper();

            if (lower == null || upper == null) {
                return;
            }

            items.add(new DetailOptionInfo<>(lower, lower.intValue() + ""));
            items.add(new DetailOptionInfo<>(upper, upper.intValue() + ""));
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.SENSOR_SENSITIVITY;
    }

    @Override
    public String getDisplayName() {
        return "Sensor Sensitivity";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.INTEGER_SLIDE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
