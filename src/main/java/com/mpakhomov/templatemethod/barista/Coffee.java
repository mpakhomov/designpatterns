package com.mpakhomov.templatemethod.barista;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 1:13 PM
 */
public class Coffee extends CaffeineBeverage {

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        brewCoffeeGrinds();
    }

    @Override
    void addCondiments() {
        addSugarAndMilk();
    }
}