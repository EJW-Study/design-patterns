package com.ejw.designpatterns.jwsung.adapter;

import com.ejw.designpatterns.jwsung.adapter.dollar.Dollar;
import com.ejw.designpatterns.jwsung.adapter.dollar.WonDollarAdapter;
import com.ejw.designpatterns.jwsung.adapter.won.Bill;
import com.ejw.designpatterns.jwsung.adapter.won.Coin;

public class AdapterMain {

    public static void main(String[] args) {
        CoinWallet coinWallet = new CoinWallet();
        CoinExchangeMachine coinExchangeMachine = new CoinExchangeMachine();

        Coin coin100 = coinExchangeMachine.exchangeCoin100(new Bill(1000, 5));
        coinWallet.addCoin(coin100);

        coin100 = coinExchangeMachine.exchangeCoin100(new Bill(5000, 2));
        coinWallet.addCoin(coin100);

        Coin coin500 = coinExchangeMachine.exchangeCoin500(new WonDollarAdapter(new Dollar(1, 5)));
        coinWallet.addCoin(coin500);

        coin500 = coinExchangeMachine.exchangeCoin500(new Bill(10000, 1));
        coinWallet.addCoin(coin500);

        coinWallet.showCoinCount();

    }
}
