package org.kasapbasi.mycamera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.Ahmet);

    }

    public void myClick(View v){
        Intent myInt= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(myInt,1461);

    }

    /**
     * Dispatch incoming result to the correct fragment.
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){

            case 1461:

     Bitmap bmp=(Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(bmp);
                break;


        }

    }
}
