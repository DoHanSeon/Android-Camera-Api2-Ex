package com.example.hs.mycamera2.option2;

import android.hardware.camera2.CaptureRequest;

import java.util.List;

/**
 * Created by user on 2018. 4. 17..
 */

public class BooleanOption extends Option<Boolean> {

    public BooleanOption(CaptureRequest.Key key) {
        super(key);
    }

    @Override
    public List<Info> getAvailableValue() {
        return null;
    }
}
