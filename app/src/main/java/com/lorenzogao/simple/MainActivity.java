package com.lorenzogao.simple;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //   TestBean testBean=new TestBean();

        /**
         *  反射new 一个方法
         */
        try {
            // 创建对象，很多系统的类 都被系统隐藏了或者说 只有系统可以直接new  如果想用 可以通过反射创建对象
//            TestBean testBean=TestBean.class.newInstance();
//            testBean.sysName();

            // 获取一个参数的构造方法  getDeclaredConstructor 丛所有的构造方法找  Constructor 从公共构造方法找
            Constructor constructor = TestBean.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);//设置权限
            TestBean testBean = (TestBean) constructor.newInstance("L");
            //     testBean.sysName();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //方法调用
        try {

//            TestBean testBean = new TestBean("L");
//            Method method = TestBean.class.getDeclaredMethod("sysName");
//            method.setAccessible(true);
//            method.invoke(testBean);

            AssetManager assetManager = AssetManager.class.newInstance();
            Method addAssetPathMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            addAssetPathMethod.setAccessible(true);
            addAssetPathMethod.invoke(assetManager, "sdcard/dds/red.skin");


        } catch (Exception e) {
            e.printStackTrace();
        }

        // 获取属性
        try {
            TestBean testBean = new TestBean("baby");
            Field field = TestBean.class.getDeclaredField("name");
            field.setAccessible(true);
            String string = (String) field.get(testBean);
            Log.e("TAG", "name--------->" + string);


            Class clazz = Class.forName("android.app.ActivityThread");
            Field sCurrentActivityThread = clazz.getDeclaredField("sCurrentActivityThread");
            sCurrentActivityThread.setAccessible(true); //private  添加权限
            Object object = sCurrentActivityThread.get(null);

            Log.e("TAG", "object---->" + object.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
