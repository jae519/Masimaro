package co.kr.masimaro;

import java.util.ArrayList;

import co.kr.masimaro.vo.BankVO;

public class GlobalDepository {


    private static GlobalDepository globalDepository;

    public static GlobalDepository getInstance(){
        if (globalDepository == null)
            globalDepository = new GlobalDepository();
        return globalDepository;
    }

    public static void initialize(){

    }





}
