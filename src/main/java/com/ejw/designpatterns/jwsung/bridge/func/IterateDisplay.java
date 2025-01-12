package com.ejw.designpatterns.jwsung.bridge.func;

import com.ejw.designpatterns.jwsung.bridge.impl.DisplayImpl;

public class IterateDisplay extends Display {
    public IterateDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void iterateDisplay(int times){

        for(int i = 0; i < times; i++){
            open();

            for(int j = 0; j < i; j++){
                print();
            }

            close();
        }
    }
}
