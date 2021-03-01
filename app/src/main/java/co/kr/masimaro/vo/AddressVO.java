package co.kr.masimaro.vo;

public class AddressVO {
    String address;
    boolean selected;

    public AddressVO(String address, boolean selected) {
        this.address = address;
        this.selected = selected;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
