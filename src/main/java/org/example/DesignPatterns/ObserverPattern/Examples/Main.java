package org.example.DesignPatterns.ObserverPattern.Examples;

public class Main {
    public static void main(String[] args) {

        UserStockObservable userStockObservable = new UserStockObservable();
        UserStockObserver userStockObserver = new UserStockObserver(userStockObservable);
        userStockObservable.add(userStockObserver);

        userStockObservable.setData(new PendingNotification("Mukul","IPhone"));
        userStockObservable.setData(new PendingNotification("Pretham","Laptop"));

    }
}
