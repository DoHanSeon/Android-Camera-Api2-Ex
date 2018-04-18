package com.example.hs.mycamera2.option;

/**
 * Created by user on 2018. 4. 17..
 */

public class Description {

    //COLOR_CORRECTION_ABERRATION_MODE
    public static final String COLOR_CORRECTION_ABERRATION_MODE_OFF =
            "No aberration correction is applied.";

    public static final String COLOR_CORRECTION_ABERRATION_MODE_FAST =
            "Aberration correction will not slow down capture rate relative to sensor raw output.\n" +
                    "\n";

    public static final String COLOR_CORRECTION_ABERRATION_MODE_HIGH_QUALITY =
            "Aberration correction operates at improved quality but the capture rate might be reduced (relative to sensor raw output rate)";

    //COLOR_CORRECTION_MODE
    public static final String COLOR_CORRECTION_MODE_TRANSFORM_MATRIX =
            "Use the android.colorCorrection.transform matrix and android.colorCorrection.gains to do color conversion.\n" +
                    "\n" +
                    "All advanced white balance adjustments (not specified by our white balance pipeline) must be disabled.\n" +
                    "\n" +
                    "If AWB is enabled with android.control.awbMode != OFF, then TRANSFORM_MATRIX is ignored. The camera device will override this value to either FAST or HIGH_QUALITY.";

    public static final String COLOR_CORRECTION_MODE_FAST =
            "Color correction processing must not slow down capture rate relative to sensor raw output.\n" +
                    "\n" +
                    "Advanced white balance adjustments above and beyond the specified white balance pipeline may be applied.\n" +
                    "\n" +
                    "If AWB is enabled with android.control.awbMode != OFF, then the camera device uses the last frame's AWB values (or defaults if AWB has never been run).";

    public static final String COLOR_CORRECTION_MODE_HIGH_QUALITY =
            "Color correction processing operates at improved quality but the capture rate might be reduced (relative to sensor raw output rate)\n" +
                    "\n" +
                    "Advanced white balance adjustments above and beyond the specified white balance pipeline may be applied.\n" +
                    "\n" +
                    "If AWB is enabled with android.control.awbMode != OFF, then the camera device uses the last frame's AWB values (or defaults if AWB has never been run).";

    //CONTROL_AE_ANTIBANDING_MODE
    public static final String CONTROL_AE_ANTIBANDING_MODE_OFF =
            "The camera device will not adjust exposure duration to avoid banding problems.";

    public static final String CONTROL_AE_ANTIBANDING_MODE_50HZ =
            "The camera device will adjust exposure duration to avoid banding problems with 50Hz illumination sources.";

    public static final String CONTROL_AE_ANTIBANDING_MODE_60HZ =
            "The camera device will adjust exposure duration to avoid banding problems with 60Hz illumination sources.";

    public static final String CONTROL_AE_ANTIBANDING_MODE_AUTO =
            "The camera device will automatically adapt its antibanding routine to the current illumination condition. This is the default mode if AUTO is available on given camera device.";

    //CONTROL_AE_MODE
    public static final String CONTROL_AE_MODE_OFF =
            "The camera device's autoexposure routine is disabled.\n" +
                    "\n" +
                    "The application-selected android.sensor.exposureTime, android.sensor.sensitivity and android.sensor.frameDuration are used by the camera device, along with android.flash.* fields, if there's a flash unit for this camera device.\n" +
                    "\n" +
                    "Note that auto-white balance (AWB) and auto-focus (AF) behavior is device dependent when AE is in OFF mode. To have consistent behavior across different devices, it is recommended to either set AWB and AF to OFF mode or lock AWB and AF before setting AE to OFF. See android.control.awbMode, android.control.afMode, android.control.awbLock, and android.control.afTrigger for more details.\n" +
                    "\n" +
                    "LEGACY devices do not support the OFF mode and will override attempts to use this value to ON.";

