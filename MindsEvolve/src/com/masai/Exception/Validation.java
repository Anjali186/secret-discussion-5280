package com.masai.Exception;

import java.util.regex.Pattern;

public class Validation {
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{5,20}$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");

    public static boolean isValidUsername(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    public static boolean isValidPassword(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }

    public static boolean isPositiveNumber(double number) {
        return number > 0;
    }
    
    // Add more validation methods as per your requirements
    
    public static void throwError(String errorMessage) {
        System.err.println("Error: " + errorMessage);
    }
    try {
        // Database operations
    } catch (SQLException e) {
        System.out.println("Error: SQL exception occurred.");
    } catch (DataAccessException e) {
        System.out.println("Error: Database access exception occurred.");
    }

}

