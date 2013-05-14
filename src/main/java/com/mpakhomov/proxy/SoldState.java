package com.mpakhomov.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 2:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class SoldState implements State {
    transient private GumballMachine gumballMachine;

    SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "SoldState";
    }

}
