package com.example.hs.mycamera2.camera_option;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hs.mycamera2.R;
import com.example.hs.mycamera2.CameraSettingsView;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

//import com.example.hs.mycamera2.dialog.DetailOptionSelectDialog;
//import com.example.hs.mycamera2.dialog.DialogHelper;

/**
 * Created by user on 2018. 4. 17..
 */

public class OptionFragment extends Fragment {

    public static final String TAG = OptionFragment.class.getSimpleName();

    @BindView(R.id.setting_view)
    CameraSettingsView cameraSettingsView;

    public static OptionFragment createFragment(CameraSettingsView.OptionCallback optionCallback) {
        OptionFragment fragment = new OptionFragment();
        fragment.optionCallback = optionCallback;
        return fragment;
    }


    private Map<Integer, CameraOption>  cameraOptions;

    private CameraSettingsView.OptionCallback optionCallback;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_option, container, false);
        ButterKnife.bind(this, rootView);

        cameraSettingsView.setOptionCallback(optionCallback);
        cameraOptions = CameraOptionManager.getInstance().getAvailableCameraOptions();
        for (CameraOption cameraOption : cameraOptions.values()) {
            cameraSettingsView.initView(cameraOption);
        }

        return rootView;
    }
}
