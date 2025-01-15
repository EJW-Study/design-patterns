package com.ejw.designpatterns.jwsung.bridge;

import com.ejw.designpatterns.jwsung.bridge.func.CountDisplay;
import com.ejw.designpatterns.jwsung.bridge.func.Display;
import com.ejw.designpatterns.jwsung.bridge.func.IterateDisplay;
import com.ejw.designpatterns.jwsung.bridge.func.RandomDisplay;
import com.ejw.designpatterns.jwsung.bridge.impl.DecorateDisplayImpl;
import com.ejw.designpatterns.jwsung.bridge.impl.StringDisplayImpl;

public class BridgeMain {

    public static void main(String[] args) {

        String contents = "Hello World!";

        Display d1 = new Display(new StringDisplayImpl(contents));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl(contents));
        RandomDisplay d3 = new RandomDisplay(new StringDisplayImpl(contents));
        IterateDisplay d4 = new IterateDisplay(new DecorateDisplayImpl("|", "##", "-"));

        d1.display();

        d2.display();
        d2.multiDisplay(5);

        d3.randomDisplay(10);

        d4.iterateDisplay(3);

        d1 = new Display(new DecorateDisplayImpl("<",contents,">"));
        d1.display();

        d2 = new CountDisplay(new DecorateDisplayImpl("|", contents, "-"));
        d2.multiDisplay(5);

    }
}
