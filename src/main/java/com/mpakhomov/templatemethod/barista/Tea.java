package com.mpakhomov.templatemethod.barista;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 1:22 PM
 */
public class Tea extends CaffeineBeverage {

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        steepTeaBag();
    }

    @Override
    void addCondiments() {
       addLemon();
    }
}
