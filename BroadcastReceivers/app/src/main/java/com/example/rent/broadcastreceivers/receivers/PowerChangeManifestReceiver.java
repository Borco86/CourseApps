package com.example.rent.broadcastreceivers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by RENT on 2017-04-06.
 */

public class PowerChangeManifestReceiver extends BroadcastReceiver {

    private static final String POWER_CHANGE_MANIFEST = "PowerChangeManifest";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(POWER_CHANGE_MANIFEST, "I received message 2");
    }
}
