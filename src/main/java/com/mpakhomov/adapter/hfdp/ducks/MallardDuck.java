package com.mpakhomov.adapter.hfdp.ducks;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/27/13
 * Time: 5:14 PM
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I’m flying");
    }
}
