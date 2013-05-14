package com.mpakhomov.adapter.enumiter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/27/13
 * Time: 6:25 PM
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
