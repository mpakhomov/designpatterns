package com.mpakhomov.iterator.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 1:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergedIterator<E> implements Iterator<E> {
    private LinkedList<Iterator<E>> iterators = new LinkedList<Iterator<E>>();
    private Iterator<E> currIt = null;

    MergedIterator(Iterator<E> ... iterators) {
        for (Iterator<E> it: iterators) {
            this.iterators.add(it);
        }
        if (this.iterators.size() == 0) {
            throw new IllegalArgumentException("empty iterators lists");
        } else {
            currIt = this.iterators.poll();
        }
    }

    @Override
    public boolean hasNext() {
        if (currIt == null) {
            return false;
        }

        if (currIt.hasNext()) {
            return true;
        }

        currIt = this.iterators.poll();
        if (currIt != null) {
            return currIt.hasNext();
        } else {
            return false;
        }

    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E val = currIt.next();
        if (!currIt.hasNext()) {
            currIt = this.iterators.poll();
        }
        return val;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
