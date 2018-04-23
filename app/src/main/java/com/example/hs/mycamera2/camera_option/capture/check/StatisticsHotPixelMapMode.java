package com.example.hs.mycamera2.camera_option.capture.check;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 20..
 */

public class StatisticsHotPixelMapMode extends CameraOption<Boolean> {
    public StatisticsHotPixelMapMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {

    }

    @Override
    public CaptureRequest.Key<Boolean> getKey() {
        return CaptureRequest.STATISTICS_HOT_PIXEL_MAP_MODE;
    }

    @Override
    public String getDisplayName() {
        return "핫 픽셀 맵 생성을위한 작동 모드";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.CHECK;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
