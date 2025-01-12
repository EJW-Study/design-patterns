package com.ejw.designpatterns.jwsung.bridge.impl;

public class DecorateDisplayImpl implements DisplayImpl {
    public DecorateDisplayImpl(String start, String mid, String end) {
        this.start = start;
        this.mid = mid;
        this.end = end;
    }

    String start;
    String mid;
    String end;

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(mid);

    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
