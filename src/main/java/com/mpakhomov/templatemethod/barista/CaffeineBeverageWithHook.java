package com.mpakhomov.templatemethod.barista;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 2:10 PM
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        } else {
            System.out.println("Skipping addCondiments()");
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
