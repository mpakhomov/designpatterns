package com.mpakhomov.observer;

import java.util.*;

/**
 * Generic Subject implementation. It sends both pull and push notification to all of its observers/subscribers
 *
 * @author mpakhomov
 * @since 8/30/15
 */
public class GenericSubject<E> implements Subject<E> {
    private final ArrayList<Observer<E>> observers = new ArrayList<>();
    private E data;

    /**
     * add the given observer (subscriber)
     *
     * @param observer the observer
     */
    @Override
    public void addObserver(Observer<E> observer) {
        observers.add(observer);
    }

    /**
     * remove the given observer from the list of observers (subscribers)
     *
     * @param observer the observer
     */
    @Override
    public void removeObserver(Observer<E> observer) {
        observers.remove(observer);
    }

    /**
     * send push notification to all of its observers
     *
     * @param data the data to be passed to the observers
     */
    @Override
    public void pushNotify(E data) {
        for (Observer<E> observer : observers) {
            observer.notify(this, data);
        }
    }


    /**
     * send pull notification to all of its observers
     */
    @Override
    public void pullNotify() {
        pushNotify(null);
    }

    /**
     * Get the data. This is a way, that observers can obtain the data after pull notification
     *
     * @return the data that stored in the object
     */
    @Override
    public E getData() {
        return data;
    }

    /**
     * Set the data
     *
     * @param data the data
     */
    @Override
    public void setData(E data) {
        this.data = data;

    }
}
