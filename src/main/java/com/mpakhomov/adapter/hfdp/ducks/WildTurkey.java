package com.mpakhomov.adapter.hfdp.ducks;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/27/13
 * Time: 5:16 PM
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I’m flying a short distance");
    }
}
