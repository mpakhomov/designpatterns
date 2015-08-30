package com.mpakhomov.observer;

/**
 * Generic observer implementation
 *
 * @author mpakhomov
 * @since 8/30/15
 */
public class GenericObserver<E> implements Observer<E> {

    private final Observer<E> observer;
    private final Subject<E> subject;


    public GenericObserver(Subject<E> subject, Observer<E> observer) {
        this.subject = subject;
        this.observer = observer;
        subject.addObserver(this);
    }

    public void notify(Subject<E> subject, E data) {
        observer.notify(subject, data);
    }
}
