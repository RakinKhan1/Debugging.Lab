package com.example.debugging;

import java.util.logging.Logger;

public class LoggingConfigExample {
    private static final Logger logger = Logger.getLogger(LoggingConfigExample.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");
        logger.info("Trace message written using configuration file");
        logger.info("Application ended");
    }
}