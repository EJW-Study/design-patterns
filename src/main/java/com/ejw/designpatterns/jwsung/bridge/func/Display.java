package com.ejw.designpatterns.jwsung.bridge.func;

import com.ejw.designpatterns.jwsung.bridge.impl.DisplayImpl;

public class Display {

    DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {this.displayImpl = displayImpl;}

    public void open(){
        displayImpl.rawOpen();
    }

    public void print(){
        displayImpl.rawPrint();
    }

    public void close(){
        displayImpl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }

}
