package co.kr.masimaro.loc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.kr.masimaro.R;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder>{

    ArrayList<String> mData = null;

    public AddressAdapter(ArrayList<String> mData){
        this.mData = mData;
    }

    @NonNull
    @Override
    public AddressAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.address_item, parent, false) ;
        AddressAdapter.ViewHolder vh = new AddressAdapter.ViewHolder(view);


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapter.ViewHolder holder, int position) {
        holder.textView.setText(mData.get(position));
        holder.itemView.setTag(position);
        holder.textView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
