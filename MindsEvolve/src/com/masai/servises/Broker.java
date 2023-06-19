package com.masai.servises;

public class Broker extends User {
    private List<Trader> associatedTraders;

    public Broker(String username, String password) {
        super(username, password);
        this.associatedTraders = new ArrayList<>();
    }

    // Method to add a trader to the list of associated traders
    public void addTrader(Trader trader) {
        associatedTraders.add(trader);
    }

    // Method to view transaction history for associated traders
    public void viewTransactionHistory() {
        for (Trader trader : associatedTraders) {
            trader.viewTransactionHistory();
        }
    }
}

