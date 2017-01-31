package com.example.lesson42;

public class Cart {
    public static void main(String[] args) {
        Computer basicComputer = new Delivery(new AdditionalWarranty(new PlainComputer()));
        System.out.println("Order: " + basicComputer.getDescription());
        System.out.println("Total: " + basicComputer.getCost());
    }
}