    public static final String CONTROL_AE_MODE_ON =
            "The camera device's autoexposure routine is active, with no flash control.\n" +
                    "\n" +
                    "The application's values for android.sensor.exposureTime, android.sensor.sensitivity, and android.sensor.frameDuration are ignored. The application has control over the various android.flash.* fields.";

    public static final String CONTROL_AE_MODE_ON_AUTO_FLASH =
            "Like ON, except that the camera device also controls the camera's flash unit, firing it in low-light conditions.\n" +
                    "\n" +
                    "The flash may be fired during a precapture sequence (triggered by android.control.aePrecaptureTrigger) and may be fired for captures for which the android.control.captureIntent field is set to STILL_CAPTURE";

    public static final String CONTROL_AE_MODE_ON_ALWAYS_FLASH =
            "Like ON, except that the camera device also controls the camera's flash unit, always firing it for still captures.\n" +
                    "\n" +
                    "The flash may be fired during a precapture sequence (triggered by android.control.aePrecaptureTrigger) and will always be fired for captures for which the android.control.captureIntent field is set to STILL_CAPTURE";

    public static final String CONTROL_AE_MODE_ON_AUTO_FLASH_REDEYE =
            "Like ON_AUTO_FLASH, but with automatic red eye reduction.\n" +
                    "\n" +
                    "If deemed necessary by the camera device, a red eye reduction flash will fire during the precapture sequence.";

    //CONTROL_AE_PRECAPTURE_TRIGGER
    public static final String CONTROL_AE_PRECAPTURE_TRIGGER_IDLE =
            "The trigger is idle.";

    public static final String CONTROL_AE_PRECAPTURE_TRIGGER_START =
            "The precapture metering sequence will be started by the camera device.\n" +
                    "\n" +
                    "The exact effect of the precapture trigger depends on the current AE mode and state.";

    public static final String CONTROL_AE_PRECAPTURE_TRIGGER_CANCEL =
            "The camera device will cancel any currently active or completed precapture metering sequence, the auto-exposure routine will return to its initial state.";

    //CONTROL_AF_MODE
    public static final String CONTROL_AF_MODE_OFF =
            "The auto-focus routine does not control the lens; android.lens.focusDistance is controlled by the application.";

    public static final String CONTROL_AF_MODE_AUTO =
            "Basic automatic focus mode.\n" +
                    "\n" +
                    "In this mode, the lens does not move unless the autofocus trigger action is called. When that trigger is activated, AF will transition to ACTIVE_SCAN, then to the outcome of the scan (FOCUSED or NOT_FOCUSED).\n" +
                    "\n" +
                    "Always supported if lens is not fixed focus.\n" +
                    "\n" +
                    "Use android.lens.info.minimumFocusDistance to determine if lens is fixed-focus.\n" +
                    "\n" +
                    "Triggering AF_CANCEL resets the lens position to default, and sets the AF state to INACTIVE.";

    public static final String CONTROL_AF_MODE_MACRO =
            "Close-up focusing mode.\n" +
                    "\n" +
                    "In this mode, the lens does not move unless the autofocus trigger action is called. When that trigger is activated, AF will transition to ACTIVE_SCAN, then to the outcome of the scan (FOCUSED or NOT_FOCUSED). This mode is optimized for focusing on objects very close to the camera.\n" +
                    "\n" +
                    "When that trigger is activated, AF will transition to ACTIVE_SCAN, then to the outcome of the scan (FOCUSED or NOT_FOCUSED). Triggering cancel AF resets the lens position to default, and sets the AF state to INACTIVE.";

