package com.mpakhomov.factory.hfdp.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/25/13
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        name = "California Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
