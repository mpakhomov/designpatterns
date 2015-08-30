package com.mpakhomov.builder;

import java.sql.*;

/**
 * @author mpakhomov
 * @since 8/30/15
 */
public class App {
    public static void main(String[] args) {
        StatisticsLogger logger = StatisticsLogger.builder()
                .withWriteToConsole(false)
                .withWriteToDb(true)
                .withRunDate(new Date(System.currentTimeMillis()))
                .withVerbose(false)
                .build();

        logger.log("test message");

    }
}