    public static final String CONTROL_AF_MODE_CONTINUOUS_VIDEO =
            "In this mode, the AF algorithm modifies the lens position continually to attempt to provide a constantly-in-focus image stream.\n" +
                    "\n" +
                    "The focusing behavior should be suitable for good quality video recording; typically this means slower focus movement and no overshoots. When the AF trigger is not involved, the AF algorithm should start in INACTIVE state, and then transition into PASSIVE_SCAN and PASSIVE_FOCUSED states as appropriate. When the AF trigger is activated, the algorithm should immediately transition into AF_FOCUSED or AF_NOT_FOCUSED as appropriate, and lock the lens position until a cancel AF trigger is received.\n" +
                    "\n" +
                    "Once cancel is received, the algorithm should transition back to INACTIVE and resume passive scan. Note that this behavior is not identical to CONTINUOUS_PICTURE, since an ongoing PASSIVE_SCAN must immediately be canceled.";

    public static final String CONTROL_AF_MODE_CONTINUOUS_PICTURE =
            "In this mode, the AF algorithm modifies the lens position continually to attempt to provide a constantly-in-focus image stream.\n" +
                    "\n" +
                    "The focusing behavior should be suitable for still image capture; typically this means focusing as fast as possible. When the AF trigger is not involved, the AF algorithm should start in INACTIVE state, and then transition into PASSIVE_SCAN and PASSIVE_FOCUSED states as appropriate as it attempts to maintain focus. When the AF trigger is activated, the algorithm should finish its PASSIVE_SCAN if active, and then transition into AF_FOCUSED or AF_NOT_FOCUSED as appropriate, and lock the lens position until a cancel AF trigger is received.\n" +
                    "\n" +
                    "When the AF cancel trigger is activated, the algorithm should transition back to INACTIVE and then act as if it has just been started.";

    public static final String CONTROL_AF_MODE_EDOF =
            "Extended depth of field (digital focus) mode.\n" +
                    "\n" +
                    "The camera device will produce images with an extended depth of field automatically; no special focusing operations need to be done before taking a picture.\n" +
                    "\n" +
                    "AF triggers are ignored, and the AF state will always be INACTIVE.";

    //CONTROL_AF_TRIGGER
    public static final String CONTROL_AF_TRIGGER_IDLE =
            "The trigger is idle.";

    public static final String CONTROL_AF_TRIGGER_START =
            "Autofocus will trigger now.";

    public static final String CONTROL_AF_TRIGGER_CANCEL =
            "Autofocus will return to its initial state, and cancel any currently active trigger.";

    //CONTROL_AWB_MODE
    public static final String CONTROL_AWB_MODE_OFF =
            "The camera device's auto-white balance routine is disabled.\n" +
                    "\n" +
                    "The application-selected color transform matrix (android.colorCorrection.transform) and gains (android.colorCorrection.gains) are used by the camera device for manual white balance control.";

    public static final String CONTROL_AWB_MODE_AUTO =
            "The camera device's auto-white balance routine is active.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_INCANDESCENT =
            "The camera device's auto-white balance routine is disabled; the camera device uses incandescent light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "While the exact white balance transforms are up to the camera device, they will approximately match the CIE standard illuminant A.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_FLUORESCENT =
            "The camera device's auto-white balance routine is disabled; the camera device uses fluorescent light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "While the exact white balance transforms are up to the camera device, they will approximately match the CIE standard illuminant F2.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_WARM_FLUORESCENT =
            "The camera device's auto-white balance routine is disabled; the camera device uses warm fluorescent light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "While the exact white balance transforms are up to the camera device, they will approximately match the CIE standard illuminant F4.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_DAYLIGHT =
            "The camera device's auto-white balance routine is disabled; the camera device uses daylight light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "While the exact white balance transforms are up to the camera device, they will approximately match the CIE standard illuminant D65.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_CLOUDY_DAYLIGHT =
            "The camera device's auto-white balance routine is disabled; the camera device uses cloudy daylight light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_TWILIGHT =
            "The camera device's auto-white balance routine is disabled; the camera device uses twilight light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    public static final String CONTROL_AWB_MODE_SHADE =
            "The camera device's auto-white balance routine is disabled; the camera device uses shade light as the assumed scene illumination for white balance.\n" +
                    "\n" +
                    "The application's values for android.colorCorrection.transform and android.colorCorrection.gains are ignored. For devices that support the MANUAL_POST_PROCESSING capability, the values used by the camera device for the transform and gains will be available in the capture result for this request.";

