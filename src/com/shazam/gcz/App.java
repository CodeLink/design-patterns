package com.shazam.gcz;

public class App {
    public static void main(String[] args) {
        CarSubject cs = new CarSubject();
        Car c = new Car(cs);
        Bicycle b = new Bicycle(cs);
        cs.setCar("999km/h","4");
    }
}
