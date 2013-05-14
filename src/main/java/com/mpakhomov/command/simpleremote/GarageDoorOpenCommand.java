package com.mpakhomov.command.simpleremote;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
