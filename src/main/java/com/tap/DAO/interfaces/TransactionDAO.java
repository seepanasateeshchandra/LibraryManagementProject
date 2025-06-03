package com.tap.DAO.interfaces;

import java.util.List;

import com.tap.model.Transaction;

public interface TransactionDAO {
	
	int saveTransaction(Transaction transcation);
	
	List<Transaction> getAllTransactions();
	
	Transaction getTransactionById(int id);
	
	void deleteTransaction(int id);
	
	List<Transaction>  getTransactionByUserId(int userId);
	
	List<Transaction> getTransactionByBookId(int bookId);
	
	void updateTransaction(Transaction transaction);
	
	
	
	
	
	
	

}
