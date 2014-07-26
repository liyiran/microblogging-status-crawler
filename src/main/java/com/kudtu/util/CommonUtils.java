package com.kudtu.util;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class CommonUtils {

    private final static String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final static String FILE_DATETIME_FORMAT = "yyyyMMddHHmmss";
    public final static String FILE_NAME_DOT = ".";
    public final static String FILE_NAME_DELIMITER = "_";

    public static String formatFileDateTime(final Date date) {
	SimpleDateFormat sdf = new SimpleDateFormat(FILE_DATETIME_FORMAT);
	return sdf.format(date);
    }

    public static String getCurrentFileDateTime() {
	return formatFileDateTime(new Date());
    }

    public static String getCurrentDateTime() {
	return formatDateTime(new Date());
    }

    public static String formatDateTime(final Date date) {
	SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
	return sdf.format(date);
    }

    public static Boolean getBooleanValueWithDefault(String str, Boolean defult) {
	return null == getBooleanValue(str) ? defult : getBooleanValue(str);
    }

    public static Boolean getBooleanValue(String str) {
	if ("TRUE".equalsIgnoreCase(str) || "T".equalsIgnoreCase(str) || "Y".equalsIgnoreCase(str)
		|| "YES".equalsIgnoreCase(str)) {
	    return Boolean.TRUE;
	}
	if ("FALSE".equalsIgnoreCase(str) || "F".equalsIgnoreCase(str) || "N".equalsIgnoreCase(str)
		|| "NO".equalsIgnoreCase(str)) {
	    return Boolean.FALSE;
	}
	return null;
    }

    public static boolean isBlank(String str) {
	return null == str || "".equals(str);
    }

    public static boolean isBlank(Collection set) {
	return null == set || set.size() == 0;
    }

    public static boolean isBlank(Object[] obj) {
	return null == obj;
    }

}
