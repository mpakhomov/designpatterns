package com.mpakhomov.state.gumballstatewinner;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(50);
        System.out.println(gumballMachine);

        for (int i = 0; i < 15; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
        System.out.println(gumballMachine);
    }
}
