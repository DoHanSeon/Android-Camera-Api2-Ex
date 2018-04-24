package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

/**
 * Created by user on 2018. 4. 24..
 */

public class LensFocalLength extends CameraOption<Float> {

    public LensFocalLength(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        float[] values = characteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (values != null) {
            for (float value : values) {
                items.add(new DetailOptionInfo<>(value, String.valueOf(value)));
            }
        }
    }

    @Override
    public CaptureRequest.Key<Float> getKey() {
        return CaptureRequest.LENS_FOCAL_LENGTH;
    }

    @Override
    public String getDisplayName() {
        return "Lens Focal Length";
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
