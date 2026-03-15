package org.example.DesignPatterns.b_ObserverPattern.Examples;

import org.example.DesignPatterns.b_ObserverPattern.Examples.Observable.UserStockObservable;
import org.example.DesignPatterns.b_ObserverPattern.Examples.Observer.UserStockObserver;

public class Main {
    public static void main(String[] args) {

        UserStockObservable userStockObservable = new UserStockObservable();
        UserStockObserver userStockObserver = new UserStockObserver(userStockObservable);
        userStockObservable.add(userStockObserver);
        userStockObservable.setData(new PendingNotification("Mukul","IPhone"));
        userStockObservable.setData(new PendingNotification("Pretham","Laptop"));

    }
}
