package com.example.debugging;

public class AssertionOverloadExample {
    public static void main(String[] args) {
        int quantity = -5;

        assert quantity >= 0 : "Quantity cannot be negative";

        System.out.println("Order processing completed");
    }
}