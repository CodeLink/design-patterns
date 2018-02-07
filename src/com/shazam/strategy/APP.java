package com.shazam.strategy;

public class APP {
    public static void main(String[] args) {
        RedDuck red = new RedDuck();
        red.swming();
        red.fly();
        BuleDuck blue = new BuleDuck();
        blue.swming();
        blue.fly();
        System.out.println("换");
        red.changeBehavior(new CanotFly());
        red.fly();
        blue.changeBehavior(new RealFly());
        blue.fly();
    }
}
