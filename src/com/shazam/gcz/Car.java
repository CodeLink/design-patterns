package com.shazam.gcz;

public class Car implements Observer{
    private String speed;
    private String size;
    public Car(CarSubject cs){
        cs.addObserver(this);
    }
    public void update(String speed,String size){
        this.speed = speed;
        this.size = size;
        display();
    }
    void display(){
        System.out.println("乘坐"+size+"个人的汽车，要以"+speed+"的速度跑！");
    }
}
