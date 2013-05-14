package com.mpakhomov.adapter.ducks;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/27/13
 * Time: 5:21 PM
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
