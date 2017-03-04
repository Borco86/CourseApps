package com.example.rent.animatorset;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView animationObject = (TextView) findViewById(R.id.animation_object);

        ValueAnimator toRightAnimator = ObjectAnimator.ofFloat(animationObject, View.TRANSLATION_X, 0,800);
        toRightAnimator.setDuration(1000);
        ValueAnimator rotateAnimator = ObjectAnimator.ofFloat(animationObject, View.ROTATION, 0,90);
        rotateAnimator.setDuration(2000);
        ValueAnimator toBottomAnimator = ObjectAnimator.ofFloat(animationObject, View.TRANSLATION_Y, 0,1200);
        toRightAnimator.setDuration(2000);
        ValueAnimator rotate2Animator = ObjectAnimator.ofFloat(animationObject, View.ROTATION, 90,180);
        rotateAnimator.setDuration(2000);
        ValueAnimator toLeftAnimator = ObjectAnimator.ofFloat(animationObject, View.TRANSLATION_X, 0,-800);
        toRightAnimator.setDuration(2000);
        ValueAnimator rotate3Animator = ObjectAnimator.ofFloat(animationObject, View.ROTATION, 180,270);
        rotateAnimator.setDuration(2000);
        ValueAnimator toTopAnimator = ObjectAnimator.ofFloat(animationObject, View.TRANSLATION_Y, 0,-1200);
        toRightAnimator.setDuration(2000);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(toRightAnimator,rotateAnimator,toBottomAnimator,rotate2Animator,toLeftAnimator,rotate3Animator,toTopAnimator);
        animatorSet.start();

//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                animationObject.set
//            }
//        });




    }
}
