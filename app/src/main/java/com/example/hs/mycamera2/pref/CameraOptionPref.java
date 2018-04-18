package com.example.hs.mycamera2.pref;

import android.content.Context;
import android.util.Log;

import com.example.hs.mycamera2.option.CameraAllOption;

/**
 * Created by user on 2018. 4. 17..
 */

public class CameraOptionPref extends BaseSharedPref {
    public static final String PREFERENCE_NAME = "camera_option";

    private static CameraOptionPref instance;

    private CameraOptionPref() {
        super(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static CameraOptionPref getInstance() {
        if (instance == null) {
            instance = new CameraOptionPref();
        }
        return instance;
    }

    public void setValue(CameraAllOption.Subject subject, Object value) {
        switch (subject.getType()) {
            case CHECK:
                setBooleanOption(subject, (Boolean) value);
                break;
            case SELECT:
                setIntegerOption(subject, (Integer) value);
                break;
            case FLOAT_INPUT:
                setFloatOption(subject, (Float) value);
                break;
            case LONG_INPUT:
                setLongOption(subject, (Long) value);
                break;
            default:
                Log.d("hanseon--", "setValue subject type not defined");
        }
    }

    private void setBooleanOption(CameraAllOption.Subject subject, boolean value) {
        if (subject.getType() != CameraAllOption.Type.CHECK) {
            return;
        }
        put(subject.name(), value);
    }

    private void setIntegerOption(CameraAllOption.Subject subject, int value) {
        if (subject.getType() != CameraAllOption.Type.SELECT) {
            return;
        }
        put(subject.name(), value);
    }

    private void setFloatOption(CameraAllOption.Subject subject, float value) {
        if (subject.getType() != CameraAllOption.Type.FLOAT_INPUT) {
            return;
        }
        put(subject.name(), value);
    }

    private void setLongOption(CameraAllOption.Subject subject, long value) {
        if (subject.getType() != CameraAllOption.Type.LONG_INPUT) {
            return;
        }
        put(subject.name(), value);
    }
}
