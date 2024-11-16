package com.aababou.cloudbank;


public class Transaction {
    private String title;
    private String date;
    private String amount;
    private int iconResId;

    public Transaction(String title, String date, String amount, int iconResId) {
        this.title = title;
        this.date = date;
        this.amount = amount;
        this.iconResId = iconResId;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public int getIconResId() {
        return iconResId;
    }
}
