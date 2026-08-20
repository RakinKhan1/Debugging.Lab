package com.example.debugging;

public class DebuggingExample {
    public static void main(String[] args) {
        int total = 10;
        int count = 0;

        int average = total / count; // Runtime error: ArithmeticException

        System.out.println(average);
    }
}
