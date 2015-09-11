package com.mpakhomov.proxy.hfdp;

import java.rmi.*;

public class GumballMachineServerTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine =
                    new GumballMachine(args[0], count);
            String rmiUrl = "//" + args[0] + "/gumballmachine";
            System.out.println("starting RMI at " + rmiUrl);
            Naming.rebind(rmiUrl, gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
