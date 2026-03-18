package com.thinkworks.bankingsystem.mainrunner;

import com.thinkworks.bankingsystem.dto.Account;
import com.thinkworks.bankingsystem.dto.Transaction;
import com.thinkworks.bankingsystem.enums.AccountType;
import com.thinkworks.bankingsystem.enums.TransactionType;
import com.thinkworks.bankingsystem.service.TransactionService;

public class MainRunner {
    public static void main(String[] args) {

        Account Hithaishi= new Account(23, "Nicky", 34545.87D,
                "Nandini Layout", AccountType.SAVING_ACCOUNT);
        Account Yusra = new Account(243, "Manny", 4356.43D,
                "MahaLakshmi Layout", AccountType.SAVING_ACCOUNT);

        Transaction transaction = new Transaction(43245345,Hithaishi , TransactionType.DEBIT, 745D,Yusra);

        TransactionService transactionService = new TransactionService();
        System.out.println("source account ");
        System.out.println("   ");
        transactionService.accountDetails(transaction.getSourceAccount());
        System.out.println("destination account ");
        System.out.println("  ");
        transactionService.accountDetails(transaction.getDestinationAccount());
        System.out.println("   ");
        System.out.println("Transaction Details");
        transactionService.transactionDetails(transaction);
        System.out.println("   ");
        transactionService.makeTransaction(transaction);


    }
}
