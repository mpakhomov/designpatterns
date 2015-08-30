package com.mpakhomov.observer.hfdp.weatherstation;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/23/13
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
