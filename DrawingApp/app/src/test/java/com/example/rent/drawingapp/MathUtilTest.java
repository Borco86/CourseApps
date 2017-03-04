package com.example.rent.drawingapp;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by RENT on 2017-02-15.
 */
public class MathUtilTest {

    private MathUtil mathUtil;

    @Before
    public void setUp() {
        mathUtil = new MathUtil();
    }

    @Test
    public void shouldSumTwoNumbers() {

        // AssertJ - biblioteka asercji
        //  given
        int first = 2;
        int second = 2;

        //  when
        //result = mathUtil.sum(first, second);
        //  then
        //Assertions.assertThat(result).isEqualTo(4);
    }

}