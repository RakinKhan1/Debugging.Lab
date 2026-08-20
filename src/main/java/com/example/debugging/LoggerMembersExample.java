package com.example.debugging;

import java.util.logging.Logger;

public class LoggerMembersExample {
    private static final Logger logger = Logger.getLogger(LoggerMembersExample.class.getName());

    public static void main(String[] args) {
        int age = 15;

        logger.info("Application started");
        logger.warning("This is a warning");

        if (age < 18) {
            logger.info("User is under 18");
        }
        // Not from the PDF. Testing the levels in section 5's table.
        logger.severe("severe: serious failure");
        logger.config("config: configuration message");
        logger.fine("fine: debug-level detail");
        logger.finest("finest: trace-level output");
        System.out.println("Program completed");
    }
}
