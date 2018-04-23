package com.example.hs.mycamera2.camera_option.capture.set;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;

/**
 * Created by user on 2018. 4. 20..
 */

public class JpegOrientation extends CameraOption<Integer> {
    public JpegOrientation(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.add(new DetailOptionInfo<>(0, "ROTATION 90"));
        items.add(new DetailOptionInfo<>(90, "ROTATION 0"));
        items.add(new DetailOptionInfo<>(180, "ROTATION 270"));
        items.add(new DetailOptionInfo<>(270, "ROTATION 180"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.JPEG_ORIENTATION;
    }

    @Override
    public String getDisplayName() {
        return "ORIENTATION";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SETTING_VALUE;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
