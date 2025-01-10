package com.ejw.designpatterns.jwsung.adapter.won;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Won {

    protected int value;
    protected int count;

    public Won(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int changeCoinCount(int coinCount){
        return (value * count) / coinCount;
    }

    public void addCount(Won won){
        this.count += won.count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Won won = (Won) o;
        return value == won.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
