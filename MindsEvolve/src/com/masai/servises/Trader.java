package com.masai.servises;

import java.util.List;

public class Trader extends User {
	private String name;
    private String address;
    private String contactNumber;
    private String username;
    private String password;
    private Broker associatedBroker;

    // Constructor
    public Trader(String name, String address, String contactNumber, String username, String password) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.username = username;
        this.password = password;
    }

    // Getter and Setter methods

    public void setAssociatedBroker(Broker broker) {
        this.associatedBroker = broker;
    }

    // Other methods

    public void viewMarketTrends() {
        // Code to fetch and display the latest market trends
    }

    public void buyStock(String stockSymbol, int quantity) {
        // Code to buy stocks using the associated broker
        if (associatedBroker != null) {
            associatedBroker.executeBuyOrder(this, stockSymbol, quantity);
        } else {
            System.out.println("Error: You are not associated with any broker.");
        }
    }

    public void sellStock(String stockSymbol, int quantity) {
        // Code to sell stocks using the associated broker
        if (associatedBroker != null) {
            associatedBroker.executeSellOrder(this, stockSymbol, quantity);
        } else {
            System.out.println("Error: You are not associated with any broker.");
        }
    }

    public void viewTransactionHistory() {
        // Code to fetch and display the transaction history of the trader
        List<Transaction> transactionHistory = DataStorage.getTransactionHistory(this);
        if (transactionHistory.isEmpty()) {
            System.out.println("No transaction history available.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    public void viewPortfolio() {
        // Code to fetch and display the portfolio of the trader
        Map<String, Integer> portfolio = DataStorage.getPortfolio(this);
        if (portfolio.isEmpty()) {
            System.out.println("Your portfolio is empty.");
        } else {
            System.out.println("Portfolio:");
            for (Map.Entry<String, Integer> entry : portfolio.entrySet()) {
                String stockSymbol = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(stockSymbol + ": " + quantity);
            }
        }
    }

    public void deleteAccount() {
        // Code to delete the trader's account
        DataStorage.deleteTraderAccount(this);
        System.out.println("Account deleted successfully.");
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

