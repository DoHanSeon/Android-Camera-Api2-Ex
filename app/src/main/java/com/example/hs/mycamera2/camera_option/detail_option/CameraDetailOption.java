package com.example.hs.mycamera2.camera_option.detail_option;

import android.hardware.camera2.CameraCharacteristics;

import java.util.List;

/**
 * Created by user on 2018. 4. 18..
 */

public interface CameraDetailOption {
    List<DetailOptionInfo> getDetailOptionInfos();
    void initAvailableOption(CameraCharacteristics characteristics);
}
