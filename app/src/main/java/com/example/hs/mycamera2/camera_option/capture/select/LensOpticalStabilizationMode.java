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

public class LensOpticalStabilizationMode extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
//        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//        if (hardwareLevel != null && hardwareLevel == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED) {
            int[] values = characteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON:
                            items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON, "ON"));
                            break;
                    }
                }

            }
//        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
    }

    @Override
    public String getDisplayName() {
        return "OIS MODE(광학 이미지 안정화)";
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
