package com.example.hs.mycamera2;

import android.content.Context;
import android.graphics.Color;
import android.hardware.camera2.CaptureRequest;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;
import com.example.hs.mycamera2.util.ScreenUtil;

import java.util.List;

/**
 * Created by user on 2018. 4. 16..
 */

public class CameraSettingsView extends ScrollView {

    LinearLayout rootView;

    private Context context;

    private OptionCallback optionCallback;

    public CameraSettingsView(Context context) {
        this(context, null);
    }

    public CameraSettingsView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CameraSettingsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        rootView = new LinearLayout(context);
        rootView.setOrientation(LinearLayout.VERTICAL);
        addView(rootView, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }

    public void setOptionCallback(OptionCallback optionCallback) {
        this.optionCallback = optionCallback;
    }

    public void initView(CameraOption cameraOption) {
        Object value = optionCallback.getCurrentValue(cameraOption.getKey());
        switch (cameraOption.getOptionType()) {
            case CHECK:
                Boolean dv1 = value != null ? (Boolean) value : null;
                initCheckOptionView(cameraOption.getKey(), cameraOption.getDisplayName(), dv1);
                break;
            case INTEGER_SELECT:
                Integer dv2 = value != null ? (Integer) value : null;
                initIntegerSelect(cameraOption.getKey(), cameraOption.getItems(), cameraOption.getDisplayName(), dv2);
                break;
            case FLOAT_SELECT:
                Float dv3 = value != null ? (Float) value : null;
                initFloatSelect(cameraOption.getKey(), cameraOption.getItems(), cameraOption.getDisplayName(), dv3);
                break;
            case INTEGER_SLIDE:
                Integer dv4 = value != null ? (Integer) value : null;
                initIntegerSlide(cameraOption.getKey(), cameraOption.getItems(), cameraOption.getDisplayName(), dv4);
                break;
            case FLOAT_SLIDE:
                Float dv5 = value != null ? (Float) value : null;
                initFloatSlide(cameraOption.getKey(), cameraOption.getItems(), cameraOption.getDisplayName(), dv5);
                break;
            case LONG_SLIDE:
                Long dv6 = value != null ? (Long) value : null;
                initLongSlide(cameraOption.getKey(), cameraOption.getItems(), cameraOption.getDisplayName(), dv6);
                break;
        }
    }

    private void initCheckOptionView(CaptureRequest.Key<Boolean> key, String displayName, boolean defaultValue) {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int margin = (int) ScreenUtil.dpToPixel(5f);
        lp.setMargins(margin, margin, margin, margin);
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.HORIZONTAL);
        rootView.addView(parent, lp);


        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 3;
        lp.gravity = Gravity.CENTER_VERTICAL | Gravity.LEFT;

        TextView title = new TextView(context);
        title.setText(displayName);
        title.setTextColor(Color.parseColor("#ffffff"));
        title.setTextSize(ScreenUtil.dpToPixel(7f));
        parent.addView(title, lp);


        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 1;
        lp.gravity = Gravity.CENTER;

