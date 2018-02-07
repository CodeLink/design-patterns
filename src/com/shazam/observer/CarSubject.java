package com.shazam.observer;

import java.util.ArrayList;

public class CarSubject implements Subject {
    ArrayList<Observer> observers;
    private String speed;
    private String size;

    public CarSubject(){
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.indexOf(o)>=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver(String speed,String size) {
        for(Observer oo:observers){
            oo.update(speed,size);
        }

    }
    public void setCar(String speed,String size){
        this.speed = speed;
        this.size = size;
        notifyObserver(speed,size);
    }
}
