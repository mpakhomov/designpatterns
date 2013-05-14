package com.mpakhomov.state.gumballstate;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
