package com.shazam.decorator;

import com.shazam.decorator.superClass.Coffee;

public class Nongsuo extends Coffee {
    public Nongsuo(){
        description = "意式浓缩";
    }
    public double cost(){
        return 2.99;
    }
}
