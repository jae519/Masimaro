package co.kr.masimaro.loc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import co.kr.masimaro.GlobalDepository;
import co.kr.masimaro.R;
import co.kr.masimaro.vo.AddressVO;

public class SelectLocActivity extends AppCompatActivity {

    ArrayList<AddressVO> mData = new ArrayList<AddressVO>();
    RecyclerView rv, rvDtl;
    AddressAdapter addressAdapter;
    AddressDtlAdapter addressDtlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loc);

        //rv는 textview인데 state가 두개 있음.
        //1. selected, 2. default
        // 처음에 key들의 처음을 selected 상태로 변경
        rv = (RecyclerView)findViewById(R.id.recyclerView);
        HashMap<String, ArrayList<String>> locList = GlobalDepository.getInstance().getLocList();
        boolean isFirst = true;
        for (String key : locList.keySet()){
            mData.add(new AddressVO(key, isFirst));
            if (isFirst)
                isFirst = false;
        }
        addressAdapter = new AddressAdapter(mData);
        rv.setAdapter(addressAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //addressAdapter.notifyDataSetChanged();
        //rvDtl = (RecyclerView)findViewById(R.id.recyclerView2);



    }
}