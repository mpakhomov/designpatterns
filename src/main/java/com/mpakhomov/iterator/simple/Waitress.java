package com.mpakhomov.iterator.simple;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
//        MergedIterator<Iterator<MenuItem>> iterator =
//                new MergedIterator<Iterator<MenuItem>>(pancakeIterator, dinerIterator);
//        System.out.println("MENU\n----\n");
//        printMenu(iterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }


}
