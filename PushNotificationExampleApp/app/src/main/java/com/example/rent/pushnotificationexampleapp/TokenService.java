package com.example.rent.pushnotificationexampleapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by RENT on 2017-04-13.
 */

public class TokenService extends FirebaseInstanceIdService {

    public static final String TAG = "TOKEN_SERVICE";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "onTokenRefresh: " + refreshedToken);

    }

    //private void sendRegistrationToServer(String refreshed){}

}
