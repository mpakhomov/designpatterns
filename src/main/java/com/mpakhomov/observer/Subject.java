package com.mpakhomov.observer;

/**
 * Generic Subject interface (Publisher). It supports both push and pull-like notifications.
 *
 * <p>For pull-like notifications, an observer receives a reference to the {@link com.mpakhomov.observer.Subject}
 * as a parameter in {@link com.mpakhomov.observer.Observer#notify(Subject, Object)}. Hence, the actual data
 * can be be pulled as simple as {@code subject.getData()}
 *
 * @author mpakhomov
 * @since 8/30/15
 */
public interface Subject<E> {

    public void addObserver(Observer<E> observer);
    public void removeObserver(Observer<E> observer);
    public void pushNotify(E data);
    public void pullNotify();

    public E getData();
    public void setData(E data);
}
