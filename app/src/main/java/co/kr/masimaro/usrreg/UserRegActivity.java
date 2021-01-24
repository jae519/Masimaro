package co.kr.masimaro.usrreg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.gun0912.tedpicker.ImagePickerActivity;

import java.util.ArrayList;

import co.kr.masimaro.ImageViewPagerAdapter;
import co.kr.masimaro.R;

//import ir.shahabazimi.instagrampicker.InstagramPicker;

public class UserRegActivity extends AppCompatActivity {

    Button addButton;

    private static final int INTENT_REQUEST_GET_IMAGES = 3;
    private ViewPager viewPager ;
    private ImageViewPagerAdapter pagerAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg);

        Button addButton = (Button ) findViewById(R.id.imageAddButton);
        viewPager = (ViewPager) findViewById(R.id.viewPager) ;
        pagerAdapter = new ImageViewPagerAdapter(this) ;
        viewPager.setAdapter(pagerAdapter) ;

        addButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d("UserRegActivity","add button clicked");
                if ((ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED))
                    Log.d("UserRegActivity", "Camera Granted");
                else
                    Log.d("UserRegActivity", "Camera Not Granted");
                Intent intent  = new Intent(getApplicationContext(), ImagePickerActivity.class);
                startActivityForResult(intent,INTENT_REQUEST_GET_IMAGES);



            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resuleCode, Intent intent) {
        super.onActivityResult(requestCode, resuleCode, intent);

        if (requestCode == INTENT_REQUEST_GET_IMAGES && resuleCode == Activity.RESULT_OK ) {

            ArrayList<Uri> image_uris = intent.getParcelableArrayListExtra(ImagePickerActivity.EXTRA_IMAGE_URIS);

            pagerAdapter.image_uris = image_uris;

            pagerAdapter.notifyDataSetChanged();

            synchronized (pagerAdapter) {
                pagerAdapter.notifyAll();
            }



            Log.d("UserRegActivity", "Image1 : " + image_uris.get(0).getPath());
            Log.d("UserRegActivity", "Image2 : " + image_uris.get(1).getPath());
            Log.d("UserRegActivity", "Image3 : " + image_uris.get(2).getPath());
            //do something
        }
    }
}