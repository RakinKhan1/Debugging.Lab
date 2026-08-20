package com.example.debugging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLoggingExample {
    private static final Logger logger = Logger.getLogger(ConsoleLoggingExample.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        logger.addHandler(consoleHandler);
        // Not from the PDF. Stops the root logger printing everything a second time.
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);

        logger.info("Application started");
        logger.info("Performing operation...");

        int result = add(10, 30);

        logger.info("Result: " + result);

        // Not from the PDF. Proves why fine printed nothing back in section 5.
        logger.fine("fine detail, now visible");

        System.out.println("Done");
    }

    private static int add(int a, int b) {
        logger.info("Adding " + a + " and " + b);
        return a + b;
    }
}