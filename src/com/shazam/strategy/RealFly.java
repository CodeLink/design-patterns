package com.shazam.strategy;

public class RealFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("这可是真飞！");
    }
}
