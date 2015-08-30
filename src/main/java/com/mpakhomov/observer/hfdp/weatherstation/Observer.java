package com.mpakhomov.observer.hfdp.weatherstation;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/23/13
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
