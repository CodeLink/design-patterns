package com.shazam.strategy;

abstract public class Duck {
    FlyBehavior f;

    abstract void changeBehavior(FlyBehavior fb);

    void swming(){
        System.out.println("所有的鸭子都会游泳。");
    }
}
