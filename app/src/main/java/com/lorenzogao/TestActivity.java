package com.lorenzogao;

import android.os.Bundle;
import android.widget.TextView;

import com.lorenzogao.simple.R;

public class TestActivity extends BaseActivity {

    private <T> T viewById(int viewId) {
        return (T) findViewById(viewId);
    }
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tv = viewById(R.id.tv);

        //startActivity(TestActivity.class);


        new HttpCallBack<String>() {

            @Override
            public void onSuccess(String s) {

            }
        };
    }

}
