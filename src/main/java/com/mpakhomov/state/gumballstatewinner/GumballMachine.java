package com.mpakhomov.state.gumballstatewinner;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = noQuarterState;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMighty Gumball, Inc.");
        sb.append("\nJava-enabled Standing Gumball Model #2004\n");
        sb.append("Inventory: " + count + " gumball");
        if (count != 1) {
            sb.append("s");
        }
        sb.append("\nState: ");
        sb.append(state);
        sb.append("\n");
        return sb.toString();
    }


}
