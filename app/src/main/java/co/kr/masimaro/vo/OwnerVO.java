package co.kr.masimaro.vo;

public class OwnerVO {
    private String ownerName;
    private String email;

    private ShopVO shopVO;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShopVO getShopVO() {
        return shopVO;
    }

    public void setShopVO(ShopVO shopVO) {
        this.shopVO = shopVO;
    }
}
