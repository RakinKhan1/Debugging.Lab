package com.example.debugging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CompleteDebuggingLoggingExample {
    private static final Logger logger =
            Logger.getLogger(CompleteDebuggingLoggingExample.class.getName());

    public static void main(String[] args) {
        setupFileLogging();

        logger.info("Application started");

        int number1 = 20;
        int number2 = 0;

        logger.info("Variables initialized");

        try {
            assert number2 != 0 : "number2 must not be zero";

            int result = divide(number1, number2);

            logger.info("Result: " + result);

        } catch (ArithmeticException ex) {
            logger.severe("Divide by zero error: " + ex.getMessage());
            System.out.println("Cannot divide by zero.");

        } catch (Exception ex) {
            logger.severe("General error: " + ex.getMessage());

            // Not from the PDF. AssertionError extends Error, not Exception,
            // so neither catch above can ever see it.
        } catch (AssertionError ex) {
            logger.severe("Assertion failed: " + ex.getMessage());
        }

        logger.info("Application ended");

        System.out.println("Program finished");
    }

    private static void setupFileLogging() {
        try {
            FileHandler fileHandler = new FileHandler("trace-log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(fileHandler);

        } catch (IOException e) {
            System.out.println("Could not configure file logging: " + e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        logger.info("Divide method called with a=" + a + ", b=" + b);
        return a / b;
    }
}