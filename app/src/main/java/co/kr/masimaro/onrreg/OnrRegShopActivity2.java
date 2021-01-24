package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import co.kr.masimaro.R;

public class OnrRegShopActivity2 extends AppCompatActivity {


    CheckBox checkbox1;
    CheckBox checkbox2;
    CheckBox checkbox3;
    TextView textViewWarn;

    Button btnConfirm;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_shop2);

        checkbox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox)findViewById(R.id.checkBox3);
        textViewWarn = (TextView)findViewById(R.id.textViewWarn);
        mContext = getApplicationContext();
        btnConfirm = (Button)findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e("OnrRegShopActivity", "onClick done");
                //Logic
                //1. checkbox 모두 체크돼있는지 확인
                //2. 아니라면 팝업 표시
                //3. 맞으면 activity 3으로 넘어감
                if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked()){
                    Intent intentSubActivity =
                            new Intent(OnrRegShopActivity2.this, OnrRegShopActivity3.class);
                    startActivity(intentSubActivity);
                }else{
                    textViewWarn.setVisibility(View.VISIBLE);
                    Animation shake = AnimationUtils.loadAnimation(mContext, R.anim.shake);
                    textViewWarn.startAnimation(shake);



                }




            }
        });





    }
}