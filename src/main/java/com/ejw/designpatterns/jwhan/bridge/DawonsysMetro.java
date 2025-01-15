package com.ejw.designpatterns.jwhan.bridge;

public class DawonsysMetro extends Metro {
    public DawonsysMetro(MetroAction metroAction) {
        super(metroAction);
    }

    public void dawonsysMetro() {
        metroAction();
    }
}
