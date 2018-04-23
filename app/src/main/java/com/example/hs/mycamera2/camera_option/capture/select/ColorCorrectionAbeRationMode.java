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

public class ColorCorrectionAbeRationMode extends CameraOption<Integer> {


    public ColorCorrectionAbeRationMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST:
                        items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST, "FAST"));
                        break;
                    case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "색수차 보정 알고리즘의 작동 모드";
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
