package org.example.learning.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
* Created by User on 20.05.2025
*/
@SuppressWarnings("unused")
public class LoggerUtils {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void info(String message) {
        log("INFO", message);
    }

    public static void warn(String message) {
        log("WARN", message);
    }

    public static void error(String message) {
        log("ERROR", message);
    }

    private static void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("[" + timestamp + "] [" + level + "] " + message);
    }
}
