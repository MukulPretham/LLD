package org.example.DesignPatterns.ObserverPattern;

public interface Observable {
    void add(Observer obs);
    void remove(Observer obs);
    void sendNotification();
    void setData(int data);
    int getData();
}
