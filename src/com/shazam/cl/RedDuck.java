package com.shazam.cl;

public class RedDuck extends Duck {

    public RedDuck(){
        f = new RealFly();
    }

    @Override
    void changeBehavior(FlyBehavior fb) {
        f = fb;
    }

    void display(){
        System.out.println("这里是红头鸭");
    }

    void fly(){
        f.fly();
    }

}
