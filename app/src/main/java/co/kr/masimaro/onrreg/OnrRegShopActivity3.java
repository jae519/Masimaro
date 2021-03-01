package co.kr.masimaro.onrreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import co.kr.masimaro.AddressActivity;
import co.kr.masimaro.GlobalDepository;
import co.kr.masimaro.R;

public class OnrRegShopActivity3 extends AppCompatActivity {

    TextView edTextAddress;
    EditText edTextShopName;
    EditText edTextAddressDetail;

    private static final int SEARCH_ADDRESS_ACTIVITY = 10000;
    Spinner bankSpinner;

    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onr_reg_shop3);
        edTextAddress = (TextView)findViewById(R.id.textViewAddress);
        bankSpinner = (Spinner)findViewById(R.id.bankSpinner);

        edTextAddress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OnrRegShopActivity3.this, AddressActivity.class);
                startActivityForResult(i, SEARCH_ADDRESS_ACTIVITY);
            }
        });

        edTextShopName = (EditText)findViewById(R.id.edTextShopName);
        edTextAddressDetail = (EditText)findViewById(R.id.edTextAddressDetail);



        bankSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override

            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        btnConfirm = (Button)findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //필수항목 체크 필요
                GlobalDepository.getInstance().shopName = new String(edTextShopName.getText().toString());
                GlobalDepository.getInstance().shopLoc = new String(edTextAddress.getText().toString() + " " + edTextAddressDetail.getText().toString());
                Intent intentSubActivity =
                        new Intent(OnrRegShopActivity3.this, OnrRegWaiting.class);
                startActivity(intentSubActivity);

            }
        });

    }
    /*
    Search 관련 된 콜백 함수
     */
    public void onActivityResult(int requestCode, int resultCode, Intent intent){

        super.onActivityResult(requestCode, resultCode, intent);

        switch(requestCode){

            case SEARCH_ADDRESS_ACTIVITY:

                if(resultCode == RESULT_OK){

                    String data = intent.getExtras().getString("data");
                    if (data != null)
                        edTextAddress.setText(data);

                }
                break;

        }

    }
}