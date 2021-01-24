package co.kr.masimaro.vo;

import android.net.Uri;

import java.util.ArrayList;

public class ShopVO {

    private String shopName;

    private String shopAddress;
    private String phoneNum;
    private String onrRegNum;
    private String accountNum;

    public ArrayList<Uri> shopPicUris;
    public Uri bizRegPic;
    public Uri acntDupPic;


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOnrRegNum() {
        return onrRegNum;
    }

    public void setOnrRegNum(String onrRegNum) {
        this.onrRegNum = onrRegNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public ArrayList<Uri> getShopPicUris() {
        return shopPicUris;
    }

    public void setShopPicUris(ArrayList<Uri> shopPicUris) {
        this.shopPicUris = shopPicUris;
    }

    public Uri getBizRegPic() {
        return bizRegPic;
    }

    public void setBizRegPic(Uri bizRegPic) {
        this.bizRegPic = bizRegPic;
    }

    public Uri getAcntDupPic() {
        return acntDupPic;
    }

    public void setAcntDupPic(Uri acntDupPic) {
        this.acntDupPic = acntDupPic;
    }
}
