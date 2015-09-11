package com.mpakhomov.proxy.dynamicproxy;

/**
 * @author mpakhomov
 * @since 9/11/2015
 */
public class AppTestDynamicProxy {
    public static void main(String[] args) {
        Subject subject = DynamicProxy.createProxy();
        System.out.println(subject.isLessThanZero(-1));
        System.out.println(subject.isLessThanZero(0));
        System.out.println(subject.isLessThanZero(1));
    }
}
