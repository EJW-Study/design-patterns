package com.ejw.designpatterns.jwsung.adapter;

import com.ejw.designpatterns.jwsung.adapter.won.Coin;
import com.ejw.designpatterns.jwsung.adapter.won.Won;

public class CoinExchangeMachine {

    public Coin exchangeCoin100(Won won) {

        int wonValue = 100;

        return exchangeCoin(won, wonValue);
    }

    public Coin exchangeCoin500(Won won) {

        int wonValue = 500;

        return exchangeCoin(won, wonValue);
    }

    private Coin exchangeCoin(Won won, int wonValue) {

        int coinCount = won.changeCoinCount(wonValue);

        return new Coin(wonValue, coinCount);
    }
}
