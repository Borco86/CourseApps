package com.example.rent.pushnotificationexampleapp;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by RENT on 2017-04-13.
 */

public class FcmMessengingService extends FirebaseMessagingService {

    public static final String NOTIFICATION_KEY = "NOTIFICATION_KEY";
    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String notificationString = remoteMessage.getNotification().getBody();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(NOTIFICATION_KEY, notificationString);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentInfo(notificationString)
                .setSmallIcon(android.R.drawable.btn_star)
                .setContentTitle(getString(R.string.our_awesome_notification))
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(123, builder.build());

        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent secondIntent = new Intent(this, AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(this, 0, secondIntent, 0);
        alarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime(), 1000, alarmIntent);
    }
}
