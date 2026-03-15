package org.example.DesignPatterns.b_ObserverPattern.Examples.Observable;


import org.example.DesignPatterns.b_ObserverPattern.Examples.PendingNotification;
import org.example.DesignPatterns.b_ObserverPattern.Examples.Observer.StockObserver;

public interface StockObservable {
    void add(StockObserver obs);
    void remove(StockObserver obs);
    void sendNotifications();
    void setData(PendingNotification pendingNotification);
}
