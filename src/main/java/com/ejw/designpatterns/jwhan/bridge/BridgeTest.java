package com.ejw.designpatterns.jwhan.bridge;

public class BridgeTest {
    public static void main(String[] args) {


        Metro metro = new Metro(new MetroActionImpl("Metro"));
        RotemMetro rotem = new RotemMetro(new MetroActionImpl("HyundaiRotem"));
        WoojinMetro wojin = new WoojinMetro(new MetroActionImpl("Woojin"));
        DawonsysMetro dawon = new DawonsysMetro(new MetroActionImpl("Dawonsys"));

        metro.metroAction();
        rotem.metroAction();

        rotem.fastMetro(20);
        wojin.woojinMetro();
        dawon.dawonsysMetro();
    }
}
