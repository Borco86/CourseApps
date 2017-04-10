package com.example.rent.broadcastreceivers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by RENT on 2017-04-06.
 */

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Yay! Odebrałem broadcasta!", Toast.LENGTH_SHORT).show();
    }

//    private void showNotification(Context context){
//        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context)
//                .setSmallIcon(android.R.drawable.ic_dialog_alert)
//                .setContentTitle("Ojejejeje")
//                .setContentText("Tralalala")
//                .setColor(android.support.v7.appcompat.R.)
//    }

}
