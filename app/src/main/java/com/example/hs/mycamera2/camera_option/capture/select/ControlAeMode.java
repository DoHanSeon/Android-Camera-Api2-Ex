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

public class ControlAeMode extends CameraOption<Integer> {


    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_AE_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.CONTROL_AE_MODE_ON:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON, "ON"));
                        break;
                    case CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH, "ON AND AUTO FLASH"));
                        break;
                    case CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH, "ON AND ALWAYS FLASH"));
                        break;
                    case CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE, "ON AND AUTO FLASH RED EYE"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AE_MODE;
    }

    @Override
    public String getDisplayName() {
        return "자동 노출 루틴 모드 설정";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.INTEGER_SELECT;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
