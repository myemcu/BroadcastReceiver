package com.myemcu.app_13broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn1;
    private Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 发送普通广播
                Intent intent = new Intent("com.myemcu.app_13broadcastreceiver.OrderBC");
                sendBroadcast(intent,null);
            }
        });

        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 发送有序广播
                Intent intent = new Intent("com.myemcu.app_13broadcastreceiver.OrderBC");
                sendOrderedBroadcast(intent,null);
            }
        });
    }

    private void findViews() {
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn2 = (Button) findViewById(R.id.btn2);
    }
}
