package com.fleximart.service;

import com.fleximart.model.Order;
import com.fleximart.model.Seller;
import com.fleximart.model.Transaction;
import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
