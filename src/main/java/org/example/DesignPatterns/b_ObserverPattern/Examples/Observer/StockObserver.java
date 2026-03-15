package org.example.DesignPatterns.b_ObserverPattern.Examples.Observer;

import org.example.DesignPatterns.b_ObserverPattern.Examples.PendingNotification;

public interface StockObserver {
    void update(PendingNotification pendingNotification);
}
