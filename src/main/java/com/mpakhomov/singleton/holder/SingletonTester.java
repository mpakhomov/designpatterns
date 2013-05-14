package com.mpakhomov.singleton.holder;

class Singleton {
    private Singleton() {};

    private static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

public class SingletonTester {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        //System.out.println("here");
    }
}
