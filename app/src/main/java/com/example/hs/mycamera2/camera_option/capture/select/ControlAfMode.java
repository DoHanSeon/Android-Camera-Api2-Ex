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

public class ControlAfMode extends CameraOption<Integer> {

    public ControlAfMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_OFF, "OFF"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_AUTO, "AUTO"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_MACRO, "MACRO"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO, "CONTINUOUS VIDEO"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE, "CONTINUOUS PICTURE"));
        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_EDOF, "EDOF"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AF_MODE;
    }

    @Override
    public String getDisplayName() {
        return "자동 초점 컨트롤";
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
