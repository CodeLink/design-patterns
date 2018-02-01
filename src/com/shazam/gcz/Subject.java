package com.shazam.gcz;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String speed,String size);
}
