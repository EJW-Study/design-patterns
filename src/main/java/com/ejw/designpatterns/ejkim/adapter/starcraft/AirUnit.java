package com.ejw.designpatterns.ejkim.adapter.starcraft;

public class AirUnit extends Unit{
    @Override
    String move() {
        return "하늘을 난다.";
    }

    @Override
    String name() {
        return "[공중유닛]";
    }
}
