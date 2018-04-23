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

public class HotPixelMode extends CameraOption<Integer> {
    public HotPixelMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.HOT_PIXEL_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.HOT_PIXEL_MODE_FAST:
                        items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_FAST, "FAST"));
                        break;
                    case CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.HOT_PIXEL_MODE;
    }

    @Override
    public String getDisplayName() {
        return "HOT PIXEL MODE(핫 픽셀 보정)";
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