    //CONTROL_CAPTURE_INTENT
    public static final String CONTROL_CAPTURE_INTENT_CUSTOM =
            "The goal of this request doesn't fall into the other categories. The camera device will default to preview-like behavior.";

    public static final String CONTROL_CAPTURE_INTENT_PREVIEW =
            "This request is for a preview-like use case.\n" +
                    "\n" +
                    "The precapture trigger may be used to start off a metering w/flash sequence.";

    public static final String CONTROL_CAPTURE_INTENT_STILL_CAPTURE =
            "This request is for a still capture-type use case.\n" +
                    "\n" +
                    "If the flash unit is under automatic control, it may fire as needed.";

    public static final String CONTROL_CAPTURE_INTENT_VIDEO_RECORD =
            "This request is for a video recording use case.";

    public static final String CONTROL_CAPTURE_INTENT_VIDEO_SNAPSHOT =
            "This request is for a video snapshot (still image while recording video) use case.\n" +
                    "\n" +
                    "The camera device should take the highest-quality image possible (given the other settings) without disrupting the frame rate of video recording.";

    public static final String CONTROL_CAPTURE_INTENT_ZERO_SHUTTER_LAG =
            "This request is for a ZSL usecase; the application will stream full-resolution images and reprocess one or several later for a final capture.";

    public static final String CONTROL_CAPTURE_INTENT_MANUAL =
            "This request is for manual capture use case where the applications want to directly control the capture parameters.\n" +
                    "\n" +
                    "For example, the application may wish to manually control android.sensor.exposureTime, android.sensor.sensitivity, etc.";

    //CONTROL_EFFECT_MODE
    public static final String CONTROL_EFFECT_MODE_OFF =
            "No color effect will be applied.";

    public static final String CONTROL_EFFECT_MODE_MONO =
            "A \"monocolor\" effect where the image is mapped into a single color.\n" +
                    "\n" +
                    "This will typically be grayscale.";

    public static final String CONTROL_EFFECT_MODE_NEGATIVE =
            "A \"photo-negative\" effect where the image's colors are inverted.";

    public static final String CONTROL_EFFECT_MODE_SOLARIZE =
            "A \"solarisation\" effect (Sabattier effect) where the image is wholly or partially reversed in tone.";

    public static final String CONTROL_EFFECT_MODE_SEPIA =
            "A \"sepia\" effect where the image is mapped into warm gray, red, and brown tones.";

    public static final String CONTROL_EFFECT_MODE_POSTERIZE =
            "A \"posterization\" effect where the image uses discrete regions of tone rather than a continuous gradient of tones.\n" +
                    "\n";

    public static final String CONTROL_EFFECT_MODE_WHITEBOARD =
            "A \"whiteboard\" effect where the image is typically displayed as regions of white, with black or grey details.";

    public static final String CONTROL_EFFECT_MODE_BLACKBOARD =
            "A \"blackboard\" effect where the image is typically displayed as regions of black, with white or grey details.";

    public static final String CONTROL_EFFECT_MODE_AQUA =
            "An \"aqua\" effect where a blue hue is added to the image.";

    //CONTROL_MODE
    public static final String CONTROL_MODE_OFF =
            "Full application control of pipeline.\n" +
                    "\n" +
                    "All control by the device's metering and focusing (3A) routines is disabled, and no other settings in android.control.* have any effect, except that android.control.captureIntent may be used by the camera device to select post-processing values for processing blocks that do not allow for manual control, or are not exposed by the camera API.\n" +
                    "\n" +
                    "However, the camera device's 3A routines may continue to collect statistics and update their internal state so that when control is switched to AUTO mode, good control values can be immediately applied.";

