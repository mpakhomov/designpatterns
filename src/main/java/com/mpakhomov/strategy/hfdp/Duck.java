package com.mpakhomov.strategy.hfdp;


/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    abstract public void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
