package com.example.hs.mycamera2;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.hs.mycamera2.option.CameraAllOption;
import com.example.hs.mycamera2.util.ScreenUtil;

/**
 * Created by user on 2018. 4. 16..
 */

public class SettingsView extends ScrollView implements View.OnClickListener {
    public SettingsView(Context context) {
        this(context, null);
    }

    public SettingsView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initUi(context);
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
}
