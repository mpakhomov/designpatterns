package com.mpakhomov.proxy.dynamicproxy;

/**
 * @author mpakhomov
 * @since 9/11/2015
 */
public class RealSubject implements Subject {
    @Override
    public boolean isLessThanZero(int arg) {
        return arg < 0;
    }
}
