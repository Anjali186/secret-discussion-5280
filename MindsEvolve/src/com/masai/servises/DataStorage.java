package com.masai.servises;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private List<Broker> brokers;
    private List<Trader> traders;
    private List<Stock> stocks;
    private List<Transaction> transactions;

    public DataStorage() {
        this.brokers = new ArrayList<>();
        this.traders = new ArrayList<>();
        this.stocks = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Methods for managing brokers
    public void addBroker(Broker broker) {
        brokers.add(broker);
    }

    public List<Broker> getBrokers() {
        return brokers;
    }

    // Methods for managing traders
    public void addTrader(Trader trader) {
        traders.add(trader);
    }

    public List<Trader> getTraders() {
        return traders;
    }

    // Methods for managing stocks
    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    // Methods for managing transactions
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

