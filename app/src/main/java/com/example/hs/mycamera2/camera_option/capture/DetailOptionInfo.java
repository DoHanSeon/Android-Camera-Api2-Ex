package com.example.hs.mycamera2.camera_option.capture;

/**
 * Created by user on 2018. 4. 18..
 */

public class DetailOptionInfo<T> {
    private T value;
    private String displayName;

    public DetailOptionInfo(T value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public T getValue() {
        return value;
    }

    public String getDisplayName() {
        return displayName;
    }
}
