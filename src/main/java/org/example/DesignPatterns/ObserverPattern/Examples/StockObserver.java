package org.example.DesignPatterns.ObserverPattern.Examples;

import org.example.DesignPatterns.ObserverPattern.Observable;

public interface StockObserver {
    void update(PendingNotification pendingNotification);
}
