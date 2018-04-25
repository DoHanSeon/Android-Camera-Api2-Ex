package com.example.hs.mycamera2.camera_option;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.camera_option.capture.OptionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018. 4. 18..
 */

public abstract class CameraOption<T> {

    protected List<DetailOptionInfo<T>> items = new ArrayList<>();

    public abstract void initailize(CameraCharacteristics characteristics);

    public abstract CaptureRequest.Key<T> getKey();
    public abstract String getDisplayName();
    public abstract OptionType getOptionType();


    //location is asset folder
    public abstract String getDescriptionFilePath();

    public List<DetailOptionInfo<T>> getItems() {
        return items;
    }
}
