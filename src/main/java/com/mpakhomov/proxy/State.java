package com.mpakhomov.proxy;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
