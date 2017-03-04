package com.example.rent.a3delevation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.elev_text_view);

        textView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(textView.getElevation()== 0){
                    textView.setElevation(50f);
//                    final ValueAnimator valueAnimator = ObjectAnimator.ofFloat(0,50);
//                    valueAnimator.setDuration(500);
//                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                        @Override
//                        public void onAnimationUpdate(ValueAnimator animation) {
//                            textView.setProgress((Float) animation.getAnimatedValue());
//                        }
//                    });
//                    valueAnimator.start();
                }else {
                    textView.setElevation(0);
                }
            }
        });
    }
}
