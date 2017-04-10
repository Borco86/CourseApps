package com.example.rent.broadcastreceivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rent.broadcastreceivers.receivers.PowerChangingRegisterReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private PowerChangingRegisterReceiver powerChangingRegisterReceiver = new PowerChangingRegisterReceiver();
    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter powerChangeIntent = new IntentFilter();
        powerChangeIntent.addAction(Intent.ACTION_POWER_DISCONNECTED);
        powerChangeIntent.addAction(Intent.ACTION_POWER_CONNECTED);
        registerReceiver(powerChangingRegisterReceiver, powerChangeIntent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(powerChangingRegisterReceiver);
    }
}
