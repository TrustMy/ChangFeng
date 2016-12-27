package com.chunfeng.sy.com.chunfengmotorcycle.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chunfeng.sy.com.chunfengmotorcycle.BaseActivity;
import com.chunfeng.sy.com.chunfengmotorcycle.R;

public class LoginActivity extends BaseActivity implements View.OnClickListener{
    private EditText loginPhoneEt,loginPwdEt;
    private TextView loginChangPwdTv;
    private CheckBox loginCheckBox;
    private LinearLayout loginRegisterLL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

    }

    private void initView() {
        loginPhoneEt = (EditText) findViewById(R.id.login_phone);
        loginPwdEt = (EditText) findViewById(R.id.login_pwd);
        loginChangPwdTv = (TextView) findViewById(R.id.login_chang_pwd);
        loginCheckBox = (CheckBox) findViewById(R.id.login_checkBox);
        loginRegisterLL = (LinearLayout) findViewById(R.id.login_register);


        loginRegisterLL.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.login_register:
            break;
        }
    }


    public void startLogion(View v)
    {
        String phone =loginPhoneEt.getText().toString().trim();
        String pwd = loginPwdEt.getText().toString().trim();

        if(phone == null || pwd == null)
        {
            //
        }else
        {
            // TODO: 16/12/27   登陆操作  网络请求
        }
    }
}
