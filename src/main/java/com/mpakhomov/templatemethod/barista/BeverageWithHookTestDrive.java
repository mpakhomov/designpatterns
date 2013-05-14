package com.mpakhomov.templatemethod.barista;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 2:14 PM
 */
public class BeverageWithHookTestDrive {

    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }

}
