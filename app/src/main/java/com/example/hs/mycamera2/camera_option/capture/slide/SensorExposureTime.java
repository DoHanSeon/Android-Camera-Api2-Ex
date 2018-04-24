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

public class SensorExposureTime extends CameraOption<Long> {

    public SensorExposureTime(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            return;
        }

        Range<Long> range = characteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range != null) {
            Long lower = range.getLower();
            Long upper = range.getUpper();

            if (lower == null || upper == null) {
                return;
            }

            items.add(new DetailOptionInfo<>(lower, "LOWER"));
            items.add(new DetailOptionInfo<>(upper, "UPPER"));
        }
    }

    @Override
    public CaptureRequest.Key<Long> getKey() {
        return CaptureRequest.SENSOR_EXPOSURE_TIME;
    }

    @Override
    public String getDisplayName() {
        return "Sensor Exposure Time";
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
