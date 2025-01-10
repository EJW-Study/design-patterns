package com.ejw.designpatterns.jwhan.adapter.animal;

public class AdaptorTest {
    public static void main(String[] args) throws Exception {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("======== Turkey ========");
        turkey.gobble();
        turkey.fly();

        System.out.println("======== Duck ========");
        duck.quack();
        duck.fly();

        System.out.println("======== Turkey Adapter ========");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
