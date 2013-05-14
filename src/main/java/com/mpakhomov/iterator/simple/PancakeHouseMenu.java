package com.mpakhomov.iterator.simple;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator();
    }

    private class PancakeHouseMenuIterator implements Iterator<MenuItem> {
        private int position = 0;


        @Override
        public boolean hasNext() {
            return position < menuItems.size();
        }

        @Override
        public MenuItem next() {
            return menuItems.get(position++);
        }

        @Override
        public void remove() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }



    // other menu methods here
}
