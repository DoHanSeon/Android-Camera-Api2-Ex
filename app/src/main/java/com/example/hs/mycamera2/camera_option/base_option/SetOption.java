package com.example.hs.mycamera2.camera_option.base_option;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.detail_option.CameraDetailOption;
import com.example.hs.mycamera2.camera_option.detail_option.SetDetailOption;

/**
 * Created by user on 2018. 4. 20..
 */

public enum  SetOption implements CameraOption {
    CONTROL_AE_EXPOSURE_COMPENSATION {
        @Override
        public CaptureRequest.Key<?> getKey() {
            return CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        }

        @Override
        public String getDisplayName() {
            return "AE Exposure (자동 노출 밝기 조절)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SETTING_VALUE;
        }

        @Override
        public CameraDetailOption getDetailOption() {
            return SetDetailOption.CONTROL_AE_EXPOSURE_COMPENSATION;
        }

        @Override
        public String getDescriptionFilePath() {
            return null;
        }
    },
    JPEG_ORIENTATION {
        @Override
        public CaptureRequest.Key<?> getKey() {
            return CaptureRequest.JPEG_ORIENTATION;
        }

        @Override
        public String getDisplayName() {
            return "ORIENTATION";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SETTING_VALUE;
        }

        @Override
        public CameraDetailOption getDetailOption() {
            return SetDetailOption.JPEG_ORIENTATION;
        }

        @Override
        public String getDescriptionFilePath() {
            return null;
        }
    }
}
