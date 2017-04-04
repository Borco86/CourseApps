package com.example.rent.dagger2_dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SimpleObject simpleObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppConfig appConfig = (AppConfig) getApplication();
        appConfig.getMyComponent().inject(this);

        Toast.makeText(appConfig, simpleObject.getName()+" "+simpleObject.getSecondObject(), Toast.LENGTH_SHORT).show();
    }
}
