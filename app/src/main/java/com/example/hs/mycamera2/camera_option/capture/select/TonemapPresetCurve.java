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

public class TonemapPresetCurve extends CameraOption<Integer> {

    public TonemapPresetCurve(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_SRGB, "SRGB"));
        items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_REC709, "REC709"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.TONEMAP_PRESET_CURVE;
    }

    @Override
    public String getDisplayName() {
        return "TONEMAP PRESET CURVE";
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
