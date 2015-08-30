package com.mpakhomov.observer;

/**
 * Generic Observer interface (Subscriber)
 *
 * @author mpakhomov
 * @since 8/30/15
 * @param <E> the type of the data passed from subject to observers
 */
@FunctionalInterface
public interface Observer<E> {
    /**
     * the observers (subscribers) get notifications via this function call
     *
     * @param subject reference to the subject (publisher)
     * @param data data to be passed to observers.
     */
    void notify(Subject<E> subject, E data);
}