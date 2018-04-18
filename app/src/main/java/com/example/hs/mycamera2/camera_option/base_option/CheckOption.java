package com.example.hs.mycamera2.camera_option.base_option;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.detail_option.DetailOption;
import com.example.hs.mycamera2.camera_option.OptionType;

/**
 * Created by user on 2018. 4. 18..
 */

public enum CheckOption implements CameraOption {
    CONTROL_AE_LOCK {
        private CaptureRequest.Key<Boolean> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AE_LOCK;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Control AE Lock(자동 노출)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.CHECK;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NONE;
        }
    },
    CONTROL_AWB_LOCK {
        private CaptureRequest.Key<Boolean> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AWB_LOCK;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Control AWB Lock(자동 화이트 밸런스)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.CHECK;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NONE;
        }
    },
    CONTROL_ENABLE_ZSL {
        private CaptureRequest.Key<Boolean> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_ENABLE_ZSL;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Control Enable ZSL(셔터 지연모드??)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.CHECK;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NONE;
        }
    },
    STATISTICS_HOT_PIXEL_MAP_MODE {
        private CaptureRequest.Key<Boolean> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.STATISTICS_HOT_PIXEL_MAP_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "핫 픽셀 맵 생성을위한 작동 모드";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.CHECK;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NONE;
        }
    },
    BLACK_LEVEL_LOCK {
        private CaptureRequest.Key<Boolean> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.BLACK_LEVEL_LOCK;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Black Level 고정/변동 모드";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.CHECK;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NONE;
        }
    },

}
