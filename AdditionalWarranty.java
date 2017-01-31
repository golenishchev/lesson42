package com.example.lesson42;

public class AdditionalWarranty extends ServiceDecorator {
    public AdditionalWarranty(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding Additional Warranty");
    }

    public String getDescription() {
        return tempComputer.getDescription() + ", Additional Warranty";
    }

    public double getCost() {
        return tempComputer.getCost() + 20;
    }
}
