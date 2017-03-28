package com.example.rent.contactsapp;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor contactsContact = getContentResolver()
                .query(ContactsContract.AUTHORITY_URI, null, null, null, null);
    }
}
