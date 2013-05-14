package com.mpakhomov.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {
    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
