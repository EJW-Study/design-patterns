package com.ejw.designpatterns.jwhan.bridge;

public class WoojinMetro extends Metro{
    public WoojinMetro(MetroAction metroAction) {
        super(metroAction);
    }

    public void woojinMetro() {
        metroAction();
    }
}
