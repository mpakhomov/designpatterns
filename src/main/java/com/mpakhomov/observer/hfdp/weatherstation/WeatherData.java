package com.mpakhomov.observer.hfdp.weatherstation;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/23/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData extends Observable {
//    final private ArrayList<Observer> observers =  new ArrayList<Observer>();
    private float pressure;
    private float humidity;
    private float temperature;

    WeatherData() {

    }

//    @Override
//    public void add(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0) {
//            observers.remove(i);
//        }
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (Observer o : observers) {
//            o.update(temperature, humidity, pressure);
//        }
//    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getTemperature() {
        return this.temperature;
    }
}
