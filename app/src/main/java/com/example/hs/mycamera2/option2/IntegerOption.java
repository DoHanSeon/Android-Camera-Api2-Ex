package com.example.hs.mycamera2.option2;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.option.CameraAllOption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018. 4. 17..
 */

public class IntegerOption extends Option<Integer> {

    private List<Info> values = new ArrayList<>();

    public IntegerOption(CaptureRequest.Key key) {
        super(key);
    }

    @Override
    public List<Info> getAvailableValue() {
        return values;
    }

    @Override
    public void setAvailableValue(List<Info> value) {
        values.addAll(value);
    }
}
