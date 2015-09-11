package com.mpakhomov.proxy.hfdp;

import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
