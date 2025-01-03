package com.ejw.designpatterns.jwsung.adaptor.dollar;

public class Dollar {

    public Dollar(int value, int count) {
        this.value = value;
        this.count = count;
    }

    protected final int value;
    protected final int count;

    @Override
    public String toString() {
        return "$" + (value * count);
    }
}
