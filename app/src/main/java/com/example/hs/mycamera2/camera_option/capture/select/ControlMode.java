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

public class ControlMode extends CameraOption<Integer> {
    public ControlMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.CONTROL_MODE_AUTO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_AUTO, "AUTO"));
                        break;
                    case CameraMetadata.CONTROL_MODE_USE_SCENE_MODE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_USE_SCENE_MODE, "USE SCENE MODE"));
                        break;
                    case CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE, "OFF KEEP STATE"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_MODE;
    }

    @Override
    public String getDisplayName() {
        return "Control Mode";
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
