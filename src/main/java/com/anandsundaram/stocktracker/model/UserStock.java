package com.anandsundaram.stocktracker.model;

import org.springframework.data.annotation.Id;


public class UserStock {

    @Id
    private String id;

    String symbol;
    double target_price;

    double current_price;

    public UserStock(String symbol, double target_price, double current_price) {
        this.symbol = symbol;
        this.target_price = target_price;
        this.current_price = current_price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTarget_price() {
        return target_price;
    }

    public void setTarget_price(double target_price) {
        this.target_price = target_price;
    }

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }
}
