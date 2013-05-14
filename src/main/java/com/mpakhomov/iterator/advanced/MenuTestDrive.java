package com.mpakhomov.iterator.advanced;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
