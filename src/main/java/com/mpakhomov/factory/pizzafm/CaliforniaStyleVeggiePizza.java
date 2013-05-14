package com.mpakhomov.factory.pizzafm;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/25/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
