package com.thinkworks.bankingsystem.dto;

import com.thinkworks.bankingsystem.enums.TransactionType;

public class Transaction {
    private int transactionId;
    private Account sourceAccount;
    private Account destinationAccount;
    private TransactionType transactionType;
    private double transactionAmount;

    public Transaction(int transactionId, Account sourceAccount, TransactionType transactionType, double amount,Account destinationAccount) {
        this.transactionId = transactionId;
        this.sourceAccount = sourceAccount;
        this.transactionType = transactionType;
        this.transactionAmount = amount;
        this.destinationAccount=destinationAccount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public double addMoney() {
        double initialBalance= destinationAccount.getBalance();
        initialBalance+= transactionAmount;
        return initialBalance;

    }

    public double deductMoney(){
        double initialBalance= sourceAccount.getBalance();
        initialBalance-= transactionAmount;
        return initialBalance;

    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

}
