package com.diamong.myfirebasestudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("로그인");
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(this,SignUpActivity.class));
    }
}
