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

public class FlashMode extends CameraOption<Integer> {
    public FlashMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_OFF, "OFF"));
        items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_SINGLE, "SINGLE"));
        items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_TORCH, "TORCH"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.FLASH_MODE;
    }

    @Override
    public String getDisplayName() {
        return "FLASH MODE";
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
