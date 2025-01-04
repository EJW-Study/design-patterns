package com.ejw.designpatterns.ejkim.adaptor.star2;

public class InShuttleAdapter extends Shuttle{
    private final Unit unit;
    public InShuttleAdapter(Unit unit){
        this.unit = unit;
    }
    @Override
    public String move() {
        return unit.name() + "가 셔틀에 타서 날아다닌다.";
    }
    @Override
    public String name() {
        return "셔틀에 탄 " + unit.name();
    }
}
