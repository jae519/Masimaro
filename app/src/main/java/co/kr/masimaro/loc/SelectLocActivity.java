package co.kr.masimaro.loc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
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
    static ArrayList<String> mDataDtl = new ArrayList<String>();
    RecyclerView rv;
    RecyclerView rvDtl;
    AddressAdapter addressAdapter;
    static AddressDtlAdapter addressDtlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loc);

        //rv는 textview인데 state가 두개 있음.
        //1. selected, 2. default
        // 처음에 key들의 처음을 selected 상태로 변경





        rv = (RecyclerView)findViewById(R.id.recyclerView);

        boolean isFirst = true;
        String firstLoc = null;
        ArrayList<String> keyLocList = GlobalDepository.getInstance().getKeyLocList();
        for (String loc : keyLocList){
            mData.add(new AddressVO(loc, isFirst));
            if (isFirst) {
                isFirst = false;
                firstLoc = loc;
            }
        }




        addressAdapter = new AddressAdapter(mData);
        rv.setAdapter(addressAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //addressAdapter.notifyDataSetChanged();



        rvDtl = (RecyclerView)findViewById(R.id.recyclerView2);

        HashMap<String, ArrayList<String>> locList = GlobalDepository.getInstance().getLocList();
        for (String addrDtl : locList.get(firstLoc)){
            mDataDtl.add(addrDtl);
        }

        addressDtlAdapter = new AddressDtlAdapter(mDataDtl);
        rvDtl.setAdapter(addressDtlAdapter);
        rvDtl.setLayoutManager(new LinearLayoutManager(this));


        DividerItemDecoration dividerItemDecoration1 =
                new DividerItemDecoration(rv.getContext(),new LinearLayoutManager(this).getOrientation());
        rv.addItemDecoration(dividerItemDecoration1);

        DividerItemDecoration dividerItemDecoration2 =
                new DividerItemDecoration(rvDtl.getContext(),new LinearLayoutManager(this).getOrientation());
        rvDtl.addItemDecoration(dividerItemDecoration2);



    }
}