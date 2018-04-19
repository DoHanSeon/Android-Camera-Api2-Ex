package com.example.hs.mycamera2.camera_option.detail_option;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
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

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            //do nothing
        }
    },
    COLOR_CORRECTION_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (value != null && value == CameraMetadata.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX, "TRANSFORM MATRIX"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
        }
    },
    COLOR_CORRECTION_ABERRATION_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST:
                            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST, "FAST"));
                            break;
                        case CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_AE_ANTIBANDING_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ, "50HZ"));
                            break;
                        case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ, "60HZ"));
                            break;
                        case CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO, "AUTO"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_AE_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_AE_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.CONTROL_AE_MODE_ON:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON, "ON"));
                            break;
                        case CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH, "ON AND AUTO FLASH"));
                            break;
                        case CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH, "ON AND ALWAYS FLASH"));
                            break;
                        case CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE, "ON AND AUTO FLASH RED EYE"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_AE_PRECAPTURE_TRIGGER {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (value != null && value == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED) {
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE, "IDLE"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START, "START"));
                items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL, "CANCEL"));
            }
        }
    },
    CONTROL_AF_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_OFF, "OFF"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_AUTO, "AUTO"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_MACRO, "MACRO"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO, "CONTINUOUS VIDEO"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE, "CONTINUOUS PICTURE"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_MODE_EDOF, "EDOF"));
        }
    },
    CONTROL_AF_TRIGGER {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_IDLE, "IDLE"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_START, "START"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AF_TRIGGER_CANCEL, "CANCEL"));
        }
    },
    CONTROL_AWB_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
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

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_AWB_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_AUTO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_AUTO, "AUTO"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT, "INCANDESCENT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT, "FLUORESCENT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT, "WARM FLUORESCENT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT, "DAYLIGHT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT, "CLOUDY DAYLIGHT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_TWILIGHT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_TWILIGHT, "TWILIGHT"));
                            break;
                        case CameraMetadata.CONTROL_AWB_MODE_SHADE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_AWB_MODE_SHADE, "SHADE"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_CAPTURE_INTENT {
        private List<DetailOptionInfo> items = new ArrayList<>();;
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM, "CUSTOM"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW, "PREVIEW"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE, "STILL CAPTURE"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD, "VIDEO RECORD"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT, "VIDEO SNAPSHOT"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                            break;
                        case CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL, "MENUAL"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_EFFECT_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_EFFECTS);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_EFFECT_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_MONO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_MONO, "MONO"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE, "NEGATIVE"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE, "SOLARIZE"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_SEPIA:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_SEPIA, "SEPIA"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE, "POSTERIZE"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD, "WHITEBOARD"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD, "BLACKBOARD"));
                            break;
                        case CameraMetadata.CONTROL_EFFECT_MODE_AQUA:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_EFFECT_MODE_AQUA, "AQUA"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.CONTROL_MODE_AUTO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_AUTO, "AUTO"));
                            break;
                        case CameraMetadata.CONTROL_MODE_USE_SCENE_MODE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_USE_SCENE_MODE, "USE SCENE MODE"));
                            break;
                        case CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE, "OFF KEEP STATE"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_SCENE_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.CONTROL_SCENE_MODE_DISABLED:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_DISABLED, "DISABLED"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY, "FACE PRIORITY"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_ACTION:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_ACTION, "ACTION"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT, "PORTRAIT"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE, "LANDSCAPE"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_NIGHT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT, "NIGHT"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT, "NIGHT PORTRAIT"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_THEATRE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_THEATRE, "THEATRE"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_BEACH:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BEACH, "BEACH"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_SNOW:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SNOW, "SNOW"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_SUNSET:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SUNSET, "SUNSET"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO, "STEADYPHOTO"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS, "FIREWORKS"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_SPORTS:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SPORTS, "SPORTS"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_PARTY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PARTY, "PARTY"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT, "CANDLELIGHT"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_BARCODE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BARCODE, "BARCODE"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO, "HIGH SPEED VIDEO (Deprecated)"));
                            break;
                        case CameraMetadata.CONTROL_SCENE_MODE_HDR:
                            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HDR, "HDR"));
                            break;
                    }
                }
            }
        }
    },
    CONTROL_VIDEO_STABILIZATION_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_OFF, "OFF"));
            items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_ON, "ON"));
        }
    },
    EDGE_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                return;
            }

            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.EDGE_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.EDGE_MODE_FAST:
                            items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_FAST, "FAST"));
                            break;
                        case CameraMetadata.EDGE_MODE_HIGH_QUALITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                            break;
                        case CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG:
                            items.add(new DetailOptionInfo<>(CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                            break;
                    }
                }
            }
        }
    },
    FLASH_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_OFF, "OFF"));
            items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_SINGLE, "SINGLE"));
            items.add(new DetailOptionInfo<>(CameraMetadata.FLASH_MODE_TORCH, "TORCH"));
        }
    },
    HOT_PIXEL_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            int[] values = characteristics.get(CameraCharacteristics.HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.HOT_PIXEL_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.HOT_PIXEL_MODE_FAST:
                            items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_FAST, "FAST"));
                            break;
                        case CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                            break;
                    }
                }
            }
        }
    },
    LENS_OPTICAL_STABILIZATION_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.clear();
            Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (hardwareLevel != null && hardwareLevel == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED) {
                int[] values = characteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                if (values != null && values.length > 0) {
                    for (int value : values) {
                        switch (value) {
                            case CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF:
                                items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF, "OFF"));
                                break;
                            case CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON:
                                items.add(new DetailOptionInfo<>(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON, "ON"));
                                break;
                        }
                    }

                }
            }
        }
    },
    NOISE_REDUCTION_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            if (items == null) {
                items = new ArrayList<>();
            }
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                return;
            }

            int[] values = characteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.NOISE_REDUCTION_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_OFF, "OFF"));
                        case CameraMetadata.NOISE_REDUCTION_MODE_FAST:
                            items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_FAST, "FAST"));
                            break;
                        case CameraMetadata.NOISE_REDUCTION_MODE_HIGH_QUALITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                            break;
                        case CameraMetadata.NOISE_REDUCTION_MODE_MINIMAL:
                            items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_MINIMAL, "MINIMAL"));
                            break;
                        case CameraMetadata.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG:
                            items.add(new DetailOptionInfo<>(CameraMetadata.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG, "ZERO SHUTTER LAG"));
                            break;
                    }
                }
            }
        }
    },
    STATISTICS_LENS_SHADING_MAP_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                return;
            }

            int[] values = characteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON:
                            items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON, "ON"));
                            break;
                    }
                }
            }
        }
    },
    TONEMAP_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            Integer hardwareLevel = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (hardwareLevel == null || hardwareLevel != CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                return;
            }

            int[] values = characteristics.get(CameraCharacteristics.TONEMAP_AVAILABLE_TONE_MAP_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.TONEMAP_MODE_CONTRAST_CURVE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_CONTRAST_CURVE, "CONTRAST CURVE"));
                            break;
                        case CameraMetadata.TONEMAP_MODE_FAST:
                            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_FAST, "FAST"));
                            break;
                        case CameraMetadata.TONEMAP_MODE_HIGH_QUALITY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_HIGH_QUALITY, "HIGH QUALITY"));
                            break;
                        case CameraMetadata.TONEMAP_MODE_GAMMA_VALUE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_GAMMA_VALUE, "GAMMA VALUE"));
                            break;
                        case CameraMetadata.TONEMAP_MODE_PRESET_CURVE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_MODE_PRESET_CURVE, "PRESET CURVE"));
                            break;
                    }
                }
            }
        }
    },
    SHADING_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            Integer value = characteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (value != null && value == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_OFF, "OFF"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_FAST, "FAST"));
                items.add(new DetailOptionInfo<>(CameraMetadata.SHADING_MODE_HIGH_QUALITY, "HIGH QUALITY"));
            }
        }
    },
    SENSOR_TEST_PATTERN_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            int[] values = characteristics.get(CameraCharacteristics.SENSOR_AVAILABLE_TEST_PATTERN_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR, "SOLID COLOR"));
                            break;
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS, "COLOR BARS"));
                            break;
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY, "COLOR BARS FADE TO GRAY"));
                            break;
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9, "PN9"));
                            break;
                        case CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1:
                            items.add(new DetailOptionInfo<>(CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1, "CUSTOM1"));
                            break;
                    }
                }
            }
        }
    },
    STATISTICS_FACE_DETECT_MODE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            int[] values = characteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
            if (values != null && values.length > 0) {
                for (int value : values) {
                    switch (value) {
                        case CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF:
                            items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF, "OFF"));
                            break;
                        case CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE:
                            items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE, "SIMPLE"));
                            break;
                        case CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL:
                            items.add(new DetailOptionInfo<>(CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL, "FULL"));
                            break;
                    }
                }
            }
        }
    },
    TONEMAP_PRESET_CURVE {
        private List<DetailOptionInfo> items = new ArrayList<>();
        @Override
        public List<DetailOptionInfo> getDetailOptionInfos() {
            return items;
        }

        @Override
        public void initAvailableOption(CameraCharacteristics characteristics) {
            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_SRGB, "SRGB"));
            items.add(new DetailOptionInfo<>(CameraMetadata.TONEMAP_PRESET_CURVE_REC709, "REC709"));
        }
    };
}