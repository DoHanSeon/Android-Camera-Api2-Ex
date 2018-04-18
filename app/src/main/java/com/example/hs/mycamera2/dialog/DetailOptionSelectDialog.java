//package com.example.hs.mycamera2.dialog;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.example.hs.mycamera2.R;
//import com.example.hs.mycamera2.option.CameraAllOption;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// * Created by user on 2018. 4. 17..
// */
//
//public class DetailOptionSelectDialog extends Dialog {
//
//    @BindView(R.id.detail_options)
//    LinearLayout detailOptions;
//
//    private final Params mParams;
//    private CameraAllOption.Subject parentOption;
//    private ItemSelectListener itemSelectListener;
//
//    DetailOptionSelectDialog(Params params) {
//        super(params.context, R.style.Theme_Snow_Dialog);
//        this.mParams = params;
//        this.itemSelectListener = params.itemSelectListener;
//        this.parentOption = params.detailOption.getParentOption();
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_detail_option_select);
//        ButterKnife.bind(this);
//
//        initUi();
//    }
//
//    private void initUi() {
//
//        for (CameraAllOption.DetailOptionInfo option : mParams.detailOption.get()) {
//            View itemView = LayoutInflater.from(getContext()).inflate(R.layout.view_holder_option, null);
//            TextView title = itemView.findViewById(R.id.txt_title);
//            TextView desc = itemView.findViewById(R.id.txt_desc);
//
//            title.setText(option.getTitle());
//            desc.setText(option.getDesc());
//
//            itemView.setOnClickListener(v -> {
//                DetailOptionSelectDialog.this.dismiss();
//                itemSelectListener.onClickItem(parentOption, option);
//            });
//
//            detailOptions.addView(itemView);
//        }
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
