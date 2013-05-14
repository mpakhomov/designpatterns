package com.mpakhomov.templatemethod.barista;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 1:28 PM
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
