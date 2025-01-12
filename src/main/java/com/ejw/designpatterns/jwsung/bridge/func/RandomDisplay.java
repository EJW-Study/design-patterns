package com.ejw.designpatterns.jwsung.bridge.func;

import com.ejw.designpatterns.jwsung.bridge.impl.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomDisplay(int times) {
        Random random = new Random();

        int count = random.nextInt(times);

        open();
        for(int i = 0; i < count; i++) {
            print();
        }
        close();

    }

}
