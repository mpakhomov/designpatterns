package com.mpakhomov.iterator.advanced;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/29/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
