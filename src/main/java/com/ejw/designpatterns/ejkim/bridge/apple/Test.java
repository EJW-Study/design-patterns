package com.ejw.designpatterns.ejkim.bridge.apple;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Macbook macbookProSpacegray = new MacbookPro(new Spacegray());
        Macbook macbookAirSpacegray = new MacbookAir(new Spacegray());
        Macbook macbookProSilver = new MacbookPro(new Silver());
        Macbook macbookAirSilver = new MacbookAir(new Silver());
        List<Macbook> macbooks =  List.of(macbookProSpacegray, macbookAirSpacegray, macbookProSilver, macbookAirSilver);
        for(Macbook macbook : macbooks){
            System.out.println(macbook.getMacbook());
        }
    }
}