package com.example.test_force_offline;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;

/**
 * Created by 杨天宇 on 2016/7/18.
 */
public class ForceOfflineReceiver extends BroadcastReceiver {
    private static final String TAG = "ForceOfflineReceiver";

    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.i(TAG, "onReceive: 广播已接收");
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setTitle("Warning");
        builder1.setMessage("You are forced to be offline.Please try to login again.");
        builder1.setCancelable(false);
        builder1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityCollector.finishAll();
                Intent intent1 = new Intent(context, LoginActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);

            }
        });
        Log.i(TAG, "onReceive: builder已经创建完毕");
        AlertDialog alertDialog = builder1.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
        Log.i(TAG, "onReceive: dialog已经显示了");
    }
}
