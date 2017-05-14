package com.example.mina.recaptchatest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {

    private EditText code;
    private Vcode mVerifyCode;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v);
        code = (EditText) findViewById(R.id.et_code);
        mVerifyCode = (Vcode) findViewById(R.id.VerifyCode);
    }

    public void click(View view) {
        mVerifyCode.refresh();
    }
    public void check(View view) {
        String s = code.getText().toString();
        Boolean aBoolean = mVerifyCode.isEquals(s);
        if (aBoolean) {
            Toast.makeText(this, "OKOKOKOKOKOKOKOKOKOKOK", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "NONONONONONONOONONONO", Toast.LENGTH_SHORT).show();
        }
    }
}