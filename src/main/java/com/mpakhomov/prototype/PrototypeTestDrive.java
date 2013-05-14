package com.mpakhomov.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 5/7/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
/**
 * Prototype class
 */
interface Prototype {
    void setX(int x);

    void printX();

    int getX();
}

/**
 * Implementation of prototype class
 */
class PrototypeImpl implements Prototype, Cloneable {
    private int x;

    /**
     * Constructor
     */
    public PrototypeImpl(int x) {
        setX(x);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void printX() {
        System.out.println("Value: " + getX());
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public PrototypeImpl clone() throws CloneNotSupportedException {
        return (PrototypeImpl) super.clone();
    }
}

/**
 * Client code
 */
public class PrototypeTestDrive {
    public static void main(String args[]) throws CloneNotSupportedException {
        PrototypeImpl prototype = new PrototypeImpl(1000);

        for (int y = 1; y < 10; y++) {
            // Create a defensive copy of the object to allow safe mutation
            Prototype tempotype = prototype.clone();

            // Derive a new value from the prototype's "x" value
            tempotype.setX(tempotype.getX() * y);
            tempotype.printX();
        }
    }
}
