package com.ejw.designpatterns.jwsung.adapter.won;

public class Coin extends Won {

    public Coin(int value, int count){
        super(value, count);
    }

    @Override
    public String toString() {
        return " " + value + "원 동전 " + count + "개";
    }

}
