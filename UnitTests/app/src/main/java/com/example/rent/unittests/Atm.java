package com.example.rent.unittests;

/**
 * Created by RENT on 2017-04-25.
 */
public class Atm {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int i) {
        if(i>balance){
            throw new IllegalArgumentException();
        }else{
            this.balance -= i;
        }
    }
    public void deposit(int i){
        this.balance += i;
    }
}
