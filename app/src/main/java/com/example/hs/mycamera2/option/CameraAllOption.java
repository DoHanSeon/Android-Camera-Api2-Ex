package com.example.hs.mycamera2.option;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraMetadata;

import com.example.hs.mycamera2.option2.Option;

import java.util.HashMap;
import java.util.Map;

import static com.example.hs.mycamera2.option.CameraAllOption.Type.CHECK;
import static com.example.hs.mycamera2.option.CameraAllOption.Type.FLOAT_INPUT;
import static com.example.hs.mycamera2.option.CameraAllOption.Type.INTEGER_INPUT;
import static com.example.hs.mycamera2.option.CameraAllOption.Type.LONG_INPUT;
import static com.example.hs.mycamera2.option.CameraAllOption.Type.NOT_SUPPORTED;
import static com.example.hs.mycamera2.option.CameraAllOption.Type.SELECT;

/**
 * Created by user on 2018. 4. 16..
 */

public class CameraAllOption {
    public enum Value {

    }








    public enum Subject {

        NONE {
            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public Type getType() {
                return null;
            }

            @Override
            public DetailOption getDetailOption() {
                return null;
            }
        },
        BLACK_LEVEL_LOCK {
            @Override
            public String getDescription() {
                return "Whether black-level compensation is locked to its current values, or is free to vary.";
            }

            @Override
            public Type getType() {
                return CHECK;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NONE;
            }
        },
        COLOR_CORRECTION_ABERRATION_MODE {
            private Map<String, Number> detailOption;

            @Override
            public String getDescription() {
                return "Mode of operation for the chromatic aberration correction algorithm.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.COLOR_CORRECTION_ABERRATION_MODE;
            }
        },
        COLOR_CORRECTION_MODE {
            @Override
            public String getDescription() {
                return "The mode control selects how the image data is converted from the sensor's native color into linear sRGB color.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.COLOR_CORRECTION_MODE;
            }
        },
        CONTROL_AE_ANTIBANDING_MODE {
            @Override
            public String getDescription() {
                return "The desired setting for the camera device's auto-exposure algorithm's antibanding compensation.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AE_ANTIBANDING_MODE;
            }
        },
        CONTROL_AE_EXPOSURE_COMPENSATION {
            @Override
            public String getDescription() {
                return "Adjustment to auto-exposure (AE) target image brightness.\n" +
                        "\n" +
                        "The adjustment is measured as a count of steps, with the step size defined by android.control.aeCompensationStep and the allowed range by android.control.aeCompensationRange.\n" +
                        "\n" +
                        "For example, if the exposure value (EV) step is 0.333, '6' will mean an exposure compensation of +2 EV; -3 will mean an exposure compensation of -1 EV. One EV represents a doubling of image brightness. Note that this control will only be effective if android.control.aeMode != OFF. This control will take effect even when android.control.aeLock == true.\n" +
                        "\n" +
                        "In the event of exposure compensation value being changed, camera device may take several frames to reach the newly requested exposure target. During that time, android.control.aeState field will be in the SEARCHING state. Once the new exposure target is reached, android.control.aeState will change from SEARCHING to either CONVERGED, LOCKED (if AE lock is enabled), or FLASH_REQUIRED (if the scene is too dark for still capture).\n" +
                        "\n" +
                        "Units: Compensation steps\n" +
                        "\n" +
                        "Range of valid values:\n" +
                        "android.control.aeCompensationRange\n" +
                        "\n" +
                        "This key is available on all devices.\n" +
                        "\n" +
                        "See also:\n" +
                        "\n" +
                        "CONTROL_AE_COMPENSATION_RANGE\n" +
                        "CONTROL_AE_COMPENSATION_STEP\n" +
                        "CONTROL_AE_LOCK\n" +
                        "CONTROL_AE_MODE\n" +
                        "CONTROL_AE_STATE";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return null;
            }
        },
        CONTROL_AE_LOCK {
            @Override
            public String getDescription() {
                return "Whether auto-exposure (AE) is currently locked to its latest calculated values.";
            }

            @Override
            public Type getType() {
                return CHECK;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NONE;
            }
        },
        CONTROL_AE_MODE {
            @Override
            public String getDescription() {
                return "The desired mode for the camera device's auto-exposure routine.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AE_MODE;
            }
        },
        CONTROL_AE_PRECAPTURE_TRIGGER {
            @Override
            public String getDescription() {
                return "Whether the camera device will trigger a precapture metering sequence when it processes this request.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AE_PRECAPTURE_TRIGGER;
            }
        },
        CONTROL_AF_MODE {
            @Override
            public String getDescription() {
                return "Whether auto-focus (AF) is currently enabled, and what mode it is set to.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AF_MODE;
            }
        },
        CONTROL_AF_TRIGGER {
            @Override
            public String getDescription() {
                return "Whether the camera device will trigger autofocus for this request.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AF_TRIGGER;
            }
        },
        CONTROL_AWB_LOCK {
            @Override
            public String getDescription() {
                return "Whether auto-white balance (AWB) is currently locked to its latest calculated values.";
            }

            @Override
            public Type getType() {
                return CHECK;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NONE;
            }
        },
        CONTROL_AWB_MODE {
            @Override
            public String getDescription() {
                return "Whether auto-white balance (AWB) is currently setting the color transform fields, and what its illumination target is.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_AWB_MODE;
            }
        },
        CONTROL_CAPTURE_INTENT {
            @Override
            public String getDescription() {
                return "Information to the camera device 3A (auto-exposure, auto-focus, auto-white balance) routines about the purpose of this capture, to help the camera device to decide optimal 3A strategy.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_CAPTURE_INTENT;
            }
        },
        CONTROL_EFFECT_MODE {
            @Override
            public String getDescription() {
                return "A special color effect to apply.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_EFFECT_MODE;
            }
        },
        CONTROL_ENABLE_ZSL {
            @Override
            public String getDescription() {
                return "Allow camera device to enable zero-shutter-lag mode for requests with android.control.captureIntent == STILL_CAPTURE.";
            }

            @Override
            public Type getType() {
                return CHECK;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NONE;
            }
        },
        CONTROL_MODE {
            @Override
            public String getDescription() {
                return "Overall mode of 3A (auto-exposure, auto-white-balance, auto-focus) control routines.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_MODE;
            }
        },
        CONTROL_POST_RAW_SENSITIVITY_BOOST {
            @Override
            public String getDescription() {
                return "The amount of additional sensitivity boost applied to output images after RAW sensor data is captured.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            }
        },
        CONTROL_SCENE_MODE {
            @Override
            public String getDescription() {
                return "Control for which scene mode is currently active.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_SCENE_MODE;
            }
        },
        CONTROL_VIDEO_STABILIZATION_MODE {
            @Override
            public String getDescription() {
                return "Whether video stabilization is active.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.CONTROL_VIDEO_STABILIZATION_MODE;
            }
        },
        EDGE_MODE {
            @Override
            public String getDescription() {
                return "Operation mode for edge enhancement.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.EDGE_MODE;
            }
        },
        FLASH_MODE {
            @Override
            public String getDescription() {
                return "The desired mode for for the camera device's flash control.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.FLASH_MODE;
            }
        },
        HOT_PIXEL_MODE {
            @Override
            public String getDescription() {
                return "Operational mode for hot pixel correction.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.HOT_PIXEL_MODE;
            }
        },
        JPEG_ORIENTATION {
            @Override
            public String getDescription() {
                return "The orientation for a JPEG image.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.JPEG_ORIENTATION;
            }
        },
        LENS_APERTURE {
            @Override
            public String getDescription() {
                return "The desired lens aperture size, as a ratio of lens focal length to the effective aperture diameter.";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.LENS_APERTURE;
            }
        },
        LENS_FILTER_DENSITY {
            @Override
            public String getDescription() {
                return "The desired setting for the lens neutral density filter(s).";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.LENS_FILTER_DENSITY;
            }
        },
        LENS_FOCAL_LENGTH {
            @Override
            public String getDescription() {
                return "The desired lens focal length; used for optical zoom.";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.LENS_FOCAL_LENGTH;
            }
        },
        LENS_FOCUS_DISTANCE {
            @Override
            public String getDescription() {
                return "Desired distance to plane of sharpest focus, measured from frontmost surface of the lens.";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.LENS_FOCUS_DISTANCE;
            }
        },
        LENS_OPTICAL_STABILIZATION_MODE {
            @Override
            public String getDescription() {
                return "Sets whether the camera device uses optical image stabilization (OIS) when capturing images.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.LENS_OPTICAL_STABILIZATION_MODE;
            }
        },
        NOISE_REDUCTION_MODE {
            @Override
            public String getDescription() {
                return "Mode of operation for the noise reduction algorithm.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NOISE_REDUCTION_MODE;
            }
        },
        REPROCESS_EFFECTIVE_EXPOSURE_FACTOR {
            @Override
            public String getDescription() {
                return "The amount of exposure time increase factor applied to the original output frame by the application processing before sending for reprocessing.";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR;
            }
        },
        SENSOR_EXPOSURE_TIME {
            @Override
            public String getDescription() {
                return "Duration each pixel is exposed to light.";
            }

            @Override
            public Type getType() {
                return LONG_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.SENSOR_EXPOSURE_TIME;
            }
        },
        SENSOR_FRAME_DURATION {
            @Override
            public String getDescription() {
                return "Duration from start of frame exposure to start of next frame exposure.";
            }

            @Override
            public Type getType() {
                return LONG_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.SENSOR_FRAME_DURATION;
            }
        },
        SENSOR_SENSITIVITY {
            @Override
            public String getDescription() {
                return "The amount of gain applied to sensor data before processing.\n" +
                        "\n" +
                        "The sensitivity is the standard ISO sensitivity value, as defined in ISO 12232:2006.\n" +
                        "\n" +
                        "The sensitivity must be within android.sensor.info.sensitivityRange, and if if it less than android.sensor.maxAnalogSensitivity, the camera device is guaranteed to use only analog amplification for applying the gain.\n" +
                        "\n" +
                        "If the camera device cannot apply the exact sensitivity requested, it will reduce the gain to the nearest supported value. The final sensitivity used will be available in the output capture result.\n" +
                        "\n" +
                        "This control is only effective if android.control.aeMode or android.control.mode is set to OFF; otherwise the auto-exposure algorithm will override this value.\n" +
                        "\n" +
                        "Units: ISO arithmetic units";
            }

            @Override
            public Type getType() {
                return INTEGER_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.SENSOR_SENSITIVITY;
            }
        },
        SENSOR_TEST_PATTERN_MODE {
            @Override
            public String getDescription() {
                return "When enabled, the sensor sends a test pattern instead of doing a real exposure from the camera.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.SENSOR_TEST_PATTERN_MODE;
            }
        },
        SHADING_MODE {
            @Override
            public String getDescription() {
                return "Quality of lens shading correction applied to the image data.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.SHADING_MODE;
            }
        },
        STATISTICS_FACE_DETECT_MODE {
            @Override
            public String getDescription() {
                return "Operating mode for the face detector unit.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.STATISTICS_FACE_DETECT_MODE;
            }
        },
        STATISTICS_HOT_PIXEL_MAP_MODE {
            @Override
            public String getDescription() {
                return "Operating mode for hot pixel map generation.";
            }

            @Override
            public Type getType() {
                return CHECK;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.NONE;
            }
        },
        STATISTICS_LENS_SHADING_MAP_MODE {
            @Override
            public String getDescription() {
                return "Whether the camera device will output the lens shading map in output result metadata.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.STATISTICS_LENS_SHADING_MAP_MODE;
            }
        },
        STATISTICS_OIS_DATA_MODE {
            @Override
            public String getDescription() {
                return "Android P Developer Preview - Whether the camera device outputs the OIS data in output result metadata.";
            }

            @Override
            public Type getType() {
                return NOT_SUPPORTED;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.STATISTICS_OIS_DATA_MODE;
            }
        },
        TONEMAP_GAMMA {
            @Override
            public String getDescription() {
                return "Tonemapping curve to use when android.tonemap.mode is GAMMA_VALUE\n" +
                        "The tonemap curve will be defined the following formula: * OUT = pow(IN, 1.0 / gamma) where IN and OUT is the input pixel value scaled to range [0.0, 1.0], pow is the power function and gamma is the gamma value specified by this key.";
            }

            @Override
            public Type getType() {
                return FLOAT_INPUT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.TONEMAP_GAMMA;
            }
        },
        TONEMAP_MODE {
            @Override
            public String getDescription() {
                return "High-level global contrast/gamma/tonemapping control.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.TONEMAP_MODE;
            }
        },
        TONEMAP_PRESET_CURVE {
            @Override
            public String getDescription() {
                return "Tonemapping curve to use when android.tonemap.mode is PRESET_CURVE\n" +
                        "The tonemap curve will be defined by specified standard.";
            }

            @Override
            public Type getType() {
                return SELECT;
            }

            @Override
            public DetailOption getDetailOption() {
                return DetailOption.TONEMAP_PRESET_CURVE;
            }
        };

        public abstract String getDescription();
        public abstract Type getType();
        public abstract DetailOption getDetailOption();
    }