    public static final String CONTROL_MODE_AUTO =
            "Use settings for each individual 3A routine.\n" +
                    "\n" +
                    "Manual control of capture parameters is disabled. All controls in android.control.* besides sceneMode take effect.";

    public static final String CONTROL_MODE_USE_SCENE_MODE =
            "Use a specific scene mode.\n" +
                    "\n" +
                    "Enabling this disables control.aeMode, control.awbMode and control.afMode controls; the camera device will ignore those settings while USE_SCENE_MODE is active (except for FACE_PRIORITY scene mode). Other control entries are still active. This setting can only be used if scene mode is supported (i.e. android.control.availableSceneModes contain some modes other than DISABLED).";

    public static final String CONTROL_MODE_OFF_KEEP_STATE =
            "Same as OFF mode, except that this capture will not be used by camera device background auto-exposure, auto-white balance and auto-focus algorithms (3A) to update their statistics.\n" +
                    "\n" +
                    "Specifically, the 3A routines are locked to the last values set from a request with AUTO, OFF, or USE_SCENE_MODE, and any statistics or state updates collected from manual captures with OFF_KEEP_STATE will be discarded by the camera device.";

    //CONTROL_POST_RAW_SENSITIVITY_BOOST
    //???

    //CONTROL_SCENE_MODE
    public static final String CONTROL_SCENE_MODE_DISABLED =
            "Indicates that no scene modes are set for a given capture request.";

    public static final String CONTROL_SCENE_MODE_FACE_PRIORITY =
            "If face detection support exists, use face detection data for auto-focus, auto-white balance, and auto-exposure routines.\n" +
                    "\n" +
                    "If face detection statistics are disabled (i.e. android.statistics.faceDetectMode is set to OFF), this should still operate correctly (but will not return face detection statistics to the framework).\n" +
                    "\n" +
                    "Unlike the other scene modes, android.control.aeMode, android.control.awbMode, and android.control.afMode remain active when FACE_PRIORITY is set.";

    public static final String CONTROL_SCENE_MODE_ACTION =
            "Optimized for photos of quickly moving objects.\n" +
                    "\n" +
                    "Similar to SPORTS.";

    public static final String CONTROL_SCENE_MODE_PORTRAIT =
            "Optimized for still photos of people.";

    public static final String CONTROL_SCENE_MODE_LANDSCAPE =
            "Optimized for photos of distant macroscopic objects.";

    public static final String CONTROL_SCENE_MODE_NIGHT =
            "Optimized for low-light settings.";

    public static final String CONTROL_SCENE_MODE_NIGHT_PORTRAIT =
            "Optimized for still photos of people in low-light settings.";

    public static final String CONTROL_SCENE_MODE_THEATRE =
            "Optimized for dim, indoor settings where flash must remain off.";

    public static final String CONTROL_SCENE_MODE_BEACH =
            "Optimized for bright, outdoor beach settings.";

    public static final String CONTROL_SCENE_MODE_SNOW =
            "Optimized for bright, outdoor settings containing snow.";

    public static final String CONTROL_SCENE_MODE_SUNSET =
            "Optimized for scenes of the setting sun.";

    public static final String CONTROL_SCENE_MODE_STEADYPHOTO =
            "Optimized to avoid blurry photos due to small amounts of device motion (for example: due to hand shake).";

    public static final String CONTROL_SCENE_MODE_FIREWORKS =
            "Optimized for nighttime photos of fireworks.";

    public static final String CONTROL_SCENE_MODE_SPORTS =
            "Optimized for photos of quickly moving people.\n" +
                    "\n" +
                    "Similar to ACTION.";

    public static final String CONTROL_SCENE_MODE_PARTY =
            "Optimized for dim, indoor settings with multiple moving people.";

    public static final String CONTROL_SCENE_MODE_CANDLELIGHT =
            "Optimized for dim settings where the main light source is a flame.";

