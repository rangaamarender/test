package com.lucid.util;

public class Strings {
    public static boolean isNullOrEmpty(String value) {
        if (value == null || value.replaceAll(" ", "").isEmpty())
            return true;
        else
            return false;
    }

}
