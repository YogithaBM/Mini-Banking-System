package com.thinkworks.bankingsystem.service;

import com.thinkworks.bankingsystem.dto.Account;
import com.thinkworks.bankingsystem.dto.Transaction;
import com.thinkworks.bankingsystem.enums.TransactionType;

public class TransactionService {

   public void accountDetails(Account account) {
      System.out.println("ID : "+account.getAccountId());
      System.out.println("Name : "+account.getAccountHolder());
      System.out.println("Balance: "+account.getBalance());
      System.out.println("Account type "+account.getAccountType());
      System.out.println("Address : "+account.getAddress());

   }

   public void transactionDetails(Transaction transaction){
      System.out.println("ID : "+transaction.getTransactionId());
      System.out.println("Type : "+transaction.getTransactionType());
      System.out.println("Amount : "+transaction.getTransactionAmount());

   }

   public void makeTransaction(Transaction transaction){
      if (transaction.getTransactionAmount()<=transaction.getSourceAccount().getBalance()){
         if (transaction.getTransactionType()== TransactionType.CREDIT){
            System.out.println("Final Balance: "+transaction.addMoney());
         }
         else{
            System.out.println("Final Balance : "+transaction.deductMoney());
         }
      }
   }
}
