package com.shazam.decorator.peiliao;

import com.shazam.decorator.superClass.Coffee;
import com.shazam.decorator.superClass.PeiliaoDecorator;

public class Soy extends PeiliaoDecorator {
    Coffee coffee;
    public Soy(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription()+",soy";
    }
    public double cost(){
        double cost = 0.0;
         if(coffee.getSize()== Size.BIG.getCode()){
             cost =  coffee.cost()+0.50;
         }else if(coffee.getSize()== Size.MIDDLE.getCode()){
             cost =  coffee.cost()+0.25;
         }else if(coffee.getSize()== Size.SMALL.getCode()){
             cost =  coffee.cost()+0.10;
         }
         return cost;

    }
}
