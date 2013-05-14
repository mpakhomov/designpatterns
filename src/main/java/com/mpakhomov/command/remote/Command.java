package com.mpakhomov.command.remote;

public interface Command {
    public void execute();
    public void undo();
}
