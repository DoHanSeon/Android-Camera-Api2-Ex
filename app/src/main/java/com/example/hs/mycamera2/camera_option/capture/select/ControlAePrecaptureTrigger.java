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

public class ControlAePrecaptureTrigger extends CameraOption<Integer> {



    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
        Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (value != null && value == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED) {
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE, "IDLE"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START, "START"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL, "CANCEL"));
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
    }

    @Override
    public String getDisplayName() {
        return "CONTROL_AE_PRECAPTURE_TRIGGER";
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
