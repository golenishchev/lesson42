package com.example.lesson42;

public class Delivery extends ServiceDecorator {
    public Delivery(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding Delivery");
    }

    public String getDescription() {
        return tempComputer.getDescription() + ", Delivery";
    }

    public double getCost() {
        return tempComputer.getCost() + 2;
    }
}
