//package com.example.hs.mycamera2.dialog;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//
//import com.example.hs.mycamera2.R;
//import com.example.hs.mycamera2.option.CameraAllOption;
//
///**
// * Created by user on 2018. 4. 17..
// */
//
//public class ValueInputDialog extends Dialog {
//
//    private final Params mParams;
//    private CameraAllOption.Subject parentOption;
//    private ItemSelectListener itemSelectListener;
//
//    ValueInputDialog(Params params) {
//        super(params.context, R.style.Theme_Snow_Dialog);
//        this.mParams = params;
//        this.itemSelectListener = params.itemSelectListener;
//        this.parentOption = params.detailOption.getParentOption();
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView();
//    }
//
//    static class Params {
//        Context context;
//
//        CameraAllOption.DetailOption detailOption;
//        ItemSelectListener itemSelectListener;
//
//        Params(Context context) {
//            this.context = context;
//        }
//    }
//
//    public interface ItemSelectListener {
//        void onClickItem(CameraAllOption.Subject parentOption, CameraAllOption.DetailOptionInfo selectedItem);
//    }
//}
