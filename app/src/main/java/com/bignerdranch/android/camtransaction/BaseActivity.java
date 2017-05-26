package com.bignerdranch.android.camtransaction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 杨涵 on 2017/5/24.
 */

public class BaseActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
