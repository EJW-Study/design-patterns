package com.ejw.designpatterns.ejkim.adaptor.starcraft;

public class Test {
    public static void main(String[] args) {
        GroundUnit reaver = new Reaver();
        reaver.move();
        reaver = new ShuttleAdapter(new Shuttle());
        reaver.move();
    }
}