package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.kr.masimaro.R;

public class OnrRegIdPwActivity extends AppCompatActivity {

    Button onrLoginBtn;
    EditText EdTextPw;
    EditText EdTextPwRe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_id_pw);

        onrLoginBtn = (Button)findViewById(R.id.onrLoginBtn);
        EdTextPw = (EditText)findViewById(R.id.EdTextPw);
        EdTextPwRe = (EditText)findViewById(R.id.EdTextPwRe);

        onrLoginBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: 패스워드 강력정도 설정이 필요


                Log.d("OnrRegidPwActivity", EdTextPw.getText().toString());
                Log.d("OnrRegidPwActivity", EdTextPwRe.getText().toString());

                if (EdTextPw.getText().toString().equals(EdTextPwRe.getText().toString())){

                    Intent intentSubActivity =
                            new Intent(OnrRegIdPwActivity.this, OnrRegShopActivity1.class);
                    startActivity(intentSubActivity);
                }else{
                    //1. 텍스트 박스에 글자 넣기
                    //2. 텍스트 박스 색깔 바꾸기
                }
            }
        });

    }
}