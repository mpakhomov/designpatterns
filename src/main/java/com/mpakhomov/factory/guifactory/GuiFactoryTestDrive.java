package com.mpakhomov.factory.guifactory;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 5/7/13
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */
enum OS_TYPE {
    OSX, WIN
}

interface Button {
    void paint();
}

interface GuiFactory {
    Button createButton();
}

class WinFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }
}

class OSXFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}

class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton");
    }
}

class OSXButton implements Button {

    @Override
    public void paint() {
        System.out.println("I'm an OSXButton");
    }
}

class Application {
    public Application(GuiFactory factory) {
        Button button = factory.createButton();
        button.paint();
    }
}

public class GuiFactoryTestDrive {
    public static void main(String[] args) {
        OS_TYPE os = OS_TYPE.valueOf(args[0]);
        new Application(createOsSpecificFactory(os));
    }

    public static GuiFactory createOsSpecificFactory(OS_TYPE os) {
        switch (os) {
            case WIN: return new WinFactory();
            case OSX: return new OSXFactory();
            default: throw new RuntimeException("unknown os type: " + os);
        }
    }
}
