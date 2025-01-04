package com.ejw.designpatterns.ejkim.adaptor.star1;

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