    public static final String CONTROL_SCENE_MODE_BARCODE =
            "Optimized for accurately capturing a photo of barcode for use by camera applications that wish to read the barcode value.";

    public static final String CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO =
            "This constant was deprecated in API level 23.\n" +
                    "Please refer to this API documentation to find the alternatives.\n" +
                    "This is deprecated, please use createConstrainedHighSpeedCaptureSession(List, CameraCaptureSession.StateCallback, Handler) and createHighSpeedRequestList(CaptureRequest) for high speed video recording.";

    public static final String CONTROL_SCENE_MODE_HDR =
            "Turn on a device-specific high dynamic range (HDR) mode.";

    //CONTROL_VIDEO_STABILIZATION_MODE
    public static final String CONTROL_VIDEO_STABILIZATION_MODE_OFF =
            "Video stabilization is disabled.";

    public static final String CONTROL_VIDEO_STABILIZATION_MODE_ON =
            "Video stabilization is enabled.";

    //EDGE_MODE
    public static final String EDGE_MODE_OFF =
            "No edge enhancement is applied.";

    public static final String EDGE_MODE_FAST =
            "Apply edge enhancement at a quality level that does not slow down frame rate relative to sensor output. It may be the same as OFF if edge enhancement will slow down frame rate relative to sensor.";

    public static final String EDGE_MODE_HIGH_QUALITY =
            "Apply high-quality edge enhancement, at a cost of possibly reduced output frame rate.";

    public static final String EDGE_MODE_ZERO_SHUTTER_LAG =
            "Edge enhancement is applied at different levels for different output streams, based on resolution. Streams at maximum recording resolution (see createCaptureSession(SessionConfiguration)) or below have edge enhancement applied, while higher-resolution streams have no edge enhancement applied. The level of edge enhancement for low-resolution streams is tuned so that frame rate is not impacted, and the quality is equal to or better than FAST (since it is only applied to lower-resolution outputs, quality may improve from FAST).\n" +
                    "\n" +
                    "This mode is intended to be used by applications operating in a zero-shutter-lag mode with YUV or PRIVATE reprocessing, where the application continuously captures high-resolution intermediate buffers into a circular buffer, from which a final image is produced via reprocessing when a user takes a picture. For such a use case, the high-resolution buffers must not have edge enhancement applied to maximize efficiency of preview and to avoid double-applying enhancement when reprocessed, while low-resolution buffers (used for recording or preview, generally) need edge enhancement applied for reasonable preview quality.\n" +
                    "\n" +
                    "This mode is guaranteed to be supported by devices that support either the YUV_REPROCESSING or PRIVATE_REPROCESSING capabilities (android.request.availableCapabilities lists either of those capabilities) and it will be the default mode for CAMERA3_TEMPLATE_ZERO_SHUTTER_LAG template.";

    //FLASH_MODE
    public static final String FLASH_MODE_OFF =
            "Do not fire the flash for this capture.";

    public static final String FLASH_MODE_SINGLE =
            "If the flash is available and charged, fire flash for this capture.";

    public static final String FLASH_MODE_TORCH =
            "Transition flash to continuously on.";

    //HOT_PIXEL_MODE
    public static final String HOT_PIXEL_MODE_OFF =
            "No hot pixel correction is applied.\n" +
                    "\n" +
                    "The frame rate must not be reduced relative to sensor raw output for this option.\n" +
                    "\n" +
                    "The hotpixel map may be returned in android.statistics.hotPixelMap.";

    public static final String HOT_PIXEL_MODE_FAST =
            "Hot pixel correction is applied, without reducing frame rate relative to sensor raw output.\n" +
                    "\n" +
                    "The hotpixel map may be returned in android.statistics.hotPixelMap.";

    public static final String HOT_PIXEL_MODE_HIGH_QUALITY =
            "High-quality hot pixel correction is applied, at a cost of possibly reduced frame rate relative to sensor raw output.\n" +
                    "\n" +
                    "The hotpixel map may be returned in android.statistics.hotPixelMap.";

