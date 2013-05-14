package com.mpakhomov.singleton.dcl;

class Singleton {
    private static volatile Singleton instance;

    private Singleton(){};

    public static Singleton getInstance() {
        if (instance == null) { // check 1
            synchronized(Singleton.class) {
                if (instance == null) { // check 2
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonDCL {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}