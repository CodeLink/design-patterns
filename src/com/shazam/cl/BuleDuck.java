package com.shazam.cl;

public class BuleDuck extends Duck {

    public BuleDuck(){
        f = new CanotFly();
    }

    @Override
    void changeBehavior(FlyBehavior fb) {
        f = fb;
    }

    void display(){
        System.out.println("这里是蓝头鸭。");
    }
    void fly(){
        f.fly();
    }

}
