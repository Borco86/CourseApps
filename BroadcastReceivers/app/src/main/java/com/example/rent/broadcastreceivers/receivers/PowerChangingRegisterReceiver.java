package com.example.rent.broadcastreceivers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.rent.broadcastreceivers.MainActivity;

/**
 * Created by RENT on 2017-04-06.
 */

public class PowerChangingRegisterReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Yay! Odebrałem broadcasta!", Toast.LENGTH_SHORT).show();

    }
}
