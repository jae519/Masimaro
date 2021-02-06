package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import co.kr.masimaro.AddressActivity;
import co.kr.masimaro.R;
import co.kr.masimaro.shopreg.ShopReg1;

public class OnrRegWaiting extends AppCompatActivity {


    TextView gotoPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_waiting);
        gotoPreview = (TextView)findViewById(R.id.gotoPreview);

        gotoPreview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentSubActivity =
                        new Intent(OnrRegWaiting.this, ShopReg1.class);
                startActivity(intentSubActivity);
            }
        });


    }
}