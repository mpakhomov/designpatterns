package com.mpakhomov.factory.hfdp.simplefactory;

import java.util.ArrayList;

abstract public class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String t :toppings) {
            display.append(t + "\n");
        }
        return display.toString();
    }

}