    //LENS_OPTICAL_STABILIZATION_MODE
    public static final String LENS_OPTICAL_STABILIZATION_MODE_OFF =
            "Optical stabilization is unavailable.";

    public static final String LENS_OPTICAL_STABILIZATION_MODE_ON =
            "Optical stabilization is enabled.";

    //NOISE_REDUCTION_MODE
    public static final String NOISE_REDUCTION_MODE_OFF =
            "No noise reduction is applied.";

    public static final String NOISE_REDUCTION_MODE_FAST =
            "Noise reduction is applied without reducing frame rate relative to sensor output. It may be the same as OFF if noise reduction will reduce frame rate relative to sensor.";

    public static final String NOISE_REDUCTION_MODE_HIGH_QUALITY =
            "High-quality noise reduction is applied, at the cost of possibly reduced frame rate relative to sensor output.";

    public static final String NOISE_REDUCTION_MODE_MINIMAL =
            "MINIMAL noise reduction is applied without reducing frame rate relative to sensor output.";

    public static final String NOISE_REDUCTION_MODE_ZERO_SHUTTER_LAG =
            "Noise reduction is applied at different levels for different output streams, based on resolution. Streams at maximum recording resolution (see createCaptureSession(SessionConfiguration)) or below have noise reduction applied, while higher-resolution streams have MINIMAL (if supported) or no noise reduction applied (if MINIMAL is not supported.) The degree of noise reduction for low-resolution streams is tuned so that frame rate is not impacted, and the quality is equal to or better than FAST (since it is only applied to lower-resolution outputs, quality may improve from FAST).\n" +
                    "\n" +
                    "This mode is intended to be used by applications operating in a zero-shutter-lag mode with YUV or PRIVATE reprocessing, where the application continuously captures high-resolution intermediate buffers into a circular buffer, from which a final image is produced via reprocessing when a user takes a picture. For such a use case, the high-resolution buffers must not have noise reduction applied to maximize efficiency of preview and to avoid over-applying noise filtering when reprocessing, while low-resolution buffers (used for recording or preview, generally) need noise reduction applied for reasonable preview quality.\n" +
                    "\n" +
                    "This mode is guaranteed to be supported by devices that support either the YUV_REPROCESSING or PRIVATE_REPROCESSING capabilities (android.request.availableCapabilities lists either of those capabilities) and it will be the default mode for CAMERA3_TEMPLATE_ZERO_SHUTTER_LAG template.";

    //SENSOR_TEST_PATTERN_MODE
    public static final String SENSOR_TEST_PATTERN_MODE_OFF =
            "No test pattern mode is used, and the camera device returns captures from the image sensor.\n" +
                    "\n" +
                    "This is the default if the key is not set.";

    public static final String SENSOR_TEST_PATTERN_MODE_SOLID_COLOR =
            "Each pixel in [R, G_even, G_odd, B] is replaced by its respective color channel provided in android.sensor.testPatternData.";

    public static final String SENSOR_TEST_PATTERN_MODE_COLOR_BARS =
            "All pixel data is replaced with an 8-bar color pattern.";

    public static final String SENSOR_TEST_PATTERN_MODE_COLOR_BARS_FADE_TO_GRAY =
            "The test pattern is similar to COLOR_BARS, except that each bar should start at its specified color at the top, and fade to gray at the bottom.\n" +
                    "\n" +
                    "Furthermore each bar is further subdivided into a left and right half. The left half should have a smooth gradient, and the right half should have a quantized gradient.\n" +
                    "\n" +
                    "In particular, the right half's should consist of blocks of the same color for 1/16th active sensor pixel array width.\n" +
                    "\n" +
                    "The least significant bits in the quantized gradient should be copied from the most significant bits of the smooth gradient.\n" +
                    "\n" +
                    "The height of each bar should always be a multiple of 128. When this is not the case, the pattern should repeat at the bottom of the image.";

