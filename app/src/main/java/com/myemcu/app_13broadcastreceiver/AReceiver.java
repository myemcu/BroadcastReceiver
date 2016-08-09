package com.myemcu.app_13broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class AReceiver extends BroadcastReceiver {
    public AReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        Toast.makeText(context,"A被广播",Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle(); // 创建数据包(待传)对象
        bundle.putString("A","I am 'A'");
        setResultExtras(bundle);
    }
}
