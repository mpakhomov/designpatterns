package com.mpakhomov.templatemethod.sort;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/28/13
 * Time: 4:51 PM
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}
