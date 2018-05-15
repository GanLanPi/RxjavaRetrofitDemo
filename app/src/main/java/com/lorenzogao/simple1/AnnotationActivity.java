package com.lorenzogao.simple1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lorenzogao.simple.R;

public class AnnotationActivity extends AppCompatActivity {

    @ViewById(R.id.tv)
    private TextView tv;

    @ViewById(R.id.tv1)
    private TextView tv1;

    private int mPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);

        ViewUtils.inject(this);


        tv.setText("ViewById");
        tv1.setText("ViewById1");

    }
}
