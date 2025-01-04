package com.ejw.designpatterns.ejkim.adaptor.star2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 리버
        GroundUnit reaver = new Reaver();
        // 셔틀
        AirUnit shuttle = new Shuttle();
        // 셔틀 리버 컨버팅
        Shuttle reaverOnTheShuttle = new InShuttleAdapter(reaver);
        // 지상 유닛 공중
        AirUnit onTheAirUnit = new InAirUnitAdapter(new Dropship(), new Reaver());
        List<Unit> units =  List.of(reaver, shuttle, reaverOnTheShuttle, onTheAirUnit);
        for(Unit unit : units){
            System.out.println(unit.name());
            System.out.println(unit.move());
        }
    }
}
