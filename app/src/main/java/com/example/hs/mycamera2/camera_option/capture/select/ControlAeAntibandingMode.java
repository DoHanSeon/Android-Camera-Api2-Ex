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

public class ControlAeAntibandingMode extends CameraOption<Integer> {
    public ControlAeAntibandingMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ, "50HZ"));
                        break;
                    case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ, "60HZ"));
                        break;
                    case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO, "AUTO"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AE_ANTIBANDING_MODE;
    }

    @Override
    public String getDisplayName() {
        return "자동 노출 알고리즘 보정";
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
