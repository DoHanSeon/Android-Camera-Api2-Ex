package com.example.hs.mycamera2.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.hs.mycamera2.CameraApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 2018. 4. 17..
 */

public class BaseSharedPref {
    private String prefName;
    private int prefMode;

    private Map<String, Object> dataMap;
    private Map<String, Object> dirtyMap;

    protected BaseSharedPref(String prefName, int prefMode) {
        this.prefName = prefName;
        this.prefMode = prefMode;
    }

    public Context getContext() {
        return CameraApplication.getContext();
    }

    private SharedPreferences getSharedPreferences() {
        return getContext().getSharedPreferences(this.prefName, this.prefMode);
    }

    protected Map<String, Object> getDataMap() {
        if (dataMap == null) {
            dataMap = new HashMap<String, Object>();
        }

        return dataMap;
    }

    protected Map<String, Object> getDirtyMap() {
        if (dirtyMap == null) {
            dirtyMap = new HashMap<String, Object>();
        }

        return dirtyMap;
    }

    public Object get(String key) {
        return get(key, null);
    }

    public Object get(String key, Object defaultValue) {
        if (!getDataMap().containsKey(key)) {
            SharedPreferences pref = getSharedPreferences();
            if (pref.contains(key)) {
                Map<String, ?> prefData = pref.getAll();

                for (Map.Entry<String, ?> entry : prefData.entrySet()) {
                    if (!getDataMap().containsKey(entry.getKey())) {
                        getDataMap().put(entry.getKey(), entry.getValue());
                        getDirtyMap().put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        if (getDataMap().containsKey(key)) {
            return getDataMap().get(key);
        }

        return defaultValue;
    }

    public void put(String key, Object value) {
        SharedPreferences pref = getSharedPreferences();
        SharedPreferences.Editor editor = pref.edit();

        if (value instanceof Double) {
            long temp = Double.doubleToRawLongBits((Double) value);
            putData(editor, key, temp);
            getDataMap().put(key, temp);
        } else {
            putData(editor, key, value);
            getDataMap().put(key, value);
        }
        editor.apply();
    }

    public void put(String key, boolean value) {
        put(key, Boolean.valueOf(value));
    }

    public void put(String key, int value) {
        put(key, Integer.valueOf(value));
    }

    public void put(String key, long value) {
        put(key, Long.valueOf(value));
    }

    public void put(String key, double value) {
        put(key, Double.valueOf(value));
    }

    public void commit() {
        SharedPreferences pref = getSharedPreferences();
        SharedPreferences.Editor editor = pref.edit();
        for (Map.Entry<String, Object> entry : getDataMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (!getDirtyMap().containsKey(key) || getDirtyMap().get(key) != value) {
                putData(editor, key, value);
                getDirtyMap().put(key, value);
            }
        }

        editor.apply();
    }

    public void clear() {
        SharedPreferences pref = getSharedPreferences();
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.apply();

        getDataMap().clear();
        getDirtyMap().clear();
    }

    public void remove(String key) {
        SharedPreferences pref = getSharedPreferences();
        if (pref.contains(key)) {
            SharedPreferences.Editor editor = pref.edit();
            editor.remove(key);
            editor.apply();
        }

        getDataMap().remove(key);
        getDirtyMap().remove(key);
    }

    private void putData(SharedPreferences.Editor editor, String key, Object value) {
        if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Set) {
            editor.putStringSet(key, (Set<String>) value);
        } else {
            if (value != null) {
                editor.putString(key, value.toString());
            } else {
                editor.putString(key, null);
            }
        }
    }
}
