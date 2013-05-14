package com.mpakhomov.command.remote;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/26/13
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class CeilingFanLowCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    CeilingFanLowCommand(CeilingFan fan) {
        this.ceilingFan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
