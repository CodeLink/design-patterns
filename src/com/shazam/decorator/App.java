package com.shazam.decorator;

import com.shazam.decorator.peiliao.Mlik;
import com.shazam.decorator.peiliao.Mocha;
import com.shazam.decorator.peiliao.Soy;
import com.shazam.decorator.superClass.Coffee;

public class App {
    public static void main(String[] args) {
        Coffee coffee1 = new Natie();
        coffee1.setSize(3);
        //coffee1 = new Mlik(coffee1);
        coffee1 = new Soy(coffee1);
        //coffee1 = new Mocha(coffee1);
        System.out.println(coffee1.getDescription()+":$"+coffee1.cost());
    }
}
