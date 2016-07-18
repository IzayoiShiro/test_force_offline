package com.example.test_force_offline;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 杨天宇 on 2016/7/18.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
