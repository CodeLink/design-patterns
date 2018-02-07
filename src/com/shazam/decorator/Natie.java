package com.shazam.decorator;

import com.shazam.decorator.superClass.Coffee;

public class Natie extends Coffee {
    public Natie(){
        description = "拿铁";
    }
    public double cost(){
        return 1.99;
    }
}
