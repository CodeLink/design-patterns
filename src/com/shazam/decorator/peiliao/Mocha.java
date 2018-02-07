package com.shazam.decorator.peiliao;

import com.shazam.decorator.superClass.Coffee;
import com.shazam.decorator.superClass.PeiliaoDecorator;

public class Mocha extends PeiliaoDecorator {
    Coffee coffee;
    public Mocha(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription()+",mocha";
    }
    public double cost(){
        return coffee.cost()+0.5;
    }
}
