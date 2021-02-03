package com.example.custombroadcast02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.custombroadcast02.ACTION_SEND".equals(intent.getAction())){
            String extraData = intent.getStringExtra("com.example.custombroadcast02.EXTRA_DATA");
            Toast.makeText(context,"From Receiver App: "+extraData,Toast.LENGTH_LONG).show();
        }
    }
}
