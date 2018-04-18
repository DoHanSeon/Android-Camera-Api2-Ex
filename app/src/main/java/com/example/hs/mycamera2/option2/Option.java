package com.example.hs.mycamera2.option2;

import android.hardware.camera2.CaptureRequest;


import java.util.List;

/**
 * Created by user on 2018. 4. 17..
 */

public abstract class Option<ValueType> {
    private CaptureRequest.Key<ValueType> key;

    public Option(CaptureRequest.Key key) {
        this.key = key;
    }

    public void setAvailableValue(List<Info> value) {

    }

    public abstract List<Info> getAvailableValue();

    public static class Info {
        private String title;
        private String desc;
        private Object value;


        public Info(String title, String desc, Object value) {
            this.title = title;
            this.desc = desc;
            this.value = value;
        }

        public String getTitle() {
            return title;
        }

        public String getDesc() {
            return desc;
        }

        public Object getValue() {
            return value;
        }
    }
}
