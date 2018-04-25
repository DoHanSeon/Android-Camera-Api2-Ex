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

public class StatisticsLensShadingMapMode extends CameraOption<Integer> {



    @Override
    public void initailize(CameraCharacteristics characteristics) {
        Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
            return;
        }

        int[] values = characteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON:
                        items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON, "ON"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE;
    }

    @Override
    public String getDisplayName() {
        return "Write SHADING MAP information in MetaData";
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
