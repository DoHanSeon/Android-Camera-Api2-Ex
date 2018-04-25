package com.example.hs.mycamera2.camera_option.capture.set;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlAeExposureCompensation extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
        Range<Integer> range = characteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
//        Rational rational = characteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);

        Integer lower = range.getLower();
        Integer upper = range.getUpper();
        if (lower == null || upper == null) {
            return;
        }

        items.add(new DetailOptionInfo<>(lower, "LOWER"));
        items.add(new DetailOptionInfo<>(upper, "UPPER"));
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
    }

    @Override
    public String getDisplayName() {
        return "AE Exposure (자동 노출 밝기 조절)";
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
