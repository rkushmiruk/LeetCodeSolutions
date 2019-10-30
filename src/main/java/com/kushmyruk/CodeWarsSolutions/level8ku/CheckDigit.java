package com.kushmyruk.CodeWarsSolutions.level8ku;

/**
 * Check if string is digit from 0 to 9;
 */
public class CheckDigit {

    public static boolean isDigit(String s) {
        try {
            int i = Integer.parseInt(s);
            return i <= 9;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//    public static boolean isDigit(String s) {
//        return s.matches("[0-9]");
//    }

//    public static boolean isDigit(String s) {
//        return s.matches("\\d");
//    }
}
