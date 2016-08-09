package com.myemcu.app_13broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CReceiver extends BroadcastReceiver {
    public CReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
        Toast.makeText(context,"C广播后，令广播终止",Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
