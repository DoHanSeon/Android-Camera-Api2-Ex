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

public class ControlCaptureIntent extends CameraOption<Integer> {

    public ControlCaptureIntent(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM, "CUSTOM"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW, "PREVIEW"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE, "STILL CAPTURE"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD, "VIDEO RECORD"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT, "VIDEO SNAPSHOT"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                        break;
                    case CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL, "MENUAL"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_CAPTURE_INTENT;
    }

    @Override
    public String getDisplayName() {
        return "3A(AE, AF, AWB) Strategy";
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
