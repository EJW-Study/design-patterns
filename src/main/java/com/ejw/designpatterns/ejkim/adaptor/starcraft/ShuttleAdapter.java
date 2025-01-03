package com.ejw.designpatterns.ejkim.adaptor.starcraft;

public class ShuttleAdapter implements GroundUnit {

    Shuttle shuttle;

    public ShuttleAdapter(Shuttle shuttle){
        this.shuttle = shuttle;
    }
    @Override
    public void move() {
        shuttle.move();
    }
}
