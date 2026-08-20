package com.example.debugging;

public class CustomDebugLoggerExample {
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        logDebug("Starting calculation");

        int result = add(5, 7);

        logDebug("Result: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static void logDebug(String message) {
        if (DEBUG) {
            System.out.println("[DEBUG] " + message);
        }
    }
}