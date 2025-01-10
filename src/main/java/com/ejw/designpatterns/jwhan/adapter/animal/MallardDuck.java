package com.ejw.designpatterns.jwhan.adapter.animal;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("Duck fly");
    }
}
