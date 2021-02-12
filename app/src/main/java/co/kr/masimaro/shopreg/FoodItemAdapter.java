package co.kr.masimaro.shopreg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.kr.masimaro.R;
import co.kr.masimaro.vo.FoodItemVO;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.ViewHolder>{

    ArrayList<FoodItemVO> mData = null;


    public FoodItemAdapter(ArrayList<FoodItemVO> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public FoodItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.reg_food_item, parent, false) ;
        FoodItemAdapter.ViewHolder vh = new FoodItemAdapter.ViewHolder(view) ;



        return vh ;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemAdapter.ViewHolder holder, int position) {
        holder.checkBox.setChecked(mData.get(position).getUseYn());
        holder.textView.setText(mData.get(position).getFoodName());
        holder.itemView.setTag(position);
        holder.checkBox.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mData.get(position).getUseYn())
                    mData.get(position).setUseYn(false);
                else
                    mData.get(position).setUseYn(true);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox checkBox;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBoxUseYn);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
