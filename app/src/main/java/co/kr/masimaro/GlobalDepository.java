package co.kr.masimaro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import co.kr.masimaro.vo.BankVO;

public class GlobalDepository {


    private static GlobalDepository globalDepository;
    private HashMap<String, ArrayList<String>> locList;

    //imsi variables
    public String shopName;
    public String shopLoc;


    public static GlobalDepository getInstance(){
        if (globalDepository == null)
            globalDepository = new GlobalDepository();
        return globalDepository;
    }


    public GlobalDepository(){
        locList = new HashMap<String, ArrayList<String>>();
        ArrayList<String> alSeoul = new ArrayList<>();
        alSeoul.add("강남/역삼/삼성/논현");
        alSeoul.add("서초/신사/방배");
        alSeoul.add("잠실/신천(잠실새내)");
        alSeoul.add("영등표/여의도");
        locList.put("서울",alSeoul);
        ArrayList<String> alGyunggi = new ArrayList<>();
        alGyunggi.add("수원 인계/권선/영통");
        alGyunggi.add("수원역/구운/장안/세류");
        alGyunggi.add("안양/평촌/인덕원/과천");
        alGyunggi.add("성남/분당/위례");
        locList.put("경기",alGyunggi);
        ArrayList<String> alDaegu = new ArrayList<>();
        alDaegu.add("동성로/서문시장/대구시청/삼덕동/교동/종로");
        alDaegu.add("대구역/칠성시작/경북대/엙스코/칠곡지구/태전동/금호지구");
        alDaegu.add("동대구역/고속버스터미널/신청동/신암동");
        alDaegu.add("대구공항/혁신도시/동촌유원지/팔공산/아시아폴리스");
        locList.put("대구",alDaegu);
        ArrayList<String> alOlsan = new ArrayList<>();
        alOlsan.add("남구/중구(삼산/성남/무거/신정)");
        alOlsan.add("동구/북구/울주군(일산/진장/진하/KTX역/영남알프스)");
        locList.put("울산",alOlsan);


    }

    public HashMap<String, ArrayList<String>> getLocList() {
        return locList;
    }
}
