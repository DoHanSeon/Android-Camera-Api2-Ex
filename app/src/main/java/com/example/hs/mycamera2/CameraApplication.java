package com.example.hs.mycamera2;

import android.app.Application;
import android.content.Context;

/**
 * Created by user on 2018. 4. 16..
 */

public class CameraApplication extends Application {

    private static CameraApplication INSTANCE;

    public static Context getContext() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