        CheckBox checkBox = new CheckBox(context);
        checkBox.setChecked(defaultValue);
        parent.addView(checkBox, lp);
        checkBox.setOnCheckedChangeListener((view, isChecked) -> optionCallback.onChangeCheckOption(key, isChecked));
    }

    /**
     * select
     * @param key
     * @param items
     * @param displayName
     */
    private void initIntegerSelect(CaptureRequest.Key<Integer> key, List<DetailOptionInfo<Integer>> items, String displayName, Integer defaultValue) {
        View view = createSelectView(items, displayName, ((group, checkedViewId) -> {
            Integer value = (Integer) group.findViewById(checkedViewId).getTag();
            optionCallback.onChangeSelectOption(key, value);
        }), defaultValue);

        if (view != null) {
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int margin = (int) ScreenUtil.dpToPixel(5f);
            lp.setMargins(margin, margin, margin, margin);
            rootView.addView(view, lp);
        }
    }

    private void initFloatSelect(CaptureRequest.Key<Float> key, List<DetailOptionInfo<Float>> items, String displayName, Float defaultValue) {
        View view = createSelectView(items, displayName, ((group, checkedViewId) -> {
            Float value = (Float) group.findViewById(checkedViewId).getTag();
            optionCallback.onChangeSelectOption(key, value);
        }), defaultValue);

        if (view != null) {
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int margin = (int) ScreenUtil.dpToPixel(5f);
            lp.setMargins(margin, margin, margin, margin);
            LinearLayout parent = new LinearLayout(context);
            parent.setOrientation(LinearLayout.VERTICAL);
            rootView.addView(parent, lp);
        }
    }

    /**
     * slide
     */
    private void initIntegerSlide(CaptureRequest.Key<Integer> key, List<DetailOptionInfo<Integer>> items, String displayName, Integer defaultValue) {
        View view = createSlideView(items, displayName, new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                optionCallback.onChangeSlideOption(key, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }, defaultValue);

        if (view != null) {
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int margin = (int) ScreenUtil.dpToPixel(5f);
            lp.setMargins(margin, margin, margin, margin);
            rootView.addView(view, lp);
        }
    }

    private void initFloatSlide(CaptureRequest.Key<Float> key, List<DetailOptionInfo<Float>> items, String displayName, Float defaultValue) {
        View view = createSlideView(items, displayName, new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                optionCallback.onChangeSlideOption(key, (float) progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }, defaultValue);

        if (view != null) {
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int margin = (int) ScreenUtil.dpToPixel(5f);
            lp.setMargins(margin, margin, margin, margin);
            rootView.addView(view, lp);
        }
    }

    private void initLongSlide(CaptureRequest.Key<Long> key, List<DetailOptionInfo<Long>> items, String displayName, Long defaultValue) {
        View view = createSlideView(items, displayName, new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                optionCallback.onChangeSlideOption(key, (long) progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }, defaultValue);

        if (view != null) {
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int margin = (int) ScreenUtil.dpToPixel(5f);
            lp.setMargins(margin, margin, margin, margin);
            rootView.addView(view, lp);
        }
    }

    /**
     * create view for slide
     * @param items
     * @param displayName
     * @param changeListener
     * @param <T>
     * @return
     */
    private <T extends Number> View createSlideView(List<DetailOptionInfo<T>> items, String displayName, SeekBar.OnSeekBarChangeListener changeListener, T defaultValue) {
        if (items.size() != 2) {
            return null;
        }

        DetailOptionInfo<T> minValue = items.get(0);
        DetailOptionInfo<T> maxValue = items.get(1);

        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);

        //title (min value, max value)
        LinearLayout titleLayout = new LinearLayout(context);
        titleLayout.setOrientation(LinearLayout.HORIZONTAL);
        titleLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 1;
        TextView minTextView = new TextView(context);
        minTextView.setGravity(Gravity.LEFT);
        minTextView.setTextColor(Color.WHITE);
        minTextView.setText(minValue.getDisplayName());
        minTextView.setLayoutParams(lp);

        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 3;
        TextView title = new TextView(context);
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.WHITE);
        title.setText(displayName);
        title.setLayoutParams(lp);

        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 1;
        TextView maxTextView = new TextView(context);
        maxTextView.setGravity(Gravity.RIGHT);
        maxTextView.setTextColor(Color.WHITE);
        maxTextView.setText(maxValue.getDisplayName());
        maxTextView.setLayoutParams(lp);

        titleLayout.addView(minTextView);
        titleLayout.addView(title);
        titleLayout.addView(maxTextView);

        parent.addView(titleLayout);

        //seekbar
        SeekBar seekBar = null;
        if (minValue.getValue() instanceof Float) {
            seekBar = new FloatSeekBar(context);
        } else {
            seekBar = new SeekBar(context);
        }
        seekBar.setMin(minValue.getValue().intValue());
        seekBar.setMax(maxValue.getValue().intValue());
        if (defaultValue != null) {
            seekBar.setProgress(defaultValue.intValue());
        }
        seekBar.setOnSeekBarChangeListener(changeListener);

        parent.addView(seekBar);

        return parent;
    }

    /**
     * create view for select
     * @param changeListener
     * @return
     */
    private <T extends Number> View createSelectView(List<DetailOptionInfo<T>> items, String displayName, RadioGroup.OnCheckedChangeListener changeListener, T defaultValue) {
        if (items.size() == 0) {
            return null;
        }

        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);


        LinearLayout.LayoutParams  lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.CENTER_VERTICAL | Gravity.LEFT;
        TextView title = new TextView(context);
        title.setText(displayName);
        title.setTextColor(Color.parseColor("#ffffff"));
        title.setTextSize(ScreenUtil.dpToPixel(7f));
        parent.addView(title, lp);

        RadioGroup radioGroup = new RadioGroup(context);
        for (int i=0; i<items.size(); i++) {
            RadioButton button = new RadioButton(context);
            DetailOptionInfo info = items.get(i);
            button.setId(i);
            button.setTag(info.getValue());
            button.setText(info.getDisplayName());

            if (defaultValue instanceof Integer) {
                if (defaultValue.intValue() == ((Number) info.getValue()).intValue()) {
                    button.setChecked(true);
                } else {
                    button.setChecked(false);
                }
            } else if (defaultValue instanceof Float) {
                if (defaultValue.floatValue() == ((Number) info.getValue()).floatValue()) {
                    button.setChecked(true);
                } else {
                    button.setChecked(false);
                }
            }


            radioGroup.addView(button);
        }
        radioGroup.setOnCheckedChangeListener(changeListener);
        parent.addView(radioGroup);
        return parent;
    }









    public interface OptionCallback {
        void onChangeCheckOption(CaptureRequest.Key<Boolean> key, boolean isChecked);
        void onChangeSelectOption(CaptureRequest.Key<Integer> key, int option);
        void onChangeSelectOption(CaptureRequest.Key<Float> key, float option);

        void onChangeSlideOption(CaptureRequest.Key<Integer> key, int option);
        void onChangeSlideOption(CaptureRequest.Key<Float> key, float option);
        void onChangeSlideOption(CaptureRequest.Key<Long> key, long option);

        Object getCurrentValue(CaptureRequest.Key<Object> key);
    }




    /*

    private void initCheckOptionView(CaptureRequest.Key<Boolean> key, String displayName) {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int margin = (int) ScreenUtil.dpToPixel(5f);
        lp.setMargins(margin, margin, margin, margin);
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.HORIZONTAL);
        rootView.addView(parent, lp);


        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 3;
        lp.gravity = Gravity.CENTER_VERTICAL | Gravity.LEFT;

        TextView title = new TextView(context);
        title.setText(displayName);
        title.setTextColor(Color.parseColor("#ffffff"));
        title.setTextSize(ScreenUtil.dpToPixel(7f));
        parent.addView(title, lp);


        lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.weight = 1;
        lp.gravity = Gravity.CENTER;

        CheckBox checkBox = new CheckBox(context);
        parent.addView(checkBox, lp);
        checkBox.setOnCheckedChangeListener((view, isChecked) -> optionCallback.onChangeCheckOption(key, isChecked));
    }

    private void initSelectOptionView(CaptureRequest.Key<Number> key, List<DetailOptionInfo<Number>> detailOptionInfos, String displayName) {
        if (detailOptionInfos.size() == 0) {
            Log.d("hanseon--", "initSelectOptionView child size is 0 -> return : " + key.getName());
            return;
        }
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int margin = (int) ScreenUtil.dpToPixel(5f);
        lp.setMargins(margin, margin, margin, margin);
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);
        rootView.addView(parent, lp);

        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.CENTER_VERTICAL | Gravity.LEFT;

        TextView title = new TextView(context);
        title.setText(displayName);
        title.setTextColor(Color.parseColor("#ffffff"));
        title.setTextSize(ScreenUtil.dpToPixel(7f));
        parent.addView(title, lp);

        RadioGroup radioGroup = new RadioGroup(context);
        for (int i=0; i<detailOptionInfos.size(); i++) {
            RadioButton button = new RadioButton(context);
            DetailOptionInfo info = detailOptionInfos.get(i);
            button.setId(i);
            button.setTag(info.getValue());
            button.setText(info.getDisplayName());
            radioGroup.addView(button);
        }

        radioGroup.setOnCheckedChangeListener((group, id) -> {
            Object value = group.findViewById(id).getTag();
            if (value instanceof Integer) {
                optionCallback.onChangeSelectOption(key, value);
            }
            optionCallback.onChangeSelectOption(key, (Number) value);
        });
        parent.addView(radioGroup);
    }

    private <T> void initSlideOptionView(CaptureRequest.Key<Number> key, List<DetailOptionInfo<Number>> detailOptionInfos, String displayName) {
        if (detailOptionInfos.size() != 2) {
            Log.d("hanseon--", "initSlideOptionView child size is 0 -> return : " + key.getName());
            return;
        }

        DetailOptionInfo<Number> minValue = detailOptionInfos.get(0);
        DetailOptionInfo<Number> maxValue = detailOptionInfos.get(1);

        Type type = null;
        if (minValue.getValue() instanceof Integer) {
            type = Type.INTEGER;
        } else if(minValue.getValue() instanceof Float) {
            type = Type.FLOAT;
        } else if (minValue.getValue() instanceof Long) {
            type = Type.LONG;
        }

        if (type == null) {
            return;
        }


        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);
        rootView.addView(parent, lp);

        //title (min value, max value)
        LinearLayout titleLayout = new LinearLayout(context);
        titleLayout.setOrientation(LinearLayout.HORIZONTAL);
        titleLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.LEFT;
        TextView minTextView = new TextView(context);
        minTextView.setTextColor(Color.WHITE);
        minTextView.setText(minValue.getDisplayName());
        minTextView.setLayoutParams(lp);

        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.RIGHT;
        TextView maxTextView = new TextView(context);
        maxTextView.setTextColor(Color.WHITE);
        maxTextView.setText(maxValue.getDisplayName());
        maxTextView.setLayoutParams(lp);

        titleLayout.addView(minTextView);
        titleLayout.addView(maxTextView);

        parent.addView(titleLayout);

        //seekbar
        SeekBar seekBar = null;
        if (minValue.getValue() instanceof Float) {
            seekBar = new FloatSeekBar(context);
        } else {
            seekBar = new SeekBar(context);
        }
        seekBar.setMin(minValue.getValue().intValue());
        seekBar.setMax(maxValue.getValue().intValue());
        seekBar.setProgress(minValue.getValue().intValue());

        parent.addView(seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                optionCallback.onChangeSlideOption(key, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


//    public void initView(List<CameraOption> cameraOptions) {
//        for (CameraOption option : cameraOptions) {
//            View view = null;
//            switch (option.getOptionType()) {
//                case CHECK:
//                    break;
//                case SELECT:
//                    view = createSelectOptionView(option);
//                    break;
//                case SETTING_VALUE:
//                    break;
//                case SLIDE:
//                    break;
//            }
//
//            rootView.addView(view, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        }
//    }
//
//    private View createSelectOptionView(CameraOption option) {
//
//        LinearLayout rootView = new LinearLayout(context);
//        rootView.setOrientation(LinearLayout.VERTICAL);
//
//
//        CameraDetailOption detailOption = option.getDetailOption();
//
//        TextView textView = new TextView(context);
//        textView.setText(option.getDisplayName());
//
//        RadioGroup group = new RadioGroup(context);
//        for (DetailOptionInfo info : detailOption.getDetailOptionInfos()) {
//            RadioButton button = new RadioButton(context);
//            button.setId((Integer) info.getValue());
//            button.setTag(info.getValue());
//            button.setText(info.getDisplayName());
//            group.addView(button);
//        }
//
//        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                View view = group.findViewById(checkedId);
//            }
//        });
//
//
//
//        rootView.addView(textView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        rootView.addView(group, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        return rootView;
//    }


    private enum Type {
        INTEGER, FLOAT, LONG;
    }















    private void initUi(Context context) {
        setBackgroundColor(Color.WHITE);

        LinearLayout rootView = new LinearLayout(context);
        rootView.setOrientation(LinearLayout.VERTICAL);
        FrameLayout.LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);

        //add childOption
        for (CameraAllOption.Subject subject : CameraAllOption.Subject.values()) {
            LinearLayout parent = new LinearLayout(context);
            parent.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout titleViewGroup = new LinearLayout(context);
            LinearLayout.LayoutParams titleViewGroupLp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 3);
            titleViewGroup.setOrientation(LinearLayout.VERTICAL);
            titleViewGroup.setLayoutParams(titleViewGroupLp);
            {
                LinearLayout.LayoutParams titleLp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                titleLp.setMargins((int) ScreenUtil.dpToPixel(5), (int) ScreenUtil.dpToPixel(5), (int) ScreenUtil.dpToPixel(5), (int) ScreenUtil.dpToPixel(5));
                TextView title = new TextView(context);
                title.setText(subject.name());
                title.setTextColor(Color.parseColor("#222222"));
                title.setTextSize(ScreenUtil.dpToPixel(7f));
                title.setLayoutParams(titleLp);

                LinearLayout.LayoutParams descLp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                descLp.setMargins((int) ScreenUtil.dpToPixel(10f), 0, 0, 0);
                TextView desc = new TextView(context);
                desc.setText(subject.getDescription());
                desc.setTextColor(Color.parseColor("#aaaaaa"));
                desc.setTextSize((int) ScreenUtil.dpToPixel(5f));
                desc.setLayoutParams(descLp);

                titleViewGroup.addView(title);
                titleViewGroup.addView(desc);
            }

            LinearLayout.LayoutParams buttonViewGroupLp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
            FrameLayout buttonGroup = new FrameLayout(context);
            buttonGroup.setLayoutParams(buttonViewGroupLp);
            {
                TextView button = null;
                switch (subject.getType()) {
                    case CHECK:
                        button = new CheckBox(context);
                        button.setText("checkbox");
                        break;
                    default:
                        button = new TextView(context);
                        button.setText("empty");
                }
                if (button != null) {
                    button.setTextColor(Color.parseColor("#000000"));
                    button.setTag(subject);
                    button.setOnClickListener(this);
                    FrameLayout.LayoutParams buttonLp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    buttonLp.gravity = Gravity.CENTER;
                    buttonGroup.addView(button, buttonLp);
                }
            }

            parent.addView(titleViewGroup);
            parent.addView(buttonGroup);
            rootView.addView(parent, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            View divider = new View(context);
            divider.setBackgroundColor(Color.parseColor("#7daaaaaa"));
            LinearLayout.LayoutParams dividerLp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) ScreenUtil.dpToPixel(0.5f));
            dividerLp.setMargins(0, (int) ScreenUtil.dpToPixel(3f), 0, 0);
            rootView.addView(divider, dividerLp);
        }
        addView(rootView);
    }

    @Override
    public void onClick(View v) {

    }
    */


}
