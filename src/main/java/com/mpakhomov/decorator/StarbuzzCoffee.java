package com.mpakhomov.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        printBeverage(espresso);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printBeverage(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        printBeverage(beverage3);
    }

    public static void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() +
                " $ " + beverage.cost());
    }
}
