package com.ejw.designpatterns.jwsung.adaptor;

import com.ejw.designpatterns.jwsung.adaptor.won.Coin;

import java.util.ArrayList;
import java.util.List;

public class CoinWallet {

    List<Coin> coins = new ArrayList<>();

    public void addCoin(Coin coin) {

        if(coins.contains(coin)){
            coins.get(coins.indexOf(coin)).addCount(coin);
        } else {
            coins.add(coin);
        }
    }

    public void showCoinCount(){
        StringBuilder sb = new StringBuilder();

        if(coins.isEmpty()){
            sb.append("현재 보유 중인 동전이 없습니다.");
        } else {
            sb.append("현재 보유 중인 동전은");

            for(Coin coin : coins){
                sb.append(coin.toString());
            }
            sb.append(" 입니다.");
        }

        System.out.println(sb.toString());
    }

}
