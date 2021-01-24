package co.kr.masimaro.vo;

public class CustomerVO
{

    private static final CustomerVO userInstance  = new CustomerVO();

    public static CustomerVO getInstance() {
            return userInstance;
        }


    private String userName;
    private String email;


    private CustomerVO(){
        //this.userName = userName;
        //this.email = email;
    }


    public String getEmail() {
            return email;
        }

    public String getUserName() {
            return userName;
        }

    public void setUserName(String userName) {
            this.userName = userName;
        }

    public void setEmail(String email) {
            this.email = email;
        }






}
