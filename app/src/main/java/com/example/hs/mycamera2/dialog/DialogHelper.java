//package com.example.hs.mycamera2.dialog;
//
//import android.content.Context;
//
//import com.example.hs.mycamera2.option.CameraAllOption;
//
///**
// * Created by user on 2018. 4. 17..
// */
//
//public class DialogHelper {
//
//    public static class SelectDialogBuilder {
//        private final DetailOptionSelectDialog.Params mParams;
//
//        public SelectDialogBuilder(Context context) {
//            mParams = new DetailOptionSelectDialog.Params(context);
//        }
//
//        public SelectDialogBuilder setDetailOption(CameraAllOption.DetailOption detailOption) {
//            mParams.detailOption = detailOption;
//            return this;
//        }
//
//        public SelectDialogBuilder setItemSelectListener(DetailOptionSelectDialog.ItemSelectListener itemSelectListener) {
//            mParams.itemSelectListener = itemSelectListener;
//            return this;
//        }
//
//        public DetailOptionSelectDialog create() {
//            return new DetailOptionSelectDialog(mParams);
//        }
//
//        public interface ItemSelectListener {
//            void onClickItem(CameraAllOption.Subject parentOption, CameraAllOption.DetailOptionInfo selectedItem);
//        }
//    }
//}
