package com.shazam.decorator.peiliao;

import com.shazam.decorator.superClass.Coffee;
import com.shazam.decorator.superClass.PeiliaoDecorator;

public class Mlik extends PeiliaoDecorator {
    Coffee coffee;
    public Mlik(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription()+",milk";
    }
    public double cost(){
        return coffee.cost()+0.2;
    }
}
