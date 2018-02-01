package com.shazam.gcz;

public class Bicycle implements Observer{
    private String speed;
    private String size;
    public Bicycle(CarSubject cs){
        cs.addObserver(this);
    }
    public void update(String speed,String size){
        this.speed = speed;
        this.size = size;
        display();
    }
    void display(){
        System.out.println("乘坐"+size+"个人的自行车，要以"+speed+"的速度跑！");
    }
}
