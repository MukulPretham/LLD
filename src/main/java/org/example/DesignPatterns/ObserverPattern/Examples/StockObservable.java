package org.example.DesignPatterns.ObserverPattern.Examples;


import java.util.ArrayList;
import java.util.List;

public interface StockObservable {
    void add(StockObserver obs);
    void remove(StockObserver obs);
    void sendNotifications();
    void setData(PendingNotification pendingNotification);

}
