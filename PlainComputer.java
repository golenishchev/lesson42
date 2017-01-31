package com.example.lesson42;

public class PlainComputer implements Computer {
    @Override
    public String getDescription() {
        return "Desktop for internet browsing";
    }

    @Override
    public double getCost() {
        return 300.00;
    }
}
