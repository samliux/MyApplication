package com.example.xinliu.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局（layout）中的xml文件（activity_main.xml）引入到activity当中
        setContentView(R.layout.activity_main);
    }
}
