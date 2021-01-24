package co.kr.masimaro.util;

import android.util.Log;

public class StringUtil {

    static boolean isEmailType(String email){
        if (!email.contains("@")){
            Log.e("[StringUtil]", "이메일 형식 오류");
            //TODO 에러코드 정리 및 수정 필요
            return false;
        }
        return true;
    }

}
