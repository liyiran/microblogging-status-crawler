package com.kudtu.util;

import org.apache.log4j.Logger;

public class Log {
    public static void error(Class clazz, String message) {
	Logger.getLogger(clazz.getClass().getName()).error(clazz.getSimpleName() + ": " + message);
    }

    public static void debug(Class clazz, String message) {
	Logger.getLogger(clazz.getClass().getName()).debug(clazz.getSimpleName() + ": " + message);
    }

    public static void info(Class clazz, String message) {
	Logger.getLogger(clazz.getClass().getName()).info(clazz.getSimpleName() + ": " + message);
    }
}