    public static final String SENSOR_TEST_PATTERN_MODE_PN9 =
            "All pixel data is replaced by a pseudo-random sequence generated from a PN9 512-bit sequence (typically implemented in hardware with a linear feedback shift register).\n" +
                    "\n" +
                    "The generator should be reset at the beginning of each frame, and thus each subsequent raw frame with this test pattern should be exactly the same as the last.";

    public static final String SENSOR_TEST_PATTERN_MODE_CUSTOM1 =
            "The first custom test pattern. All custom patterns that are available only on this camera device are at least this numeric value.\n" +
                    "\n" +
                    "All of the custom test patterns will be static (that is the raw image must not vary from frame to frame).";

    //SHADING_MODE
    public static final String SHADING_MODE_OFF =
            "No lens shading correction is applied.";

    public static final String SHADING_MODE_FAST =
            "Apply lens shading corrections, without slowing frame rate relative to sensor raw output";

    public static final String SHADING_MODE_HIGH_QUALITY =
            "Apply high-quality lens shading correction, at the cost of possibly reduced frame rate.";

    //STATISTICS_FACE_DETECT_MODE
    public static final String STATISTICS_FACE_DETECT_MODE_OFF =
            "Do not include face detection statistics in capture results.";

    public static final String STATISTICS_FACE_DETECT_MODE_SIMPLE =
            "Return face rectangle and confidence values only.";

    public static final String STATISTICS_FACE_DETECT_MODE_FULL =
            "Return all face metadata.\n" +
                    "\n" +
                    "In this mode, face rectangles, scores, landmarks, and face IDs are all valid.";

    //STATISTICS_LENS_SHADING_MAP_MODE
    public static final String STATISTICS_LENS_SHADING_MAP_MODE_OFF =
            "Do not include a lens shading map in the capture result.";

    public static final String STATISTICS_LENS_SHADING_MAP_MODE_ON =
            "Include a lens shading map in the capture result.";

    //TONEMAP_MODE
    public static final String TONEMAP_MODE_CONTRAST_CURVE =
            "Use the tone mapping curve specified in the android.tonemap.curve* entries.\n" +
                    "\n" +
                    "All color enhancement and tonemapping must be disabled, except for applying the tonemapping curve specified by android.tonemap.curve.\n" +
                    "\n" +
                    "Must not slow down frame rate relative to raw sensor output.";

    public static final String TONEMAP_MODE_FAST =
            "Advanced gamma mapping and color enhancement may be applied, without reducing frame rate compared to raw sensor output.";

    public static final String TONEMAP_MODE_HIGH_QUALITY =
            "High-quality gamma mapping and color enhancement will be applied, at the cost of possibly reduced frame rate compared to raw sensor output.";

    public static final String TONEMAP_MODE_GAMMA_VALUE =
            "Use the gamma value specified in android.tonemap.gamma to peform tonemapping.\n" +
                    "\n" +
                    "All color enhancement and tonemapping must be disabled, except for applying the tonemapping curve specified by android.tonemap.gamma.\n" +
                    "\n" +
                    "Must not slow down frame rate relative to raw sensor output.";

    public static final String TONEMAP_MODE_PRESET_CURVE =
            "Use the preset tonemapping curve specified in android.tonemap.presetCurve to peform tonemapping.\n" +
                    "\n" +
                    "All color enhancement and tonemapping must be disabled, except for applying the tonemapping curve specified by android.tonemap.presetCurve.\n" +
                    "\n" +
                    "Must not slow down frame rate relative to raw sensor output.";

    //TONEMAP_PRESET_CURVE
    public static final String TONEMAP_PRESET_CURVE_SRGB =
            "Tonemapping curve is defined by sRGB";

    public static final String TONEMAP_PRESET_CURVE_REC709 =
            "Tonemapping curve is defined by ITU-R BT.709";


}
