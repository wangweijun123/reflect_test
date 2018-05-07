package com.example.wangweijun.reflecttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testReflect(View v) {
        TestReflect.testReflect();
        Log.i(TAG, "#########################");
        TestPrivateConstructorReflect.test();
        Log.i(TAG, "#########################");
        TestReflect.testReflectActivityThread();
        Log.i(TAG, "#########################");
        TestReflect.testReflectActivityInOtherApp();
        Log.i(TAG, "+++++++++++++++++++");
        TestReflect.testReflectPackageManager();
    }
}
