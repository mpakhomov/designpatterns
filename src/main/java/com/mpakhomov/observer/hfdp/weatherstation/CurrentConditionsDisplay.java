package com.mpakhomov.observer.hfdp.weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/23/13
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    //private Subject weatherData;
    private Observable observable;

    CurrentConditionsDisplay(Observable observable) {
        //this.weatherData = weatherData;
        this.observable = observable;
        observable.addObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2f F degrees and %.2f %% humidity\n",
                temperature, humidity);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
