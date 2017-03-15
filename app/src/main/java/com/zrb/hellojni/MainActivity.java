package com.zrb.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView tv01, tv02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv01 = (TextView) findViewById(R.id.helloword);
        tv02 = (TextView) findViewById(R.id.helloword2);
        tv01.setText(helloJni() + "  hello");
        int addResult = addCalc(12, 13);
        tv02.setText("  " + addResult);

    }
    static {
        System.loadLibrary("hello_jni"); // 注意没有前缀lib和后缀.so
    }

    public static native String helloJni();

    public static native int addCalc(int a, int b);
}
