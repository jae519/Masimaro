package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import co.kr.masimaro.R;

public class OnrRegActivity extends AppCompatActivity {

    TextView gotoReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg);

        gotoReg = (TextView)findViewById(R.id.gotoReg);

        gotoReg.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentSubActivity =
                        new Intent(OnrRegActivity.this, OnrRegShopActivity1.class);
                startActivity(intentSubActivity);
            }
        });

    }
}