package com.example.hs.mycamera2.camera_option.base_option;

import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.OptionType;
import com.example.hs.mycamera2.camera_option.detail_option.DetailOption;

/**
 * Created by user on 2018. 4. 18..
 */

public enum SelectOption implements CameraOption {
    COLOR_CORRECTION_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.COLOR_CORRECTION_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "기본색상 -> 선형 sRGB 색상으로 변환되는 방법";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.COLOR_CORRECTION_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return null;
        }
    },
    COLOR_CORRECTION_ABERRATION_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "색수차 보정 알고리즘의 작동 모드";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.COLOR_CORRECTION_ABERRATION_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AE_ANTIBANDING_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AE_ANTIBANDING_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "자동 노출 알고리즘 보정";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AE_ANTIBANDING_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AE_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AE_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "자동 노출 루틴 모드 설정";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AE_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AE_PRECAPTURE_TRIGGER {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "CONTROL_AE_PRECAPTURE_TRIGGER";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AE_PRECAPTURE_TRIGGER;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AF_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AF_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "자동 초점 컨트롤";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AF_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AF_TRIGGER {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AF_TRIGGER;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Auto Focus Trigger";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AF_TRIGGER;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_AWB_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_AWB_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Auto White Balance";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_AWB_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_CAPTURE_INTENT {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_CAPTURE_INTENT;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "3A(AE, AF, AWB) Strategy";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_CAPTURE_INTENT;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_EFFECT_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_EFFECT_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Effect Mode";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_EFFECT_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Control Mode";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_SCENE_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_SCENE_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "SCENE MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_SCENE_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    CONTROL_VIDEO_STABILIZATION_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "VIDEO STABILIZATION MODE(비디오 안정화모드)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.CONTROL_VIDEO_STABILIZATION_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    EDGE_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.EDGE_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "EDGE MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.EDGE_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    FLASH_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.FLASH_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "FLASH MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.FLASH_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    HOT_PIXEL_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.HOT_PIXEL_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "HOT PIXEL MODE(핫 픽셀 보정)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.HOT_PIXEL_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    LENS_OPTICAL_STABILIZATION_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "OIS MODE(광학 이미지 안정화)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.LENS_OPTICAL_STABILIZATION_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    NOISE_REDUCTION_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.NOISE_REDUCTION_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "NOISE REDUCTION MODE(노이즈 감소 알고리즘 동작모드)";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.NOISE_REDUCTION_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    STATISTICS_LENS_SHADING_MAP_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Write SHADING MAP information in MetaData";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.STATISTICS_LENS_SHADING_MAP_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    TONEMAP_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.TONEMAP_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "Control High-level global contrast/gamma/tonemapping";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.TONEMAP_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    SHADING_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.SHADING_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "SHADING MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.SHADING_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    SENSOR_TEST_PATTERN_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.SENSOR_TEST_PATTERN_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "SENSOR TEST PATTERN MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.SENSOR_TEST_PATTERN_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    STATISTICS_FACE_DETECT_MODE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.STATISTICS_FACE_DETECT_MODE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "STATISTICS FACE DETECT MODE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.STATISTICS_FACE_DETECT_MODE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    },
    TONEMAP_PRESET_CURVE {
        private CaptureRequest.Key<Integer> key;

        @Override
        public CaptureRequest.Key<?> getKey() {
            if (key == null) {
                key = CaptureRequest.TONEMAP_PRESET_CURVE;
            }
            return key;
        }

        @Override
        public String getDisplayName() {
            return "TONEMAP PRESET CURVE";
        }

        @Override
        public OptionType getOptionType() {
            return OptionType.SELECT;
        }

        @Override
        public DetailOption getDetailOption() {
            return DetailOption.TONEMAP_PRESET_CURVE;
        }

        @Override
        public String getDescriptionFilePath() {
            return name().toUpperCase();
        }
    };
}