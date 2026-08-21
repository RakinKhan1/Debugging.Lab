package com.example.debugging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.trace("Entering method calculateTotal()");
        logger.debug("Database connection string loaded");
        logger.info("User logged in");
        logger.warn("Password will expire soon");
        logger.error("Could not save record");
        logger.fatal("Application cannot start");

        logger.debug("Debug message");
        logger.info("Application started");
        logger.warn("This is a warning");

        try {
            int result = divide(10, 0);
            logger.info("Result: " + result);
        } catch (ArithmeticException ex) {
            logger.error("An error occurred while dividing numbers", ex);
        }

        logger.info("Application ended");

        System.out.println("Check application.log");
    }

    private static int divide(int a, int b) {
        logger.debug("Dividing {} by {}", a, b);
        return a / b;
    }
}