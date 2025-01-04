package com.ejw.designpatterns.ejkim.adaptor.star2;

public class Dropship extends AirUnit {
    @Override
    public String move() {
        return "드롭십이 " + super.move();
    }
    @Override
    public String name() {
        return super.name() + "드롭십";
    }
}
