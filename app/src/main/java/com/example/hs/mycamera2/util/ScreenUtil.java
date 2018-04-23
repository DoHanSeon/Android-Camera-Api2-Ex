package com.example.hs.mycamera2.util;

import android.util.TypedValue;

import com.example.hs.mycamera2.CameraApplication;

/**
 * Created by user on 2018. 4. 16..
 */

public class ScreenUtil {

    public static float dpToPixel(float dp) {

        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, CameraApplication.getContext().getResources().getDisplayMetrics());
    }
}
