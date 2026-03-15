package org.example.DesignPatterns.b_ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver(weatherData);
        PhoneDisplayObserver phoneDisplayObserver = new PhoneDisplayObserver(weatherData);
        weatherData.add(tvDisplayObserver);
        weatherData.add(phoneDisplayObserver);
        weatherData.setData(199);
    }
}
