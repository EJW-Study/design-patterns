package com.ejw.designpatterns.ejkim.bridge.apple;

public class MacbookAir implements Macbook {
    Color color;

    MacbookAir(Color color){
        this.color = color;
    }

    @Override
    public String getMacbook() {
        return "MacbookAir " + color.getColor();
    }
}