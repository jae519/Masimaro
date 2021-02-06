package co.kr.masimaro.shopreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.kr.masimaro.R;

public class ShopReg1 extends AppCompatActivity {

    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_reg1);

        btnConfirm = (Button)findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentSubActivity =
                        new Intent(ShopReg1.this, ShopReg2.class);
                startActivity(intentSubActivity);
            }
        });

    }
}