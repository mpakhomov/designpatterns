package com.mpakhomov.composite.menuiter;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        System.out.println("NullIterator.hasNext");
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public MenuComponent next() {
        System.out.println("NullIterator.next");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
