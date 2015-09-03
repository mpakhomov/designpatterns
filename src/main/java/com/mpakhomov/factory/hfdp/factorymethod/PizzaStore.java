package com.mpakhomov.factory.hfdp.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/25/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
abstract public class PizzaStore {

    final public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract protected Pizza createPizza(String type);
}
