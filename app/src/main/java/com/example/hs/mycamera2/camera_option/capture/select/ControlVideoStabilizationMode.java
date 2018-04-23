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

public class ControlVideoStabilizationMode extends CameraOption<Integer> {

    public ControlVideoStabilizationMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_OFF, "OFF"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_ON, "ON"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "VIDEO STABILIZATION MODE(비디오 안정화모드)";
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
