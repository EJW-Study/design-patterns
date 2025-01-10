package com.ejw.designpatterns.ejkim.adapter.starcraft;

public class GroundUnit extends Unit{
    @Override
    String move() {
        return "땅위를 걷는다.";
    }

    @Override
    String name() {
        return "[지상유닛]";
    }
}
