package org.abhinay.stockpulse.model;

public class Stock {
    private final int id;
    private final String name;
    private final double price;
    private final String symbol;

    public Stock(int id, String name, double price, String symbol) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.symbol = symbol;
    }

    //Spring converts the getter into JSON
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }
}
