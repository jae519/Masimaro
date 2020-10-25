package co.kr.masimaro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import com.kakao.auth.Session;
import com.kakao.usermgmt.LoginButton;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {


    static Context mContext;

    private LoginButton btn_kakao_login;

    private SessionCallback sessionCallback = new SessionCallback();
    Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_kakao_login = (LoginButton) findViewById(R.id.btn_kakao_login);

        session = Session.getCurrentSession();
        session.addCallback(sessionCallback);

        //Hashkey 받아오는 부분. 카카오톡에 로그인 정보 올리기 위해 필요
        //getHashKey();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // 세션 콜백 삭제
        Session.getCurrentSession().removeCallback(sessionCallback);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        // 카카오톡|스토리 간편로그인 실행 결과를 받아서 SDK로 전달
        if (Session.getCurrentSession().handleActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);

            Intent intent = new Intent(MainActivity.this, UserRegActivity.class);
            Log.d("MainActivity", "onActivityResult called!!!!!!!");
            startActivity(intent);
            return;
        }
        Log.d("MainActivity", "onActivityResult called!!!!!!!");


    }

    public static void launch(String message) {
        Intent intent = new Intent(mContext, UserRegActivity.class);
        intent.putExtra("message", message);
        //mContext.startActivity(intent);
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext, 0, intent, 0);
        try
        {
            pendingIntent.send();
        }
        catch(PendingIntent.CanceledException e)
        {
            e.printStackTrace();
        }

    }



    private void getHashKey(){
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageInfo == null)
            Log.e("KeyHash", "KeyHash:null");

        for (Signature signature : packageInfo.signatures) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            } catch (NoSuchAlgorithmException e) {
                Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
            }
        }
    }
}