package com.ejw.designpatterns.ejkim.adapter.star2;

public class Shuttle extends AirUnit {
    @Override
    public String move() {
        return "셔틀이 " + super.move();
    }
    @Override
    public String name() {
        return super.name() + "셔틀";
    }
}
