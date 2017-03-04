package com.example.rent.gallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new GalleryAdapter(Arrays.asList("https://www.google.pl/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FtntOCGkgt98%2Fmaxresdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DtntOCGkgt98&docid=5WIVuNTvHpE7pM&tbnid=sKYUQsX9cMoQ0M%3A&vet=1&w=1600&h=1200&bih=662&biw=1366&q=cats&ved=0ahUKEwj4hpmMqJXSAhUEEiwKHX5ZD_YQMwg0KAMwAw&iact=mrc&uact=8",
                "https://www.google.pl/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FcNycdfFEgBc%2Fmaxresdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DcNycdfFEgBc&docid=jg3EdTLELQlUtM&tbnid=aO8iN8nSL12tVM%3A&vet=1&w=1280&h=720&bih=662&biw=1366&q=cats&ved=0ahUKEwj4hpmMqJXSAhUEEiwKHX5ZD_YQMwgzKAIwAg&iact=mrc&uact=8",
                "https://www.google.pl/imgres?imgurl=https%3A%2F%2Fpbs.twimg.com%2Fprofile_images%2F378800000532546226%2Fdbe5f0727b69487016ffd67a6689e75a.jpeg&imgrefurl=https%3A%2F%2Ftwitter.com%2Fcats&docid=6ePtmzlTUw5vJM&tbnid=W79MI-OOcqCHsM%3A&vet=1&w=638&h=640&bih=662&biw=1366&q=cats&ved=0ahUKEwj4hpmMqJXSAhUEEiwKHX5ZD_YQMwg7KAowCg&iact=mrc&uact=8")));


//        Button previous = (Button) findViewById(R.id.previous_button);
//        Button next = (Button) findViewById(R.id.next_button);
//        final ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper);
//
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                flipper.setInAnimation(MainActivity.this, android.R.anim.slide_in_left);
//                flipper.setOutAnimation(MainActivity.this, android.R.anim.slide_out_right);
//                flipper.showNext();
//            }
//        });
//
//        previous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                flipper.setInAnimation(MainActivity.this, android.R.anim.slide_in_left);
//                flipper.setOutAnimation(MainActivity.this, android.R.anim.slide_out_right);
//                flipper.showPrevious();
//            }
//        });


    }
}
