package com.mpakhomov.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
