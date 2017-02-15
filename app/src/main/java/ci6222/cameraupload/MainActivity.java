package ci6222.cameraupload;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;

import java.io.ByteArrayOutputStream;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {


    private static final int REQUEST_IMAGE_CAPTURE = 111;
    Logger logger = Logger.getLogger("MainActivity");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBrowse(View view) {

    }

    public void callCamera(View view) {
        Intent callCamera = new Intent(this, CameraActivity1.class);
        startActivity(callCamera);
    }



    public void viewAll(View view) {

    }


}
