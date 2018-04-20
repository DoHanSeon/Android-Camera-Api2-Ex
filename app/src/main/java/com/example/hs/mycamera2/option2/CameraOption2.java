//package com.example.hs.mycamera2.option2;
//
//import android.content.Context;
//import android.hardware.camera2.CameraAccessException;
//import android.hardware.camera2.CameraCharacteristics;
//import android.hardware.camera2.CameraManager;
//import android.hardware.camera2.CameraMetadata;
//import android.hardware.camera2.CaptureRequest;
//import android.text.TextUtils;
//
//import com.example.hs.mycamera2.CameraApplication;
//import com.example.hs.mycamera2.option.CameraAllOption;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by user on 2018. 4. 17..
// */
//
//public class CameraOption2 {
//    public static CameraOption2 INSTANCE;
//
//    private Map<String, List<CaptureRequest.Key<?>>> captureRequestAvailableKeys = new HashMap<>();
//
//    private Map<String, Option> captreRequestAvailableValues = new HashMap<>();
//
//
//    public synchronized static CameraOption2 getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new CameraOption2();
//        }
//        return INSTANCE;
//    }
//
//    private CameraOption2() {
//    }
//
//    private void initAvailableKey(String cameraId) {
//        try {
//            CameraManager manager = (CameraManager) CameraApplication.getContext().getSystemService(Context.CAMERA_SERVICE);
//            CameraCharacteristics characteristics = manager.getCameraCharacteristics(cameraId);
//            List<CaptureRequest.Key<?>> keys = characteristics.getAvailableCaptureRequestKeys();
//            captureRequestAvailableKeys.put(cameraId, keys);
//
//            for (CaptureRequest.Key<?> key : keys) {
//                if (!captureRequestAvailableKeys.containsKey(key)) {
//                    if (TextUtils.equals(key.getName(), "android.blackLevel.lock")) {
//
//                    }
//                }
//            }
//
//
//        } catch (CameraAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<CaptureRequest.Key<?>> getAvailableKeys(String cameraId) {
//        if (!captureRequestAvailableKeys.containsKey(cameraId)) {
//            initAvailableKey(cameraId);
//        }
//        return captureRequestAvailableKeys.get(cameraId);
//    }
//
//    public static Option temp(CameraCharacteristics character, CaptureRequest.Key<?> key) {
//        String name = key.getName();
//
//
//
//        CameraAllOption.SelectDetailOption detailOption = CameraAllOption.SelectDetailOption.NONE;
//        int[] availableIntValue = null;
//
//
//        if (TextUtils.equals(name, CaptureRequest.BLACK_LEVEL_LOCK.getName())) {
//            return new BooleanOption(key);
//        } else if (TextUtils.equals(name, CaptureRequest.BLACK_LEVEL_LOCK.getName())) {
//            detailOption = CameraAllOption.SelectDetailOption.COLOR_CORRECTION_ABERRATION_MODE;
//            availableIntValue = character.get(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
//        } else if (TextUtils.equals(name, CaptureRequest.COLOR_CORRECTION_MODE.getName())) {
//            int hardwareLevel = character.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//            if (hardwareLevel == CameraMetadata.INFO_SUPPORTED_HARDWARE_LEVEL_FULL) {
//                detailOption = CameraAllOption.SelectDetailOption.COLOR_CORRECTION_MODE;
//                availableIntValue = new int[] {
//                        CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX,
//                        CameraMetadata.COLOR_CORRECTION_MODE_FAST,
//                        CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY
//                };
//            }
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_ANTIBANDING_MODE.getName())) {
//            detailOption = CameraAllOption.SelectDetailOption.CONTROL_AE_ANTIBANDING_MODE;
//            availableIntValue = character.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION.getName())) {
//            //TODO...
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_MODE.getName())) {
//            detailOption = CameraAllOption.SelectDetailOption.CONTROL_AE_MODE;
//            availableIntValue = character.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER.getName())) {
//            int hardwareLevel = character.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
//            if (hardwareLevel == CameraMetadata.INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED) {
//                detailOption = CameraAllOption.SelectDetailOption.CONTROL_AE_PRECAPTURE_TRIGGER;
//                availableIntValue = new int[] {
//                        CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE,
//                        CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START,
//                        CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL
//                };
//            }
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AF_MODE.getName())) {
//            detailOption = CameraAllOption.SelectDetailOption.CONTROL_AF_MODE;
//            availableIntValue = character.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AF_TRIGGER.getName())) {
//            detailOption = CameraAllOption.SelectDetailOption.CONTROL_AF_TRIGGER;
//            availableIntValue = new int[] {
//                    CameraMetadata.CONTROL_AF_TRIGGER_IDLE,
//                    CameraMetadata.CONTROL_AF_TRIGGER_START,
//                    CameraMetadata.CONTROL_AF_TRIGGER_CANCEL
//            };
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AWB_LOCK.getName())) {
//            return new BooleanOption(key);
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AWB_MODE.getName())) {
//
//        }
//
//
//        //TODO helper로 옮겨야겠다....ㅠㅠ
//
//
//
//
//
//
//
//
//
//        if (TextUtils.equals(name, CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE.getName())) {
//            int[] values = character.get(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
//
//            List<Option.Info> result = new ArrayList<>();
//            Map<Integer, Option.Info> allOption = CameraAllOption.SelectDetailOption.COLOR_CORRECTION_ABERRATION_MODE.get();
//
//            for (int value : values) {
//                if (allOption.containsKey(value)) {
//                    result.add(allOption.get(key));
//                }
//            }
//
//            Option detail = new IntegerOption(key);
//            detail.setAvailableValue(result);
//
//            return detail;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_ANTIBANDING_MODE.getName())) {
//            int[] values = character.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
//
//            List<Option.Info> result = new ArrayList<>();
//            Map<Integer, Option.Info> allOption = CameraAllOption.SelectDetailOption.CONTROL_AE_ANTIBANDING_MODE.get();
//
//            for (int value : values) {
//                if (allOption.containsKey(value)) {
//                    result.add(allOption.get(key));
//                }
//            }
//
//            Option detail = new IntegerOption(key);
//            detail.setAvailableValue(result);
//
//            return detail;
//
//
//
//
//            return CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION.getName())) {
//            return CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_MODE.getName())) {
//            return CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName())) {
//            return CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AF_MODE.getName())) {
//            return CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
//        } else if (TextUtils.equals(name, CaptureRequest.CONTROL_AF_TRIGGER.getName())) {
//            Option detail = new IntegerOption(key);
//            detail.setAvailableValue(CameraAllOption.SelectDetailOption.CONTROL_AF_TRIGGER.get());
//            return detail;
//
//        }
//        else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        } else if (TextUtils.equals(name, CaptureRequest..getName())) {
//
//        }
//    }
//}
