package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import co.kr.masimaro.R;

public class OnrRegWaiting extends AppCompatActivity {


    TextView gotoPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_waiting);
        gotoPreview = (TextView)findViewById(R.id.gotoPreview);


    }
}