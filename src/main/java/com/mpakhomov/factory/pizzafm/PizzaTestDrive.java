package com.mpakhomov.factory.pizzafm;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n" +
            pizza + "\n");


        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = nyPizzaStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n" +
                pizza + "\n");

        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        pizza = californiaPizzaStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n" +
                pizza + "\n");
    }
}
