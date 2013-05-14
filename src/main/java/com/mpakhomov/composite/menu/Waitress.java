package com.mpakhomov.composite.menu;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
