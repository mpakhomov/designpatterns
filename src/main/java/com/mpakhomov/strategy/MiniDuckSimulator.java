package com.mpakhomov.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/19/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