    @SuppressWarnings("unchecked")
    @SuppressLint("UseSparseArrays")
    public enum DetailOption {
        NONE{
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.NONE;
            }
        },
        COLOR_CORRECTION_ABERRATION_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF, new Option.Info("COLOR_CORRECTION_ABERRATION_MODE_OFF", Description.COLOR_CORRECTION_ABERRATION_MODE_OFF, CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_OFF));
                    detail.put(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST, new Option.Info("COLOR_CORRECTION_ABERRATION_MODE_FAST", Description.COLOR_CORRECTION_ABERRATION_MODE_FAST, CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_FAST));
                    detail.put(CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY, new Option.Info("COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY", Description.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY, CameraMetadata.COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.COLOR_CORRECTION_ABERRATION_MODE;
            }
        },
        COLOR_CORRECTION_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX, new Option.Info("COLOR_CORRECTION_MODE_TRANSFORM_MATRIX", Description.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX, CameraMetadata.COLOR_CORRECTION_MODE_TRANSFORM_MATRIX));
                    detail.put(CameraMetadata.COLOR_CORRECTION_MODE_FAST, new Option.Info("COLOR_CORRECTION_MODE_FAST", Description.COLOR_CORRECTION_MODE_FAST, CameraMetadata.COLOR_CORRECTION_MODE_FAST));
                    detail.put(CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY, new Option.Info("COLOR_CORRECTION_MODE_HIGH_QUALITY", Description.COLOR_CORRECTION_MODE_HIGH_QUALITY, CameraMetadata.COLOR_CORRECTION_MODE_HIGH_QUALITY));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.COLOR_CORRECTION_MODE;
            }
        },
        CONTROL_AE_ANTIBANDING_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF, new Option.Info("CONTROL_AE_ANTIBANDING_MODE_OFF", Description.CONTROL_AE_ANTIBANDING_MODE_OFF, CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ, new Option.Info("CONTROL_AE_ANTIBANDING_MODE_50HZ", Description.CONTROL_AE_ANTIBANDING_MODE_50HZ, CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_50HZ));
                    detail.put(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ, new Option.Info("CONTROL_AE_ANTIBANDING_MODE_60HZ", Description.CONTROL_AE_ANTIBANDING_MODE_60HZ, CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_60HZ));
                    detail.put(CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO, new Option.Info("CONTROL_AE_ANTIBANDING_MODE_AUTO", Description.CONTROL_AE_ANTIBANDING_MODE_AUTO, CameraMetadata.CONTROL_AE_ANTIBANDING_MODE_AUTO));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AE_ANTIBANDING_MODE;
            }
        },
        CONTROL_AE_EXPOSURE_COMPENSATION {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AE_EXPOSURE_COMPENSATION;
            }
        },
        CONTROL_AE_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AE_MODE_OFF, new Option.Info("CONTROL_AE_MODE_OFF", Description.CONTROL_AE_MODE_OFF, CameraMetadata.CONTROL_AE_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_AE_MODE_ON, new Option.Info("CONTROL_AE_MODE_ON", Description.CONTROL_AE_MODE_ON, CameraMetadata.CONTROL_AE_MODE_ON));
                    detail.put(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH, new Option.Info("CONTROL_AE_MODE_ON_AUTO_FLASH", Description.CONTROL_AE_MODE_ON_AUTO_FLASH, CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH));
                    detail.put(CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH, new Option.Info("CONTROL_AE_MODE_ON_ALWAYS_FLASH", Description.CONTROL_AE_MODE_ON_ALWAYS_FLASH, CameraMetadata.CONTROL_AE_MODE_ON_ALWAYS_FLASH));
                    detail.put(CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE, new Option.Info("CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE", Description.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE, CameraMetadata.CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AE_MODE;
            }
        },
        CONTROL_AE_PRECAPTURE_TRIGGER {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE, new Option.Info("CONTROL_AE_PRECAPTURE_TRIGGER_IDLE", Description.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE, CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE));
                    detail.put(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START, new Option.Info("CONTROL_AE_PRECAPTURE_TRIGGER_START", Description.CONTROL_AE_PRECAPTURE_TRIGGER_START, CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_START));
                    detail.put(CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL, new Option.Info("CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL", Description.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL, CameraMetadata.CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AE_PRECAPTURE_TRIGGER;
            }
        },
        CONTROL_AF_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AF_MODE_OFF, new Option.Info("CONTROL_AF_MODE_OFF", Description.CONTROL_AF_MODE_OFF, CameraMetadata.CONTROL_AF_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_AF_MODE_AUTO, new Option.Info("CONTROL_AF_MODE_AUTO", Description.CONTROL_AF_MODE_AUTO, CameraMetadata.CONTROL_AF_MODE_AUTO));
                    detail.put(CameraMetadata.CONTROL_AF_MODE_MACRO, new Option.Info("CONTROL_AF_MODE_MACRO", Description.CONTROL_AF_MODE_MACRO, CameraMetadata.CONTROL_AF_MODE_MACRO));
                    detail.put(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO, new Option.Info("CONTROL_AF_MODE_CONTINUOUS_VIDEO", Description.CONTROL_AF_MODE_CONTINUOUS_VIDEO, CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO));
                    detail.put(CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE, new Option.Info("CONTROL_AF_MODE_CONTINUOUS_PICTURE", Description.CONTROL_AF_MODE_CONTINUOUS_PICTURE, CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE));
                    detail.put(CameraMetadata.CONTROL_AF_MODE_EDOF, new Option.Info("CONTROL_AF_MODE_EDOF", Description.CONTROL_AF_MODE_EDOF, CameraMetadata.CONTROL_AF_MODE_EDOF));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AF_MODE;
            }
        },
        CONTROL_AF_TRIGGER {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AF_TRIGGER_IDLE, new Option.Info("CONTROL_AF_TRIGGER_IDLE", Description.CONTROL_AF_TRIGGER_IDLE, CameraMetadata.CONTROL_AF_TRIGGER_IDLE));
                    detail.put(CameraMetadata.CONTROL_AF_TRIGGER_START, new Option.Info("CONTROL_AF_TRIGGER_START", Description.CONTROL_AF_TRIGGER_START, CameraMetadata.CONTROL_AF_TRIGGER_START));
                    detail.put(CameraMetadata.CONTROL_AF_TRIGGER_CANCEL, new Option.Info("CONTROL_AF_TRIGGER_CANCEL", Description.CONTROL_AF_TRIGGER_CANCEL, CameraMetadata.CONTROL_AF_TRIGGER_CANCEL));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AF_TRIGGER;
            }
        },
        CONTROL_AWB_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_OFF, new Option.Info("CONTROL_AWB_MODE_OFF", Description.CONTROL_AWB_MODE_OFF, CameraMetadata.CONTROL_AWB_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_AUTO, new Option.Info("CONTROL_AWB_MODE_AUTO", Description.CONTROL_AWB_MODE_AUTO, CameraMetadata.CONTROL_AWB_MODE_AUTO));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT, new Option.Info("CONTROL_AWB_MODE_INCANDESCENT", Description.CONTROL_AWB_MODE_INCANDESCENT, CameraMetadata.CONTROL_AWB_MODE_INCANDESCENT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT, new Option.Info("CONTROL_AWB_MODE_FLUORESCENT", Description.CONTROL_AWB_MODE_FLUORESCENT, CameraMetadata.CONTROL_AWB_MODE_FLUORESCENT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT, new Option.Info("CONTROL_AWB_MODE_WARM_FLUORESCENT", Description.CONTROL_AWB_MODE_WARM_FLUORESCENT, CameraMetadata.CONTROL_AWB_MODE_WARM_FLUORESCENT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT, new Option.Info("CONTROL_AWB_MODE_DAYLIGHT", Description.CONTROL_AWB_MODE_DAYLIGHT, CameraMetadata.CONTROL_AWB_MODE_DAYLIGHT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT, new Option.Info("CONTROL_AWB_MODE_CLOUDY_DAYLIGHT", Description.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT, CameraMetadata.CONTROL_AWB_MODE_CLOUDY_DAYLIGHT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_TWILIGHT, new Option.Info("CONTROL_AWB_MODE_TWILIGHT", Description.CONTROL_AWB_MODE_TWILIGHT, CameraMetadata.CONTROL_AWB_MODE_TWILIGHT));
                    detail.put(CameraMetadata.CONTROL_AWB_MODE_SHADE, new Option.Info("CONTROL_AWB_MODE_SHADE", Description.CONTROL_AWB_MODE_SHADE, CameraMetadata.CONTROL_AWB_MODE_SHADE));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_AWB_MODE;
            }
        },
        CONTROL_CAPTURE_INTENT {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM, new Option.Info("CONTROL_CAPTURE_INTENT_CUSTOM", Description.CONTROL_CAPTURE_INTENT_CUSTOM, CameraMetadata.CONTROL_CAPTURE_INTENT_CUSTOM));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW, new Option.Info("CONTROL_CAPTURE_INTENT_PREVIEW", Description.CONTROL_CAPTURE_INTENT_PREVIEW, CameraMetadata.CONTROL_CAPTURE_INTENT_PREVIEW));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE, new Option.Info("CONTROL_CAPTURE_INTENT_STILL_CAPTURE", Description.CONTROL_CAPTURE_INTENT_STILL_CAPTURE, CameraMetadata.CONTROL_CAPTURE_INTENT_STILL_CAPTURE));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD, new Option.Info("CONTROL_CAPTURE_INTENT_VIDEO_RECORD", Description.CONTROL_CAPTURE_INTENT_VIDEO_RECORD, CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_RECORD));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT, new Option.Info("CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT", Description.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT, CameraMetadata.CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG, new Option.Info("CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG", Description.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG, CameraMetadata.CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG));
                    detail.put(CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL, new Option.Info("CONTROL_CAPTURE_INTENT_MANUAL", Description.CONTROL_CAPTURE_INTENT_MANUAL, CameraMetadata.CONTROL_CAPTURE_INTENT_MANUAL));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_CAPTURE_INTENT;
            }
        },
        CONTROL_EFFECT_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_OFF, new Option.Info("CONTROL_EFFECT_MODE_OFF", Description.CONTROL_EFFECT_MODE_OFF, CameraMetadata.CONTROL_EFFECT_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_MONO, new Option.Info("CONTROL_EFFECT_MODE_MONO", Description.CONTROL_EFFECT_MODE_MONO, CameraMetadata.CONTROL_EFFECT_MODE_MONO));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE, new Option.Info("CONTROL_EFFECT_MODE_NEGATIVE", Description.CONTROL_EFFECT_MODE_NEGATIVE, CameraMetadata.CONTROL_EFFECT_MODE_NEGATIVE));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE, new Option.Info("CONTROL_EFFECT_MODE_SOLARIZE", Description.CONTROL_EFFECT_MODE_SOLARIZE, CameraMetadata.CONTROL_EFFECT_MODE_SOLARIZE));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_SEPIA, new Option.Info("CONTROL_EFFECT_MODE_SEPIA", Description.CONTROL_EFFECT_MODE_SEPIA, CameraMetadata.CONTROL_EFFECT_MODE_SEPIA));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE, new Option.Info("CONTROL_EFFECT_MODE_POSTERIZE", Description.CONTROL_EFFECT_MODE_POSTERIZE, CameraMetadata.CONTROL_EFFECT_MODE_POSTERIZE));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD, new Option.Info("CONTROL_EFFECT_MODE_WHITEBOARD", Description.CONTROL_EFFECT_MODE_WHITEBOARD, CameraMetadata.CONTROL_EFFECT_MODE_WHITEBOARD));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD, new Option.Info("CONTROL_EFFECT_MODE_BLACKBOARD", Description.CONTROL_EFFECT_MODE_BLACKBOARD, CameraMetadata.CONTROL_EFFECT_MODE_BLACKBOARD));
                    detail.put(CameraMetadata.CONTROL_EFFECT_MODE_AQUA, new Option.Info("CONTROL_EFFECT_MODE_AQUA", Description.CONTROL_EFFECT_MODE_AQUA, CameraMetadata.CONTROL_EFFECT_MODE_AQUA));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_EFFECT_MODE;
            }
        },
        CONTROL_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_MODE_OFF, new Option.Info("CONTROL_MODE_OFF", Description.CONTROL_MODE_OFF, CameraMetadata.CONTROL_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_MODE_AUTO, new Option.Info("CONTROL_MODE_AUTO", Description.CONTROL_MODE_AUTO, CameraMetadata.CONTROL_MODE_AUTO));
                    detail.put(CameraMetadata.CONTROL_MODE_USE_SCENE_MODE, new Option.Info("CONTROL_MODE_USE_SCENE_MODE", Description.CONTROL_MODE_USE_SCENE_MODE, CameraMetadata.CONTROL_MODE_USE_SCENE_MODE));
                    detail.put(CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE, new Option.Info("CONTROL_MODE_OFF_KEEP_STATE", Description.CONTROL_MODE_OFF_KEEP_STATE, CameraMetadata.CONTROL_MODE_OFF_KEEP_STATE));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_MODE;
            }
        },
        CONTROL_POST_RAW_SENSITIVITY_BOOST {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    //TODO ????
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            }
        },
        CONTROL_SCENE_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_DISABLED, new Option.Info("CONTROL_SCENE_MODE_DISABLED", Description.CONTROL_SCENE_MODE_DISABLED, CameraMetadata.CONTROL_SCENE_MODE_DISABLED));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY, new Option.Info("CONTROL_SCENE_MODE_FACE_PRIORITY", Description.CONTROL_SCENE_MODE_FACE_PRIORITY, CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_ACTION, new Option.Info("CONTROL_SCENE_MODE_ACTION", Description.CONTROL_SCENE_MODE_ACTION, CameraMetadata.CONTROL_SCENE_MODE_ACTION));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT, new Option.Info("CONTROL_SCENE_MODE_PORTRAIT", Description.CONTROL_SCENE_MODE_PORTRAIT, CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE, new Option.Info("CONTROL_SCENE_MODE_LANDSCAPE", Description.CONTROL_SCENE_MODE_LANDSCAPE, CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_NIGHT, new Option.Info("CONTROL_SCENE_MODE_NIGHT", Description.CONTROL_SCENE_MODE_NIGHT, CameraMetadata.CONTROL_SCENE_MODE_NIGHT));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT, new Option.Info("CONTROL_SCENE_MODE_NIGHT_PORTRAIT", Description.CONTROL_SCENE_MODE_NIGHT_PORTRAIT, CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_THEATRE, new Option.Info("CONTROL_SCENE_MODE_THEATRE", Description.CONTROL_SCENE_MODE_THEATRE, CameraMetadata.CONTROL_SCENE_MODE_THEATRE));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_BEACH, new Option.Info("CONTROL_SCENE_MODE_BEACH", Description.CONTROL_SCENE_MODE_BEACH, CameraMetadata.CONTROL_SCENE_MODE_BEACH));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_SNOW, new Option.Info("CONTROL_SCENE_MODE_SNOW", Description.CONTROL_SCENE_MODE_SNOW, CameraMetadata.CONTROL_SCENE_MODE_SNOW));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_SUNSET, new Option.Info("CONTROL_SCENE_MODE_SUNSET", Description.CONTROL_SCENE_MODE_SUNSET, CameraMetadata.CONTROL_SCENE_MODE_SUNSET));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO, new Option.Info("CONTROL_SCENE_MODE_STEADYPHOTO", Description.CONTROL_SCENE_MODE_STEADYPHOTO, CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS, new Option.Info("CONTROL_SCENE_MODE_FIREWORKS", Description.CONTROL_SCENE_MODE_FIREWORKS, CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_SPORTS, new Option.Info("CONTROL_SCENE_MODE_SPORTS", Description.CONTROL_SCENE_MODE_SPORTS, CameraMetadata.CONTROL_SCENE_MODE_SPORTS));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_PARTY, new Option.Info("CONTROL_SCENE_MODE_PARTY", Description.CONTROL_SCENE_MODE_PARTY, CameraMetadata.CONTROL_SCENE_MODE_PARTY));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT, new Option.Info("CONTROL_SCENE_MODE_CANDLELIGHT", Description.CONTROL_SCENE_MODE_CANDLELIGHT, CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_BARCODE, new Option.Info("CONTROL_SCENE_MODE_BARCODE", Description.CONTROL_SCENE_MODE_BARCODE, CameraMetadata.CONTROL_SCENE_MODE_BARCODE));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO, new Option.Info("CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO", Description.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO, CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO));
                    detail.put(CameraMetadata.CONTROL_SCENE_MODE_HDR, new Option.Info("CONTROL_SCENE_MODE_HDR", Description.CONTROL_SCENE_MODE_HDR, CameraMetadata.CONTROL_SCENE_MODE_HDR));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_SCENE_MODE;
            }
        },
        CONTROL_VIDEO_STABILIZATION_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_OFF, new Option.Info("CONTROL_VIDEO_STABILIZATION_MODE_OFF", Description.CONTROL_VIDEO_STABILIZATION_MODE_OFF, CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_OFF));
                    detail.put(CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_ON, new Option.Info("CONTROL_VIDEO_STABILIZATION_MODE_ON", Description.CONTROL_VIDEO_STABILIZATION_MODE_ON, CameraMetadata.CONTROL_VIDEO_STABILIZATION_MODE_ON));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.CONTROL_VIDEO_STABILIZATION_MODE;
            }
        },
        EDGE_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.EDGE_MODE_OFF, new Option.Info("EDGE_MODE_OFF", Description.EDGE_MODE_OFF, CameraMetadata.EDGE_MODE_OFF));
                    detail.put(CameraMetadata.EDGE_MODE_FAST, new Option.Info("EDGE_MODE_FAST", Description.EDGE_MODE_FAST, CameraMetadata.EDGE_MODE_FAST));
                    detail.put(CameraMetadata.EDGE_MODE_HIGH_QUALITY, new Option.Info("EDGE_MODE_HIGH_QUALITY", Description.EDGE_MODE_HIGH_QUALITY, CameraMetadata.EDGE_MODE_HIGH_QUALITY));
                    detail.put(CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG, new Option.Info("EDGE_MODE_ZERO_SHUTTER_LAG", Description.EDGE_MODE_ZERO_SHUTTER_LAG, CameraMetadata.EDGE_MODE_ZERO_SHUTTER_LAG));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.EDGE_MODE;
            }
        },
        FLASH_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.FLASH_MODE_OFF, new Option.Info("FLASH_MODE_OFF", Description.FLASH_MODE_OFF, CameraMetadata.FLASH_MODE_OFF));
                    detail.put(CameraMetadata.FLASH_MODE_SINGLE, new Option.Info("FLASH_MODE_SINGLE", Description.FLASH_MODE_SINGLE, CameraMetadata.FLASH_MODE_SINGLE));
                    detail.put(CameraMetadata.FLASH_MODE_TORCH, new Option.Info("FLASH_MODE_TORCH", Description.FLASH_MODE_TORCH, CameraMetadata.FLASH_MODE_TORCH));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.FLASH_MODE;
            }
        },
        HOT_PIXEL_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.HOT_PIXEL_MODE_OFF, new Option.Info("HOT_PIXEL_MODE_OFF", Description.HOT_PIXEL_MODE_OFF, CameraMetadata.HOT_PIXEL_MODE_OFF));
                    detail.put(CameraMetadata.HOT_PIXEL_MODE_FAST, new Option.Info("HOT_PIXEL_MODE_FAST", Description.HOT_PIXEL_MODE_FAST, CameraMetadata.HOT_PIXEL_MODE_FAST));
                    detail.put(CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY, new Option.Info("HOT_PIXEL_MODE_HIGH_QUALITY", Description.HOT_PIXEL_MODE_HIGH_QUALITY, CameraMetadata.HOT_PIXEL_MODE_HIGH_QUALITY));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.HOT_PIXEL_MODE;
            }
        },
        JPEG_ORIENTATION {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
//                if (detail == null) {
//                    detail = new HashMap<>();
//                    detail.put(new Option.Info("ROTATION_0", "rotation 0(value : 90)", 90));
//                    detail.put(new Option.Info("ROTATION_90", "rotation 90(value : 0)", 0));
//                    detail.put(new Option.Info("ROTATION_180", "rotation 180(value : 270)", 270));
//                    detail.put(new Option.Info("ROTATION_270", "rotation 270(value : 180)", 180));
//                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.JPEG_ORIENTATION;
            }
        },
        LENS_APERTURE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.LENS_APERTURE;
            }
        },
        LENS_FILTER_DENSITY {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.LENS_FILTER_DENSITY;
            }
        },
        LENS_FOCAL_LENGTH {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.LENS_FOCAL_LENGTH;
            }
        },
        LENS_FOCUS_DISTANCE {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.LENS_FOCUS_DISTANCE;
            }
        },
        LENS_OPTICAL_STABILIZATION_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF, new Option.Info("LENS_OPTICAL_STABILIZATION_MODE_OFF", Description.LENS_OPTICAL_STABILIZATION_MODE_OFF, CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_OFF));
                    detail.put(CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON, new Option.Info("LENS_OPTICAL_STABILIZATION_MODE_ON", Description.LENS_OPTICAL_STABILIZATION_MODE_ON, CameraMetadata.LENS_OPTICAL_STABILIZATION_MODE_ON));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.LENS_OPTICAL_STABILIZATION_MODE;
            }
        },
        NOISE_REDUCTION_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.NOISE_REDUCTION_MODE_OFF, new Option.Info("NOISE_REDUCTION_MODE_OFF", Description.NOISE_REDUCTION_MODE_OFF, CameraMetadata.NOISE_REDUCTION_MODE_OFF));
                    detail.put(CameraMetadata.NOISE_REDUCTION_MODE_FAST, new Option.Info("NOISE_REDUCTION_MODE_FAST", Description.NOISE_REDUCTION_MODE_FAST, CameraMetadata.NOISE_REDUCTION_MODE_FAST));
                    detail.put(CameraMetadata.NOISE_REDUCTION_MODE_HIGH_QUALITY, new Option.Info("NOISE_REDUCTION_MODE_HIGH_QUALITY", Description.NOISE_REDUCTION_MODE_HIGH_QUALITY, CameraMetadata.NOISE_REDUCTION_MODE_HIGH_QUALITY));
                    detail.put(CameraMetadata.NOISE_REDUCTION_MODE_MINIMAL, new Option.Info("NOISE_REDUCTION_MODE_MINIMAL", Description.NOISE_REDUCTION_MODE_MINIMAL, CameraMetadata.NOISE_REDUCTION_MODE_MINIMAL));
                    detail.put(CameraMetadata.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG, new Option.Info("NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG", Description.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG, CameraMetadata.NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.NOISE_REDUCTION_MODE;
            }
        },
        REPROCESS_EFFECTIVE_EXPOSURE_FACTOR {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR;
            }
        },
        SENSOR_EXPOSURE_TIME {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.SENSOR_EXPOSURE_TIME;
            }
        },
        SENSOR_FRAME_DURATION {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.SENSOR_FRAME_DURATION;
            }
        },
        SENSOR_SENSITIVITY {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.SENSOR_SENSITIVITY;
            }
        },
        SENSOR_TEST_PATTERN_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF, new Option.Info("SENSOR_TEST_PATTERN_MODE_OFF", Description.SENSOR_TEST_PATTERN_MODE_OFF, CameraMetadata.SENSOR_TEST_PATTERN_MODE_OFF));
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR, new Option.Info("SENSOR_TEST_PATTERN_MODE_SOLID_COLOR", Description.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR, CameraMetadata.SENSOR_TEST_PATTERN_MODE_SOLID_COLOR));
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS, new Option.Info("SENSOR_TEST_PATTERN_MODE_COLOR_BARS", Description.SENSOR_TEST_PATTERN_MODE_COLOR_BARS, CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS));
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY, new Option.Info("SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY", Description.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY, CameraMetadata.SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY));
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9, new Option.Info("SENSOR_TEST_PATTERN_MODE_PN9", Description.SENSOR_TEST_PATTERN_MODE_PN9, CameraMetadata.SENSOR_TEST_PATTERN_MODE_PN9));
                    detail.put(CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1, new Option.Info("SENSOR_TEST_PATTERN_MODE_CUSTOM1", Description.SENSOR_TEST_PATTERN_MODE_CUSTOM1, CameraMetadata.SENSOR_TEST_PATTERN_MODE_CUSTOM1));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.SENSOR_TEST_PATTERN_MODE;
            }
        },
        SHADING_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.SHADING_MODE_OFF, new Option.Info("SHADING_MODE_OFF", Description.SHADING_MODE_OFF, CameraMetadata.SHADING_MODE_OFF));
                    detail.put(CameraMetadata.SHADING_MODE_FAST, new Option.Info("SHADING_MODE_FAST", Description.SHADING_MODE_FAST, CameraMetadata.SHADING_MODE_FAST));
                    detail.put(CameraMetadata.SHADING_MODE_HIGH_QUALITY, new Option.Info("SHADING_MODE_HIGH_QUALITY", Description.SHADING_MODE_HIGH_QUALITY, CameraMetadata.SHADING_MODE_HIGH_QUALITY));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.SHADING_MODE;
            }
        },
        STATISTICS_FACE_DETECT_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF, new Option.Info("STATISTICS_FACE_DETECT_MODE_OFF", Description.STATISTICS_FACE_DETECT_MODE_OFF, CameraMetadata.STATISTICS_FACE_DETECT_MODE_OFF));
                    detail.put(CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE, new Option.Info("STATISTICS_FACE_DETECT_MODE_SIMPLE", Description.STATISTICS_FACE_DETECT_MODE_SIMPLE, CameraMetadata.STATISTICS_FACE_DETECT_MODE_SIMPLE));
                    detail.put(CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL, new Option.Info("STATISTICS_FACE_DETECT_MODE_FULL", Description.STATISTICS_FACE_DETECT_MODE_FULL, CameraMetadata.STATISTICS_FACE_DETECT_MODE_FULL));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.STATISTICS_FACE_DETECT_MODE;
            }
        },
        STATISTICS_LENS_SHADING_MAP_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF, new Option.Info("STATISTICS_LENS_SHADING_MAP_MODE_OFF", Description.STATISTICS_LENS_SHADING_MAP_MODE_OFF, CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_OFF));
                    detail.put(CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON, new Option.Info("STATISTICS_LENS_SHADING_MAP_MODE_ON", Description.STATISTICS_LENS_SHADING_MAP_MODE_ON, CameraMetadata.STATISTICS_LENS_SHADING_MAP_MODE_ON));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.STATISTICS_LENS_SHADING_MAP_MODE;
            }
        },
        STATISTICS_OIS_DATA_MODE {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.STATISTICS_OIS_DATA_MODE;
            }
        },
        TONEMAP_GAMMA {
            @Override
            public Map<Integer, Option.Info> get() {
                return null;
            }

            @Override
            public Subject getParentOption() {
                return Subject.TONEMAP_GAMMA;
            }
        },
        TONEMAP_MODE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.TONEMAP_MODE_CONTRAST_CURVE, new Option.Info("TONEMAP_MODE_CONTRAST_CURVE", Description.TONEMAP_MODE_CONTRAST_CURVE, CameraMetadata.TONEMAP_MODE_CONTRAST_CURVE));
                    detail.put(CameraMetadata.TONEMAP_MODE_FAST, new Option.Info("TONEMAP_MODE_FAST", Description.TONEMAP_MODE_FAST, CameraMetadata.TONEMAP_MODE_FAST));
                    detail.put(CameraMetadata.TONEMAP_MODE_HIGH_QUALITY, new Option.Info("TONEMAP_MODE_HIGH_QUALITY", Description.TONEMAP_MODE_HIGH_QUALITY, CameraMetadata.TONEMAP_MODE_HIGH_QUALITY));
                    detail.put(CameraMetadata.TONEMAP_MODE_GAMMA_VALUE, new Option.Info("TONEMAP_MODE_GAMMA_VALUE", Description.TONEMAP_MODE_GAMMA_VALUE, CameraMetadata.TONEMAP_MODE_GAMMA_VALUE));
                    detail.put(CameraMetadata.TONEMAP_MODE_PRESET_CURVE, new Option.Info("TONEMAP_MODE_PRESET_CURVE", Description.TONEMAP_MODE_PRESET_CURVE, CameraMetadata.TONEMAP_MODE_PRESET_CURVE));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.TONEMAP_MODE;
            }
        },
        TONEMAP_PRESET_CURVE {
            private Map<Integer, Option.Info> detail;

            @Override
            public Map<Integer, Option.Info> get() {
                if (detail == null) {
                    detail = new HashMap<>();
                    detail.put(CameraMetadata.TONEMAP_PRESET_CURVE_SRGB, new Option.Info("TONEMAP_PRESET_CURVE_SRGB", Description.TONEMAP_PRESET_CURVE_SRGB, CameraMetadata.TONEMAP_PRESET_CURVE_SRGB));
                    detail.put(CameraMetadata.TONEMAP_PRESET_CURVE_REC709, new Option.Info("TONEMAP_PRESET_CURVE_REC709", Description.TONEMAP_PRESET_CURVE_REC709, CameraMetadata.TONEMAP_PRESET_CURVE_REC709));
                }
                return detail;
            }

            @Override
            public Subject getParentOption() {
                return Subject.TONEMAP_PRESET_CURVE;
            }
        };
        public abstract Map<Integer, Option.Info> get();
        public abstract CameraAllOption.Subject getParentOption();
    }




    public enum Type {
        NOT_SUPPORTED, CHECK, SELECT, INTEGER_INPUT, FLOAT_INPUT, LONG_INPUT
    }

}
