//package com.example.hs.mycamera2.camera_option.detail_option;
//
//import android.hardware.camera2.CameraCharacteristics;
//import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
//import android.hardware.camera2.CameraMetadata;
//import android.hardware.camera2.CaptureRequest;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by user on 2018. 4. 18..
// */
//
//public enum SelectDetailOption implements CameraDetailOption {
//    NONE {
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return null;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//            //do nothing
//        }
//    },
//    COLOR_CORRECTION_MODE {
//
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    COLOR_CORRECTION_ABERRATION_MODE {
//
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_AE_ANTIBANDING_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_AE_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_AE_PRECAPTURE_TRIGGER {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_AF_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_AF_TRIGGER {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//        }
//    },
//    CONTROL_AWB_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_CAPTURE_INTENT {
//        private List<DetailOptionInfo> items = new ArrayList<>();;
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_EFFECT_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_SCENE_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    CONTROL_VIDEO_STABILIZATION_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//        }
//    },
//    EDGE_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    FLASH_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    HOT_PIXEL_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    LENS_OPTICAL_STABILIZATION_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    NOISE_REDUCTION_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            if (items == null) {
//                items = new ArrayList<>();
//            }
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    STATISTICS_LENS_SHADING_MAP_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    TONEMAP_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    SHADING_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    SENSOR_TEST_PATTERN_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    STATISTICS_FACE_DETECT_MODE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//
//        }
//    },
//    TONEMAP_PRESET_CURVE {
//        private List<DetailOptionInfo> items = new ArrayList<>();
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//        }
//    };
//}