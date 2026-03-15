package org.example.DesignPatterns.a_StrategyDesignPattern;

// Problem
//public class SDP1 {
//    public static void main(String[] args) {
//        Vehicle car = new RangeRover();
//        car.start();
//    }
//}
//
//class Vehicle {
//    void start(){
//        System.out.println("Normal Engine starts");
//    }
//}
//
//class Ferrari extends Vehicle{
//    @Override
//    void start(){
//        System.out.println("Performance Engine starts");
//    }
//}
//
//class RangeRover extends Vehicle {}
//
//class Tesla extends Vehicle{
//    @Override
//    void start(){
//        System.out.println("Electric Engine stars");
//    }
//}
//
//class MG_Hector_EV extends Vehicle{
//    @Override
//    void start(){
//        System.out.println("Electric Engine stars");
//    }
//}

// Observe carefully, Tesla and MG_Hector_EV have same start() implementation and it leads to code duplication.



// Solution
public class SDP1 {
    public static void main(String[] args) {
        StartStrategy evStart = new SportsCarStrategy();
        Vehicle ferrari = new Vehicle(evStart);
        ferrari.start();
    }
}

interface StartStrategy {
    void start();
}

class ElectricCarStrategy implements StartStrategy {

    @Override
    public void start() {
        System.out.println("Electric Engine stars");
    }
}

class SportsCarStrategy implements StartStrategy {

    @Override
    public void start() {
        System.out.println("Performance Engine stars");
    }
}

class Vehicle {
    StartStrategy startStrategy;
    Vehicle(StartStrategy startStrategy){
        this.startStrategy = startStrategy;
    }
    void start(){
        startStrategy.start();
    }
}
