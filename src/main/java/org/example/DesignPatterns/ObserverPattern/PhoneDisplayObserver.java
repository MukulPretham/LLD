package org.example.DesignPatterns.ObserverPattern;

public class PhoneDisplayObserver implements Observer{
    Observable observing;
    PhoneDisplayObserver(Observable obs){
        this.observing = obs;
    }
    @Override
    public void update(Observable observable) {
        System.out.println("form Phone : " + observing.getData());
    }
}