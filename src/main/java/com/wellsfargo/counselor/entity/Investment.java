package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long investmentId;

    @Column(nullable = false)
    private String investmentName;

    @Column(nullable = false)
    private String tickerSymbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Double currentPrice;

    protected Investment() {
    }

    public Investment(String investmentName, String tickerSymbol, String type, Double currentPrice) {
        this.investmentName = investmentName;
        this.tickerSymbol = tickerSymbol;
        this.type = type;
        this.currentPrice = currentPrice;
    }

    public Long getInvestmentId() {
        return investmentId;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
