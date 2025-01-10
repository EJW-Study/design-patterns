package com.ejw.designpatterns.ejkim.adapter.starcraft;

public class Reaver extends GroundUnit {
    @Override
    public String move() {
        return "리버가 " + super.move();
    }

    @Override
    public String name() {
        return super.name() + "리버";
    }
}
