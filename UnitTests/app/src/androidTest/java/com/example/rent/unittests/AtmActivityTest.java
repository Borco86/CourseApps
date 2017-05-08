package com.example.rent.unittests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-04-26.
 */
@RunWith(AndroidJUnit4.class)
public class AtmActivityTest {

    @Rule
    public ActivityTestRule<AtmActivity> atmTestRule = new ActivityTestRule<>(AtmActivity.class);

    @Test
    public void atm_testIfStarts(){
        AtmActivity currentActivity = atmTestRule.getActivity();
        assertNotNull(currentActivity);
    }
    @Test
    public void atm_startWithZero(){
        AtmActivity currentActivity = atmTestRule.getActivity();
        //String shownBalance = currentActivity.atmT
    }
}
