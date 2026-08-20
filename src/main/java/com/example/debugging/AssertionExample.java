package com.example.debugging;

public class AssertionExample {
    public static void main(String[] args) {
        int balance = -100;

        assert balance >= 0 : "Balance should not be negative";

        System.out.println("Application continues...");
    }
}