package hz.cameraopengles;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;

import java.io.IOException;

import static android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT;

/**
 * Created by Administrator on 2017-07-13.
 */

public class CameraManeger {

    private Camera mCamera;

    public void OpenCamera(SurfaceTexture surfaceTexture) {
        try {
            mCamera = Camera.open(CAMERA_FACING_FRONT);
            mCamera.setPreviewTexture(surfaceTexture);
            mCamera.startPreview();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
