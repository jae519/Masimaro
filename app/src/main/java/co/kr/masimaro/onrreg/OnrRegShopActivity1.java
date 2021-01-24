package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.kr.masimaro.R;

public class OnrRegShopActivity1 extends AppCompatActivity {


    EditText edTextId;
    EditText edTextPw;
    EditText edTextPwRe;
    EditText edTextEmailFront;
    EditText edTextEmailBack;
    EditText edTextName;
    EditText edTextPhoneNum;
    Button btnConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_shop1);

        edTextId = (EditText)findViewById(R.id.edTextId);
        edTextPw = (EditText)findViewById(R.id.edTextPw);
        edTextPwRe = (EditText)findViewById(R.id.edTextPwRe);
        edTextEmailFront = (EditText)findViewById(R.id.edTextEmailFront);
        edTextEmailBack = (EditText)findViewById(R.id.edTextEmailBack);
        edTextName = (EditText)findViewById(R.id.edTextName);
        edTextPhoneNum = (EditText)findViewById(R.id.edTextPhoneNum);
        btnConfirm = (Button)findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Logic
                //1. 빈 부분이 있는지 확인
                //2. 패스워드 맞는지 확인 / 필요하다면 형식 검증
                //3. 이메일 완전체 조합
                //4. phone 번호 형식 보정
                //5.
                Intent intentSubActivity =
                        new Intent(OnrRegShopActivity1.this, OnrRegShopActivity2.class);
                startActivity(intentSubActivity);




            }
        });
    }
    /* 팝업 관련 코드
    AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Input your name");
            alert.setMessage("Plz, input yourname");


            final EditText name = new EditText(this);
            alert.setView(name);

            alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    String username = name.getText().toString();

                }
            });


            alert.setNegativeButton("no",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {

                        }
                    });

            alert.show();

     */
}