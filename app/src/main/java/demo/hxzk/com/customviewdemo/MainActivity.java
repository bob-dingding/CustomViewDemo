package demo.hxzk.com.customviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import demo.hxzk.com.customviewdemo.widget.CustomeEdittext;


public class MainActivity extends AppCompatActivity  implements  CustomeEdittext.OnSuccessListener {

    private static final String TAG = "MainActivity";
    Button btn_getData;
    CustomeEdittext customView;
    CustomeEdittext customViewaAcount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        customView = findViewById(R.id.editextcustomView);
        customViewaAcount = findViewById(R.id.editextcustomView_account);

        customView.setOnSuccessListener(this);
        customViewaAcount.setOnSuccessListener(this);

        btn_getData = findViewById(R.id.btn_getdata);

        btn_getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pwd = customView.getContent();
                String account = customViewaAcount.getContent();
                if (!TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(account)) {
                    Toast.makeText(MainActivity.this, pwd + "==" + account, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "请输入账号密码后再获取", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }


    @Override
    public void onSuccess(String phone) {

    }
}
