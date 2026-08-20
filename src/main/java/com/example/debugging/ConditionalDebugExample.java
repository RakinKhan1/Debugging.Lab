package com.example.debugging;

public class ConditionalDebugExample {
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        debugMessage("Application started");

        System.out.println("Running program...");
    }

    private static void debugMessage(String message) {
        if (DEBUG) {
            System.out.println("DEBUG: " + message);
        }
    }
}
