package com.mpakhomov.iterator.advanced;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "A medly of steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator();
        //return new DinerMenuIterator(menuItems);
        //return new AlternatingDinerMenuIterator(menuItems);
    }

    private class DinerMenuIterator implements Iterator<MenuItem> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < MAX_ITEMS && menuItems[position] != null;
        }

        @Override
        public MenuItem next() {
            return menuItems[position++];
        }

        @Override
        public void remove() {
            if (position < 0 || position >= MAX_ITEMS) {
                throw new IllegalStateException();
            }
            System.arraycopy(menuItems, position + 1, menuItems, position,
                    menuItems.length - 1 -position);
            menuItems[menuItems.length - 1] = null;
        }
    }

    // other menu methods here
}
