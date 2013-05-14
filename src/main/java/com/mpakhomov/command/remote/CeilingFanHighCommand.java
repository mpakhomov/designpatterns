package com.mpakhomov.command.remote;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/26/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    CeilingFanHighCommand(CeilingFan fan) {
        this.ceilingFan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
    }
}
