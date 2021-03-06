package com.assessment.myapp;

import android.view.View;
import android.widget.Button;

import com.assessment.myapp.activity.BaseActivity;
import com.assessment.myapp.activity.HomeActivity;
import com.assessment.myapp.activity.LoginActivity;
import com.assessment.myapp.activity.RegisterActivity;
import com.assessment.myapp.util.StringUtils;

public class MainActivity extends BaseActivity {

    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
    }

    @Override
    protected void initData() {
        if (!StringUtils.isEmpty(findByKey("token"))) {
            navigateTo(HomeActivity.class);
            finish();
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateTo(LoginActivity.class); //调用跳转方法
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateTo(RegisterActivity.class);
            }
        });
    }
}