package com.lorenzogao.simple;

import android.util.Log;

/**
 * 作者：Lorenzo Gao
 * Date: 2018/5/11
 * Time: 13:20
 * 邮箱：2508719070@qq.com
 * Description:
 */

public class TestBean {


    private String name = "LorenzoGao"; // 属性 Field


    public TestBean(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    private void sysName() {
        Log.e("TAG", "name------>" + name);

    }
}
