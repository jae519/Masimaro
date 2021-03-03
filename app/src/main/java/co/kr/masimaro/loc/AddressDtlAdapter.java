package co.kr.masimaro.loc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.kr.masimaro.R;
import co.kr.masimaro.vo.AddressVO;

public class AddressDtlAdapter extends RecyclerView.Adapter<AddressDtlAdapter.ViewHolder>{

    AddressDtlAdapter addressAdapter;
    ArrayList<String> mData = null;

    public AddressDtlAdapter(ArrayList<String> mData){
        this.mData = mData;
        addressAdapter = this;
    }

    @NonNull
    @Override
    public AddressDtlAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int layout = R.layout.address_dtl_item;
        View view = inflater.inflate(layout, parent, false);
        AddressDtlAdapter.ViewHolder vh = new AddressDtlAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AddressDtlAdapter.ViewHolder holder, int position) {
        holder.textView.setText((mData.get(position)));
        holder.itemView.setTag(position);
        holder.goNext.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                Log.e("loclog", holder.textView.getText().toString());
                //Activity change

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView goNext;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            goNext = itemView.findViewById(R.id.textViewGoNext);

        }
    }


}
