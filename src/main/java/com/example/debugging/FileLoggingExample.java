package com.example.debugging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLoggingExample {
    private static final Logger logger = Logger.getLogger(FileLoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("app-log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(fileHandler);

            logger.info("Application started");

            try {
                int result = divide(10, 0);
                logger.info("Result: " + result);
            } catch (ArithmeticException ex) {
                logger.severe("Error: " + ex.getMessage());
            }

            logger.info("Application ended");

            System.out.println("Check app-log.txt");

        } catch (IOException e) {
            System.out.println("Could not create log file: " + e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        logger.info("Dividing " + a + " by " + b);
        return a / b;
    }
}
