package co.kr.masimaro.shopreg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.kr.masimaro.R;
import co.kr.masimaro.vo.FoodItemVO;

public class ShopReg2 extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FoodItemAdapter foodItemAdapter;
    ArrayList<FoodItemVO> mList = new ArrayList<FoodItemVO>();
    Button buttonAddShopMenu;
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_reg2);

        mRecyclerView = findViewById(R.id.recyclerViewMenu);
        foodItemAdapter = new FoodItemAdapter(mList);
        mRecyclerView.setAdapter(foodItemAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        buttonAddShopMenu = findViewById(R.id.buttonAddShopMenu);
        edText = findViewById(R.id.edTextAddMenu);


        buttonAddShopMenu.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                FoodItemVO fiVO = new FoodItemVO(true, edText.getText().toString());

                mList.add(fiVO);
                foodItemAdapter.notifyDataSetChanged();
            }
        });



    }
}