package com.example.hs.mycamera2.option;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.example.hs.mycamera2.R;
//import com.example.hs.mycamera2.dialog.DetailOptionSelectDialog;
//import com.example.hs.mycamera2.dialog.DialogHelper;
import com.example.hs.mycamera2.pref.CameraOptionPref;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by user on 2018. 4. 17..
 */

public class OptionFragment extends Fragment {

    public static final String TAG = OptionFragment.class.getSimpleName();

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private OptionAdapter adapter;

    private OptionAdapter.OptionViewHolder.ItemClickListener itemClickListener = (view, subject) -> {
        switch (subject.getType()) {
            case CHECK:
                if (view instanceof CheckBox) {
                    CameraOptionPref.getInstance().setValue(subject, ((CheckBox) view).isChecked());
                } else {
                    throw new RuntimeException("Subject OptionType is CHECK but View is not CheckBox");
                }
                break;
            case SELECT:
//                new DialogHelper.SelectDialogBuilder(getContext())
//                        .setDetailOption(subject.getDetailOption())
//                        .setItemSelectListener((parentOption, selectedItem) -> CameraOptionPref.getInstance().setValue(parentOption, selectedItem.getValue()))
//                        .create()
//                        .show();
                break;
            case FLOAT_INPUT:
                break;
            case LONG_INPUT:
                break;
            case INTEGER_INPUT:
                break;
            default:
                Log.d("hanseon--", "subject type NOT_SUPPORTED");
                break;
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_option, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUi();
    }

    private void initUi() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        adapter = new OptionAdapter(itemClickListener);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void refresh(String cameraId) {
        adapter.refresh(cameraId);
    }
}
