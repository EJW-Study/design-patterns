package com.ejw.designpatterns.ejkim.bridge.apple;

public class MacbookPro implements Macbook {
    Color color;

    MacbookPro(Color color){
        this.color = color;
    }

    @Override
    public String getMacbook() {
        return "MacbookPro " + color.getColor();
    }
}