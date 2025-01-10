package com.ejw.designpatterns.jwsung.adapter;

import com.ejw.designpatterns.jwsung.adapter.won.Bill;
import com.ejw.designpatterns.jwsung.adapter.won.Coin;
import com.ejw.designpatterns.jwsung.adapter.won.Won;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdapterTest {

    @Test
    @DisplayName("원 -> 100원 동전 교환 수량")
    void coin100Test(){
        /*
        given
         */
        CoinExchangeMachine coinExchangeMachine = new CoinExchangeMachine();
        Won won = new Bill(1000, 5);

        /*
        when
         */
        Coin coin = coinExchangeMachine.exchangeCoin100(won);

        /*
        then
         */
        Assertions.assertEquals(50, coin.getCount());
    }

    @Test
    @DisplayName("원 -> 500원 동전 교환 가치")
    void test(){
        /*
        given
         */
        CoinExchangeMachine coinExchangeMachine = new CoinExchangeMachine();
        Won won = new Bill(1000, 5);

        /*
        when
         */
        Coin coin = coinExchangeMachine.exchangeCoin500(won);

        /*
        then
         */
        Assertions.assertEquals(50000, coin.getValue());
    }
}
