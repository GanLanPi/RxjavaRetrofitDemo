package com.lorenzogao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者：Lorenzo Gao
 * Date: 2018/5/14
 * Time: 15:50
 * 邮箱：2508719070@qq.com
 * Description:
 */

public class BaseActivity extends AppCompatActivity {


    /**
     * 上限
     * @param clazz
     */

    public void startActivitys(Class<? extends Activity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);

    }


    /**
     * 下限  包括TestActivity
     * @param clazz
     */
    public void startActivity(Class<? super BaseActivity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);

    }



}
