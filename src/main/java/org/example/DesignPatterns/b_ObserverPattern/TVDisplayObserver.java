package org.example.DesignPatterns.b_ObserverPattern;

public class TVDisplayObserver implements Observer{
    Observable observing;
    TVDisplayObserver(Observable obs){
        this.observing = obs;
    }
    @Override
    public void update(Observable observable) {
        System.out.println("form TV : " + observing.getData());
    }
}
