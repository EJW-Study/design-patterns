package com.ejw.designpatterns.jwhan.bridge;

public class RotemMetro extends Metro {

    public RotemMetro(MetroAction metroAction) {
        super(metroAction);
    }

    public void rotemMetro() {
        metroAction();
    }

    public void fastMetro(int totalStation) {
        for (int i = 0; i < totalStation; i++) {
            metroMove();
            if(i%4 == 0) {
                System.out.println("급행역 도착");
                metroDoorOpen();
                metroDoorClose();
            }
        }
    }
}
