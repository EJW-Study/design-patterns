package com.ejw.designpatterns.ejkim.adaptor.star1;

public class Shuttle implements AirUnit {
    @Override
    public void move(){
        System.out.println("셔틀이 날아다닙니다.");
    }
}