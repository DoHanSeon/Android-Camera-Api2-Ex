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

public class StatisticsFaceDetectMode extends CameraOption<Integer> {
    public StatisticsFaceDetectMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        int[] values = characteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF:
                        items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF, "OFF"));
                        break;
                    case CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE, "SIMPLE"));
                        break;
                    case CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL:
                        items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL, "FULL"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.STATISTICS_FACE_DETECT_MODE;
    }

    @Override
    public String getDisplayName() {
        return "STATISTICS FACE DETECT MODE";
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
