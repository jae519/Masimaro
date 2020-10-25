package co.kr.masimaro;

public class UserVO
{
        private static final UserVO userInstance  = new UserVO();

        public static UserVO getInstance() {
            return userInstance;
        }

        private String userName;
        private String email;

        private UserVO(){
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
