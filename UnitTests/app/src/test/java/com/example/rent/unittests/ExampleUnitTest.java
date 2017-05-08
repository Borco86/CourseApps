package com.example.rent.unittests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void startWithZero(){
        Atm atm = new Atm();
        assertEquals(atm.getBalance(),0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void withdrawMoreThanHave(){
        Atm atm = new Atm();
        atm.withdraw(50);
    }
    @Test
    public void depositTest(){
        Atm atm = new Atm();
        atm.deposit(10);
    }
    @Test
    public void depositAndWithdrawTest(){
        Atm atm = new Atm();
        atm.deposit(10);
        atm.withdraw(5);
        assertEquals(atm.getBalance(),5);
    }
}