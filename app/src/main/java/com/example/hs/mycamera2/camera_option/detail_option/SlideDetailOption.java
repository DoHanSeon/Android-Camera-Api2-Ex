//package com.example.hs.mycamera2.camera_option.detail_option;
//
//import android.hardware.camera2.CameraCharacteristics;
//import android.os.Build;
//import android.support.annotation.RequiresApi;
//import android.util.Range;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by user on 2018. 4. 20..
// */
//
//public enum SlideDetailOption implements CameraDetailOption {
//
//
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    CONTROL_POST_RAW_SENSITIVITY_BOOST {
//
//        private List<DetailOptionInfo> items = new ArrayList<>();
//
//        @Override
//        public List<DetailOptionInfo> getDetailOptionInfos() {
//            return items;
//        }
//
//        @Override
//        public void initAvailableOption(CameraCharacteristics characteristics) {
//            Range<Integer> range = characteristics.get(CameraCharacteristics.CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE);
//
//            Integer lower = range.getLower();
//            Integer upper = range.getUpper();
//
//            if (lower == null || upper == null) {
//                return;
//            }
//
//            items.add(new DetailOptionInfo<>(lower, "LOWER"));
//            items.add(new DetailOptionInfo<>(upper, "UPPER"));
//        }
//    }
//}
