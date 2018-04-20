package com.example.hs.mycamera2.camera_option;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.detail_option.CameraDetailOption;
import com.example.hs.mycamera2.camera_option.OptionType;

/**
 * Created by user on 2018. 4. 18..
 */

public interface CameraOption<T> {

    CaptureRequest.Key<T> getKey();

    String getDisplayName();
    OptionType getOptionType();
    CameraDetailOption getDetailOption();

    //location is asset folder
    String getDescriptionFilePath();
}
