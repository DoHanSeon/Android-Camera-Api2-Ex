package com.example.hs.mycamera2.camera_option.detail_option;

import android.hardware.camera2.CameraMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018. 4. 18..
 */

public enum DetailOption implements CameraDetailOption {
    NONE {
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return null;
        }
    },
    COLOR_CORRECTION_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX, "TRANSFORM MATRIX"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
            return items;
        }
    },
    COLOR_CORRECTION_ABERRATION_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
            return items;
        }
    },
    CONTROL_AE_ANTIBANDING_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ, "50HZ"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ, "60HZ"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO, "AUTO"));
            }
            return items;
        }
    },
    CONTROL_AE_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON, "ON"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH, "ON AND AUTO FLASH"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH, "ON AND ALWAYS FLASH"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE, "ON AND AUTO FLASH RED EYE"));
            }
            return items;
        }
    },
    CONTROL_AE_PRECAPTURE_TRIGGER {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE, "IDLE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START, "START"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL, "CANCEL"));
            }
            return items;
        }
    },
    CONTROL_AF_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_AUTO, "AUTO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_MACRO, "MACRO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO, "CONTINUOUS VIDEO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE, "CONTINUOUS PICTURE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_EDOF, "EDOF"));
            }
            return items;
        }
    },
    CONTROL_AF_TRIGGER {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_IDLE, "IDLE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_START, "START"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_CANCEL, "CANCEL"));
            }
            return items;
        }
    },
    CONTROL_AWB_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_AUTO, "AUTO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT, "INCANDESCENT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT, "FLUORESCENT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT, "WARM FLUORESCENT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT, "DAYLIGHT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT, "CLOUDY DAYLIGHT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_TWILIGHT, "TWILIGHT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_SHADE, "SHADE"));
            }
            return items;
        }
    },
    CONTROL_CAPTURE_INTENT {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM, "CUSTOM"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW, "PREVIEW"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE, "STILL CAPTURE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD, "VIDEO RECORD"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT, "VIDEO SNAPSHOT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL, "MENUAL"));
            }
            return items;
        }
    },
    CONTROL_EFFECT_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_MONO, "MONO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE, "NEGATIVE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE, "SOLARIZE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SEPIA, "SEPIA"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE, "POSTERIZE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD, "WHITEBOARD"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD, "BLACKBOARD"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_AQUA, "AQUA"));
            }
            return items;
        }
    },
    CONTROL_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_AUTO, "AUTO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_USE_SCENE_MODE, "USE SCENE MODE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE, "OFF KEEP STATE"));
            }
            return items;
        }
    },
    CONTROL_SCENE_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_DISABLED, "DISABLED"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY, "FACE PRIORITY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_ACTION, "ACTION"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT, "PORTRAIT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE, "LANDSCAPE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT, "NIGHT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT, "NIGHT PORTRAIT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_THEATRE, "THEATRE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BEACH, "BEACH"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SNOW, "SNOW"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SUNSET, "SUNSET"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO, "STEADYPHOTO"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS, "FIREWORKS"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SPORTS, "SPORTS"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PARTY, "PARTY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT, "CANDLELIGHT"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BARCODE, "BARCODE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO, "HIGH SPEED VIDEO (Deprecated)"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HDR, "HDR"));
            }
            return items;
        }
    },
    CONTROL_VIDEO_STABILIZATION_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_ON, "ON"));
            }
            return items;
        }
    },
    EDGE_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
            }
            return items;
        }
    },
    FLASH_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_SINGLE, "SINGLE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_TORCH, "TORCH"));
            }
            return items;
        }
    },
    HOT_PIXEL_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
            return items;
        }
    },
    LENS_OPTICAL_STABILIZATION_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON, "ON"));
            }
            return items;
        }
    },
    NOISE_REDUCTION_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_MINIMAL, "MINIMAL"));
                items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
            }
            return items;
        }
    },
    STATISTICS_LENS_SHADING_MAP_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON, "ON"));
            }
            return items;
        }
    },
    TONEMAP_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_CONTRAST_CURVE, "CONTRAST CURVE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_GAMMA_VALUE, "GAMMA VALUE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_PRESET_CURVE, "PRESET CURVE"));
            }
            return items;
        }
    },
    SHADING_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
            return items;
        }
    },
    SENSOR_TEST_PATTERN_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR, "SOLID COLOR"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS, "COLOR BARS"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY, "COLOR BARS FADE TO GRAY"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9, "PN9"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1, "CUSTOM1"));
            }
            return items;
        }
    },
    STATISTICS_FACE_DETECT_MODE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE, "SIMPLE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL, "FULL"));
            }
            return items;
        }
    },
    TONEMAP_PRESET_CURVE {
        private List<DetailOptionInfo> items;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_SRGB, "SRGB"));
                items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_REC709, "REC709"));
            }
            return items;
        }
    };
}