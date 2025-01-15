package com.ejw.designpatterns.jwhan.bridge;

public class RotemMetro extends Metro {

    public RotemMetro(MetroAction metroAction) {
        super(metroAction);
    }

    public void rotemMetro() {
        metroAction();
    }

    public String fastMetro(int totalStation) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalStation; i++) {
            metroMove();
            if(i%4 == 0) {
                sb.append("급행역 도착 ");
                sb.append(metroDoorOpen());
                sb.append(metroDoorClose());
            }
        }

        return sb.toString();
    }
}
