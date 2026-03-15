package org.example.DesignPatterns.b_ObserverPattern.Examples.Observer;

import org.example.DesignPatterns.b_ObserverPattern.Examples.Observable.StockObservable;
import org.example.DesignPatterns.b_ObserverPattern.Examples.PendingNotification;

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
