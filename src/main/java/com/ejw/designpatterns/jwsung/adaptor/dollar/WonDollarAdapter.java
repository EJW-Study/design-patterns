package com.ejw.designpatterns.jwsung.adaptor.dollar;

import com.ejw.designpatterns.jwsung.adaptor.won.Won;

public class WonDollarAdapter extends Won {

    public static final int RATE = 1400;

    public WonDollarAdapter(Dollar dollar) {
        super(RATE * dollar.value, dollar.count);
    }
}
