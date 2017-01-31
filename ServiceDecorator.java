package com.example.lesson42;

abstract class ServiceDecorator implements Computer {
    protected Computer tempComputer;

    public ServiceDecorator(Computer newComputer) {
        tempComputer = newComputer;

    }

    public String getDescription() {
        return tempComputer.getDescription();
    }

    public double getCost() {
        return tempComputer.getCost();
    }

}
