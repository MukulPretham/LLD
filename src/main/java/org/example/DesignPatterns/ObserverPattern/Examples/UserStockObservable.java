package org.example.DesignPatterns.ObserverPattern.Examples;

import org.example.DesignPatterns.ObserverPattern.Observable;
import org.example.DesignPatterns.ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class UserStockObservable implements StockObservable {

    List<StockObserver> observers = new ArrayList<>();
    PendingNotification pendingNotification;

    @Override
    public void add(StockObserver obs) {
        this.observers.add(obs);
    }

    @Override
    public void remove(StockObserver obs) {
        this.observers.remove(obs);
    }

    @Override
    public void sendNotifications() {
        for(StockObserver obs : this.observers){
            obs.update(this.pendingNotification);
        }
    }

    @Override
    public void setData(PendingNotification pendingNotification) {
        this.pendingNotification = pendingNotification;
        this.sendNotifications();
    }
}
