package com.shazam.strategy;

public class CanotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞呀！");
    }
}
