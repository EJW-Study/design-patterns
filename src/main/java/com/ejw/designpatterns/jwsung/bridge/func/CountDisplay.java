package com.ejw.designpatterns.jwsung.bridge.func;

import com.ejw.designpatterns.jwsung.bridge.impl.DisplayImpl;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times){
        open();
        for(int i = 0; i < times; i++){
            print();
        }
        close();
    }
}
