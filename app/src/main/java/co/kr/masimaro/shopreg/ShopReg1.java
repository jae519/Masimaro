package co.kr.masimaro.shopreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.kr.masimaro.GlobalDepository;
import co.kr.masimaro.R;

public class ShopReg1 extends AppCompatActivity {

    Button btnConfirm;
    EditText edTextShopName;
    EditText edTextShopAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_reg1);

        btnConfirm = (Button)findViewById(R.id.btnConfirm);
        edTextShopName = (EditText)findViewById(R.id.edTextShopName);
        edTextShopAddress = (EditText)findViewById(R.id.edTextShopAddress);


        edTextShopName.setText(GlobalDepository.getInstance().shopName);
        edTextShopAddress.setText(GlobalDepository.getInstance().shopLoc);

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