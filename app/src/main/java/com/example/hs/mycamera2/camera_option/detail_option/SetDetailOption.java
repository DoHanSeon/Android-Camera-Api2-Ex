//package com.example.hs.mycamera2.camera_option.detail_option;
//
//import android.hardware.camera2.CameraCharacteristics;
//import android.util.Range;
//import android.util.Rational;
//
//import java.util.List;
//
///**
// * Created by user on 2018. 4. 20..
// */
//
//public enum  SetDetailOption implements CameraDetailOption {
//    CONTROL_AE_EXPOSURE_COMPENSATION {
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//            Range<Integer> range = characteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
//            Rational rational = characteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
//
//            Integer lower = range.getLower();
//            Integer upper = range.getUpper();
//            if (lower == null || upper == null) {
//                return;
//            }
//
//            int value = lower;
//            while (value <= upper) {
//                items.add(new DetailOptionInfo<>(value, String.valueOf(value)));
//                value += rational.intValue();
//            }
//        }
//    },
//    JPEG_ORIENTATION {
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return null;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//            items.add(new DetailOptionInfo<>(0, "ROTATION 90"));
//            items.add(new DetailOptionInfo<>(90, "ROTATION 0"));
//            items.add(new DetailOptionInfo<>(180, "ROTATION 270"));
//            items.add(new DetailOptionInfo<>(270, "ROTATION 180"));
//        }
//    }
//}
