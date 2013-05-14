package com.mpakhomov.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
