package com.myemcu.app_13broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BReceiver extends BroadcastReceiver {
    public BReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        Bundle bundle = getResultExtras(true); // 获取数据包(来自A)
        Toast.makeText(context,"B被广播，"+"收到的信息："+bundle.getString("A"),Toast.LENGTH_SHORT).show();
    }
}
