package com.mpakhomov.factory.hfdp.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/25/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
