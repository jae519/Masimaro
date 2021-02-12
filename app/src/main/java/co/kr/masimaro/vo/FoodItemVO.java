package co.kr.masimaro.vo;

import android.widget.CheckBox;

public class FoodItemVO {
    Boolean useYn;
    String foodName;


    public FoodItemVO(Boolean useYn, String foodName) {
        this.useYn = useYn;
        this.foodName = foodName;
    }

    public Boolean getUseYn() {
        return useYn;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
