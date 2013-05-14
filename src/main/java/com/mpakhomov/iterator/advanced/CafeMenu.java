package com.mpakhomov.iterator.advanced;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class CafeMenu implements Menu {
        HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

        public CafeMenu() {
            addItem("Veggie Burger and Air Fries",
                    "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                    true, 3.99);
            addItem("Soup of the day",
                    "A cup of the soup of the day, with a side salad",
                    false, 3.69);
            addItem("Burrito",
                    "A large burrito, with whole pinto beans, salsa, guacamole",
                    true, 4.29);
        }

        public void addItem(String name, String description,
                            boolean vegetarian, double price)
        {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems.put(name, menuItem);
        }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}