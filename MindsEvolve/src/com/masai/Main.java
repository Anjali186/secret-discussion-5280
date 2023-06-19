package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.servises.Administrator;
import com.masai.servises.User;

public class Main {
    private static Administrator administrator;
    private static List<User> userAccounts;

    public static void main(String[] args) {
        // Initialize user accounts
        userAccounts = new ArrayList<>();

        // Create administrator object
        administrator = new Administrator(userAccounts);

        // Start the application
        startApplication();
    }

    public static void startApplication() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to StockGuru - Navigating the Financial Markets");
            System.out.println("Please select an option:");
            System.out.println("1. Administrator Login");
            System.out.println("2. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    administratorLogin(scanner);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using StockGuru. Goodbye!");
    }

    public static void administratorLogin(Scanner scanner) {
        System.out.println("Administrator Login");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        administrator.login(username, password);

        if (administrator.isLoggedIn()) {
            System.out.println("Login successful!");
            // Provide options for administrator operations
            // Add more functionality based on your requirements
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }
}

