package com.ejw.designpatterns.ejkim.adaptor.starcraft;

public class Reaver implements GroundUnit {
    @Override
    public void move() {
        System.out.println("리버가 기어다닙니다.");
    }
}
