package com.example.rent.gameofreflex;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Integer> images = Arrays.asList(R.drawable.five, R.drawable.four, R.drawable.three, R.drawable.two, R.drawable.one);
    private Random random = new Random();
    private ImageView firstImageView;
    private ImageView secondImageView;
    private int firstImage;
    private int secondImage;
    private Button firstPlayerButton;
    private Button secondPlayerButton;
    private CountDownTimer countDownTimer;
    private Button startButton;
    private boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstImageView = (ImageView) findViewById(R.id.left_image);
        secondImageView = (ImageView) findViewById(R.id.right_image);
        startButton = (Button) findViewById(R.id.start_button);
        //final TextView introTextView = (TextView) findViewById(R.id.intro_text_view);
        firstPlayerButton = (Button) findViewById(R.id.first_user);
        secondPlayerButton = (Button) findViewById(R.id.second_user);
        firstPlayerButton.setOnClickListener(this);
        secondPlayerButton.setOnClickListener(this);

        countDownTimer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                firstImage = images.get(random.nextInt(images.size()));
                secondImage = images.get(random.nextInt(images.size()));
                firstImageView.setImageResource(firstImage);
                firstImageView.setTag(firstImage);
                secondImageView.setImageResource(secondImage);
                secondImageView.setTag(secondImage);
            }

            @Override
            public void onFinish() {
                startButton.setVisibility(View.VISIBLE);
                //isRunning = false;
            }

        };

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// String text = counter == 0 ? "START" : String.valueOf(counter);
// introTextView.setText("3");
//                introTextView.setAlpha(1);
//                introTextView.setScaleX(1);
//                introTextView.setScaleY(1);
//                introTextView.animate().alpha().scaleX(3),scaleY(3).setDuration(2000).setListener(new AnimatorListenerAdapter(){
//                    @Override
//                    public void onAnimationEnd(Animator animation){
// if(counter>0) {
                //          animateCounter(introTextView, animationsEnd, counter)
// countDownTimer.start();
//
//                    }
//                }).start();

                countDownTimer.start();
                startButton.setVisibility(View.GONE);
            }
        });


    }

    @Override
    public void onClick(View v) {

//        if(!isRunning){
//            return;
//        }

        if (firstImageView.getTag().equals(secondImageView.getTag())) {
            if(v.getId() == firstPlayerButton.getId()){
                Toast.makeText(this, "Player ONE wins!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Player TWO wins!", Toast.LENGTH_SHORT).show();
            }
            //countDownTimer.cancel();
        }else{
            if(v.getId() == secondPlayerButton.getId()){
                Toast.makeText(this, "Player TWO wins!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Player ONE wins!", Toast.LENGTH_SHORT).show();
            }
        }
//        firstImageView.setVisibility(View.GONE);
//        secondImageView.setVisibility(View.GONE);
//        startButton.setVisibility(View.VISIBLE);
//        countDownTimer.cancel();
//        isRunning = false;
    }
}
