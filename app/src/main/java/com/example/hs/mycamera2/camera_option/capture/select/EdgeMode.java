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

public class EdgeMode extends CameraOption<Integer> {


    @Override
    public void initailize(CameraCharacteristics characteristics) {
        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            return;
        }

        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.EDGE_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.EDGE_MODE_FAST:
                        items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_FAST, "FAST"));
                        break;
                    case CameraMetadata.EDGE_MODE_HIGH_QUALITY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                        break;
                    case CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG:
                        items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.EDGE_MODE;
    }

    @Override
    public String getDisplayName() {
        return "EDGE MODE";
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
