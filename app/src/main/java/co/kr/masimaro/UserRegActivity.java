package co.kr.masimaro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import ir.shahabazimi.instagrampicker.InstagramPicker;

public class UserRegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg);
        /*
        InstagramPicker in = new InstagramPicker(UserRegActivity.this);
        in.show(1,1,5, addresses ->  {

            //here you get your selected pictures addresses in array of String
            // you can convert it to Uri if you want: Uri.parse();


        });
        */

    }
}