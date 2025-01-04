package com.ejw.designpatterns.ejkim.adaptor.star2;

public class InAirUnitAdapter extends AirUnit {
    private final AirUnit airUnit;
    private final GroundUnit groundUnit;
    public InAirUnitAdapter(AirUnit airUnit, GroundUnit groundUnit){
        this.airUnit = airUnit;
        this.groundUnit = groundUnit;
    }
    @Override
    public String move() {
        return groundUnit.name() + "가 "+airUnit.name()+"에 타서 날아다닌다.";
    }
    @Override
    public String name() {
        return airUnit.name()+"에 탄 " + groundUnit.name();
    }
}
