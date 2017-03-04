package com.example.rent.drawingapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SimpleDrawingView simpleDrawingView = (SimpleDrawingView) findViewById(R.id.drawing_view);
        Button clearButton = (Button) findViewById(R.id.clear_view);
        Button blueButton = (Button) findViewById(R.id.blue_button);
        Button redButton = (Button) findViewById(R.id.red_button);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleDrawingView.clear();
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleDrawingView.setCurrentColor(ContextCompat.getColor(MainActivity.this, R.color.blue));
            }
        });

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleDrawingView.setCurrentColor(ContextCompat.getColor(MainActivity.this, R.color.red));
            }
        });


    }
}
