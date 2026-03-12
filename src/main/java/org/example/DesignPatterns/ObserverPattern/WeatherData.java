package org.example.DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    int data;
    List<Observer> observer = new ArrayList<>();

    public void add(Observer obs) {
        this.observer.add(obs);
    }

    public void remove(Observer obs) {
        this.observer.add(obs);
    }

    public void sendNotification() {
        for (Observer obs : this.observer){
            obs.update(this);
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        this.sendNotification();
    }

    @Override
    public int getData() {
        return this.data;
    }

}
