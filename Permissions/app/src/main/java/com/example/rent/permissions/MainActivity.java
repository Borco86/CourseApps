package com.example.rent.permissions;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1024;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button readSms = (Button) findViewById(R.id.read_sms);
        readSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                askAboutPermission(v);
            }
        });
    }

    private void askAboutPermission(View v) {
        if (ContextCompat.checkSelfPermission(v.getContext(), Manifest.permission.READ_SMS)
                == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(v.getContext(), "User has permission", Toast.LENGTH_LONG).show();
        } else {
            requestPermission(v);

        }
    }

    private void requestPermission(View v) {
        //TODO permission request
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_SMS)) {
            showDialog(v.getContext(), new Runnable() {
                @Override
                public void run() {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_SMS}, REQUEST_CODE);
                }
            });
            Toast.makeText(v.getContext(), "treść komunikatu", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_SMS}, REQUEST_CODE);
        }
    }

    private void showDialog(Context context, final Runnable onUserSaysOk) {
        new AlertDialog.Builder(context)
                .setTitle("Proszę o uprawnienie")
                .setMessage("Bo potrzebuję")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (onUserSaysOk != null) {
                            onUserSaysOk.run();
                        }
                    }
                }).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "User has permission", Toast.LENGTH_LONG).show();
        }
    }
}
