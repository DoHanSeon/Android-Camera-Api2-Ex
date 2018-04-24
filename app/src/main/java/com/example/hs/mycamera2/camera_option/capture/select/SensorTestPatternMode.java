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

public class SensorTestPatternMode extends CameraOption<Integer> {
    public SensorTestPatternMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        int[] values = characteristics.get(CameraCharacteristics.SENSOR_AVAILABLE_TEST_PATTERN_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR, "SOLID COLOR"));
                        break;
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS, "COLOR BARS"));
                        break;
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY, "COLOR BARS FADE TO GRAY"));
                        break;
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9, "PN9"));
                        break;
                    case CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1:
                        items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1, "CUSTOM1"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.SENSOR_TEST_PATTERN_MODE;
    }

    @Override
    public String getDisplayName() {
        return "SENSOR TEST PATTERN MODE";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
