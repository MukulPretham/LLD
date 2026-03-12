package org.example.DesignPatterns.ObserverPattern.Examples;

import org.example.DesignPatterns.ObserverPattern.Observable;
import org.example.DesignPatterns.ObserverPattern.Observer;

import java.util.List;

public class UserStockObserver implements StockObserver {

    StockObservable obs;

    public UserStockObserver(StockObservable userStockObservable) {
        this.obs = userStockObservable;
    }

    @Override
    public void update(PendingNotification pendingNotification) {
        System.out.println(pendingNotification.user() + pendingNotification.product());
    }
}
