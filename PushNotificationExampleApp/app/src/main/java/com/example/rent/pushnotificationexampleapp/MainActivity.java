package com.example.rent.pushnotificationexampleapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.firebase.iid.FirebaseInstanceId;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = FirebaseInstanceId.getInstance().getToken();
        Log.e("FCM Token: ", s);
        //e4Svjtr9DQ0:APA91bE6CNnZ4ZCSyYRXuYC4Sh_oI05muBm7ng_amvtgZGTHU4JhQrP8tWlnR7FxjNQVPzCSEVKKp0tYn3v6-BhuF_LH84HtG_UYxGrulkMba_6WLWCwXH1a3eRb2R65f-BEAdFavsfH
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 25);

        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent secondIntent = new Intent(this, AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(this, 0, secondIntent, 0);
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), alarmIntent);

        findViewById(R.id.remove_alarm_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarmIntent.cancel();
                alarmManager.cancel(alarmIntent);
            }
        });
    }
}
