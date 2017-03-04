package com.example.rent.java8synch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.annimon.stream.Stream;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setOnClickListener(v -> {

        });

        List<String> list = Arrays.asList("Zofia", "Kamil", "Michał");
        // java 7
        for (String item : list) {
            Log.d("result", item);
        }
        // lambda
        Stream.of(list).forEach(s -> {
            Log.d("result", s);
        });
        // wyszukiwanie "Zofia"
        Stream.of(list).filter(z ->
                z.equals("Zofia")).forEach(z -> Log.d("result", z));

    }
}
