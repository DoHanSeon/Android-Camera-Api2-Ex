package com.example.hs.mycamera2.camera_option.capture.select;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;

import com.example.hs.mycamera2.camera_option.CameraOption;
import com.example.hs.mycamera2.camera_option.capture.OptionType;
import com.example.hs.mycamera2.camera_option.capture.DetailOptionInfo;

/**
 * Created by user on 2018. 4. 20..
 */

public class ControlSceneMode extends CameraOption<Integer> {

    public ControlSceneMode(CameraCharacteristics characteristics) {
        super(characteristics);
    }

    @Override
    protected void initailize(CameraCharacteristics characteristics) {
        items.clear();
        int[] values = characteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (values != null && values.length > 0) {
            for (int value : values) {
                switch (value) {
                    case CameraMetadata.CONTROL_SCENE_MODE_DISABLED:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_DISABLED, "DISABLED"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FACE_PRIORITY, "FACE PRIORITY"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_ACTION:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_ACTION, "ACTION"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PORTRAIT, "PORTRAIT"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_LANDSCAPE, "LANDSCAPE"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_NIGHT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT, "NIGHT"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_NIGHT_PORTRAIT, "NIGHT PORTRAIT"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_THEATRE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_THEATRE, "THEATRE"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_BEACH:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BEACH, "BEACH"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_SNOW:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SNOW, "SNOW"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_SUNSET:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SUNSET, "SUNSET"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_STEADYPHOTO, "STEADYPHOTO"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_FIREWORKS, "FIREWORKS"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_SPORTS:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_SPORTS, "SPORTS"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_PARTY:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_PARTY, "PARTY"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_CANDLELIGHT, "CANDLELIGHT"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_BARCODE:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_BARCODE, "BARCODE"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HIGH_SPEED_VIDEO, "HIGH SPEED VIDEO (Deprecated)"));
                        break;
                    case CameraMetadata.CONTROL_SCENE_MODE_HDR:
                        items.add(new DetailOptionInfo<>(CameraMetadata.CONTROL_SCENE_MODE_HDR, "HDR"));
                        break;
                }
            }
        }
    }

    @Override
    public CaptureRequest.Key<Integer> getKey() {
        return CaptureRequest.CONTROL_SCENE_MODE;
    }

    @Override
    public String getDisplayName() {
        return "SCENE MODE";
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.SELECT;
    }

    @Override
    public String getDescriptionFilePath() {
        return null;
    }
}
