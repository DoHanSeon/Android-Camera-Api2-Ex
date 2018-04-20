package com.example.hs.mycamera2.camera_option.base_option;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.detail_option.CameraDetailOption;
import com.example.hs.mycamera2.camera_option.detail_option.SlideDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public enum SlideOption implements CameraOption {
    @RequiresApi(api = Build.VERSION_CODES.N)
    CONTROL_POST_RAW_SENSITIVITY_BOOST {
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public CaptureRequest.Key<?> getKey() {
            return CaptureRequest.CONTROL_POST_RAW_SENSITIVITY_BOOST;
        }

        @Override
        public String getDisplayName() {
            return "RAW 센서 데이터를 캡처 한 후 출력 이미지에 적용되는 추가 감도 증가량입니다.";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SLIDE;
        }

        @Override
        public CameraDetailOption getDetailOption() {
            return SlideDetailOption.CONTROL_POST_RAW_SENSITIVITY_BOOST;
        }

        @Override
        public String getDescriptionFilePath() {
            return null;
        }
    }
}
