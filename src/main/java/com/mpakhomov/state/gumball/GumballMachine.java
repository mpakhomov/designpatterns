package com.mpakhomov.state.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: mpakhomo
 * Date: 4/30/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachine {
    GumballState state = GumballState.SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = GumballState.NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("You can’t insert another quarter");
                break;
            case NO_QUARTER:
                state = GumballState.HAS_QUARTER;
                System.out.println("You inserted a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can’t insert a quarter, the machine is sold out");
                break;
            case SOLD:
                System.out.println("Please wait, we’re already giving you a gumball");
                break;
            default:
                throw new IllegalStateException("Unknown state: " + state);
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = GumballState.NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven’t inserted a quarter");
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
                break;
            case SOLD_OUT:
                System.out.println("You can’t eject, you haven’t inserted a quarter yet");
            default:
                throw new IllegalStateException("Unknown state: " + state);
        }
    }

    public void turnCrank() {
        switch(state) {
            case SOLD:
                System.out.println("Turning twice doesn’t get you another gumball!");
                break;
            case NO_QUARTER:
                System.out.println("You turned but there’s no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case HAS_QUARTER:
                System.out.println("You turned the crank...");
                state = GumballState.SOLD;
                dispense();
                break;
            default:
                throw new IllegalStateException("Unknown state: " + state);
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                count = count - 1;
                if (count == 0) {
                    System.out.println("Oops, out of gumballs!");
                    state = GumballState.SOLD_OUT;
                } else {
                    state = GumballState.NO_QUARTER;
                }
            case NO_QUARTER:
                System.out.println("You need to pay first");
            case SOLD_OUT:
                System.out.println("No gumball dispensed");
            case HAS_QUARTER:
                System.out.println("No gumball dispensed");
                break;
            default:
                throw new IllegalStateException("Unknown state: " + state);
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = GumballState.NO_QUARTER;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMighty Gumball, Inc.");
        sb.append("\nJava-enabled Standing Gumball Model #2004\n");
        sb.append("Inventory: " + count + " gumball");
        if (count != 1) {
            sb.append("s");
        }
        sb.append("\nState: ");
        switch (state) {
            case SOLD_OUT:
                sb.append(state + " sold out");
                break;
            case NO_QUARTER:
                sb.append(state + " waiting for quarter");
                break;
            case HAS_QUARTER:
                sb.append(state + " waiting for turn of crank");
                break;
            case SOLD:
                sb.append("delivering a gumball");
                break;
            default:
                throw new IllegalStateException("Unknown state: " + state);
        }
        sb.append("\n");
        return sb.toString();
    }


}
