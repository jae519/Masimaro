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

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder>{

    AddressAdapter addressAdapter;
    int lastSelected;
    ArrayList<AddressVO> mData = null;

    public AddressAdapter(ArrayList<AddressVO> mData){
        this.mData = mData;
        lastSelected = 0;
        addressAdapter = this;
    }

    @NonNull
    @Override
    public AddressAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int layout = viewType == TYPE_SELECTED
                ? R.layout.address_item_selected
                : R.layout.address_item;
        View view = inflater.inflate(layout, parent, false);
        AddressAdapter.ViewHolder vh = new AddressAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapter.ViewHolder holder, int position) {
        holder.textView.setText((mData.get(position)).getAddress());
        holder.itemView.setTag(position);
        holder.textView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {

                Log.e("loclog", holder.textView.getText().toString());

                //selected 상태 변경

                mData.get(position).setSelected(true);
                mData.get(lastSelected).setSelected(false);
                lastSelected = position;
                addressAdapter.notifyDataSetChanged();


            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);

        }
    }

    private static final int TYPE_SELECTED = 0;
    private static final int TYPE_DEFAULT = 1;

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).isSelected() ? TYPE_SELECTED : TYPE_DEFAULT;
    }
}
