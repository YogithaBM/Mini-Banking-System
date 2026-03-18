package com.thinkworks.bankingsystem.dto;

import com.thinkworks.bankingsystem.enums.AccountType;

public class Account {
    private int accountId;
    private String accountHolder;
    private double balance;
    private String address;
    private AccountType accountType;

    public Account(int accountId, String accountHolder, double balance, String address, AccountType accountType) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.address = address;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

}
