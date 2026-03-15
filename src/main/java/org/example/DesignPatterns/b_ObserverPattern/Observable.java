package org.example.DesignPatterns.b_ObserverPattern;

public interface Observable {
    void add(Observer obs);
    void remove(Observer obs);
    void sendNotification();
    void setData(int data);
    int getData();
}
