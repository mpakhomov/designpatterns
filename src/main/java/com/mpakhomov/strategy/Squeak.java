package com.mpakhomov.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
