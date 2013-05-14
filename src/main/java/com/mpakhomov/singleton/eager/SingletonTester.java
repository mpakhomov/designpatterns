package com.mpakhomov.singleton.eager;

class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

public class SingletonTester {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
