package com.example.rent.googleplayapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyFlavourCheckInterface myFlavourCheckInterface = new MyFlavourCheckInterfaceRight();
        String text = myFlavourCheckInterface.returnMyFlavourName();


        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(text);
    }


}
