package com.example.debugging;

import java.util.logging.Logger;

public class TracingExample {
    private static final Logger logger = Logger.getLogger(TracingExample.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");

        int result = add(10, 20);

        logger.info("Result is " + result);

        System.out.println("Finished");
    }

    private static int add(int a, int b) {
        logger.info("Adding " + a + " and " + b);
        return a + b;
    }
}