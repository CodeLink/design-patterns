package com.shazam.decorator;

import com.shazam.decorator.superClass.Coffee;

public class Kabu extends Coffee {
    public Kabu(){
        description = "卡布奇诺";
    }
    public double cost(){
        return 2.59;
    }
}
