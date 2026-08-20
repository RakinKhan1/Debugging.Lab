package com.example.debugging;

public class LogicBugExample {
    public static void main(String[] args) {
        int age = 17;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}