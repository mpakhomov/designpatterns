package com.mpakhomov.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";
    protected BeverageSize size = BeverageSize.GRANDE;

    public BeverageSize getBeverageSize() {
        return this.size;
    }

    public void setBeverageSize(BeverageSize size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }


    public abstract double cost();
}