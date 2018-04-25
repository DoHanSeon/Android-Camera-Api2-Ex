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

public class ControlAwbMode extends CameraOption<Integer> {

    @Override
    public void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_AWB_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_AUTO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_AUTO, "AUTO"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT, "INCANDESCENT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT, "FLUORESCENT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT, "WARM FLUORESCENT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT, "DAYLIGHT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT, "CLOUDY DAYLIGHT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_TWILIGHT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_TWILIGHT, "TWILIGHT"));
                        break;
                    case CameraMetadata.CONTROL_AWB_MODE_SHADE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_SHADE, "SHADE"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_AWB_MODE;
    }

    @Override
    public String getDisplayName() {
        return "Auto White Balance";
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
