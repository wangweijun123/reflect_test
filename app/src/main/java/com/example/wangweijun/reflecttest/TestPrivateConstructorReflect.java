package com.example.wangweijun.reflecttest;

import android.util.Log;

import java.lang.reflect.Constructor;

/**
 * Created by wangweijun on 2018/4/21.
 */


public class TestPrivateConstructorReflect {

    private int privateVar = 1;

    String defaultStr = "aaa";

    private TestPrivateConstructorReflect(){}

    private String getPrivateStr(){
        return "bbbbbbbbbb";
    }

    private String getPrivateStr(String str){
        return str;
    }


    public static void test(){
        try {
            Constructor<?> constructor = TestPrivateConstructorReflect.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            TestPrivateConstructorReflect o = (TestPrivateConstructorReflect)constructor.newInstance();
            Log.i(MainActivity.TAG, o.getPrivateStr());

                //私有构造函数不能使用Class.forname("xxxx").newInstance
//            Class clazzTestReflect = Class.forName("com.example.wangweijun.reflecttest");
//            Constructor<?> clazzTestReflectConstructor = clazzTestReflect.getConstructor();
//            clazzTestReflectConstructor.setAccessible(true);
//            TestPrivateConstructorReflect o2 = (TestPrivateConstructorReflect)clazzTestReflectConstructor.newInstance();
//            Log.i(MainActivity.TAG, "use other method : " + o2.getPrivateStr());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
