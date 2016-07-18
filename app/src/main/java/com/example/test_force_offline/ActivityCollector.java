package com.example.test_force_offline;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨天宇 on 2016/7/18.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
