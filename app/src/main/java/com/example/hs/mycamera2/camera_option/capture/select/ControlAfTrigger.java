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

public class ControlAfTrigger extends CameraOption<Integer> {

    public ControlAfTrigger(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_IDLE, "IDLE"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_START, "START"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_CANCEL, "CANCEL"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AF_TRIGGER;
    }

    @Override
    public String getDisplayName() {
        return "Auto Focus Trigger";
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
