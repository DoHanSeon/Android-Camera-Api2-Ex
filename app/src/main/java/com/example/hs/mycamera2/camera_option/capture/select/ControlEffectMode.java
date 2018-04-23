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

public class ControlEffectMode extends CameraOption<Integer> {

    public ControlEffectMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_EFFECTS);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_EFFECT_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_MONO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_MONO, "MONO"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE, "NEGATIVE"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE, "SOLARIZE"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_SEPIA:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SEPIA, "SEPIA"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE, "POSTERIZE"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD, "WHITEBOARD"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD, "BLACKBOARD"));
                        break;
                    case CameraMetadata.CONTROL_EFFECT_MODE_AQUA:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_AQUA, "AQUA"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_EFFECT_MODE;
    }

    @Override
    public String getDisplayName() {
        return "Effect Mode";
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
