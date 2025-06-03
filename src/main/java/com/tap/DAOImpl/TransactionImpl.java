package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.interfaces.TransactionDAO;
import com.tap.model.Transaction;

import ConnectionFactory.ConnectionFactoryJdbc;

public class TransactionImpl implements TransactionDAO{
	
	
	private Connection getConnection() {
		Connection con = null;
		try {
			con = ConnectionFactoryJdbc.requestConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		return con;
		
		
		
	}

	@Override
	public int saveTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pstmt1 = getConnection().prepareStatement("insert into transactions values(?,?,?,?,?,?,?,?,?)");
			pstmt1.setInt(1, transaction.getId());
			pstmt1.setInt(2, transaction.getUser_id());
			pstmt1.setInt(3, transaction.getBook_id());
			pstmt1.setDate(4, transaction.getBorrow_date());
			pstmt1.setDate(5, transaction.getReturn_date());
			pstmt1.setString(6, transaction.getUser_name());
			pstmt1.setString(7, transaction.getBook_name());
			
			pstmt1.setInt(8, transaction.getCost());
			
			pstmt1.setInt(9, transaction.getFine());
			
			return pstmt1.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return -1;
	}

	@Override
	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		
	 List<Transaction> allTransaction = null;
	 
	 try {
		 
		 PreparedStatement pstmt1 = getConnection().prepareStatement("select * from transactions");
		
		 ResultSet res = pstmt1.executeQuery();
		 
		 allTransaction = new ArrayList<>();
		 
		 while(res.next()) {
			 int id = res.getInt(1);
			 int user_id = res.getInt(2);
			 int book_id = res.getInt(3);
			 Date borrow_date = res.getDate(4);
			 Date return_date = res.getDate(5);
			 String userName = res.getString(6);
			 String bookName = res.getString(7);
			 int cost = res.getInt(8);
			 int totalFine = res.getInt(9);
			 
			 allTransaction.add(new Transaction(id, user_id, book_id, borrow_date, return_date,userName,bookName,cost,totalFine));
			 
		 }
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
		
		
		return allTransaction;
	}

	@Override
	public Transaction getTransactionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTransaction(int id) {
		// TODO Auto-generated method stub
		try {
		PreparedStatement pstmt1 = getConnection().prepareStatement("delete from transaction where id = ?");
		pstmt1.setInt(1, id);
		pstmt1.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Transaction> getTransactionByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getTransactionByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTransaction(Transaction transaction) {
		
		try {
			
		PreparedStatement pstmt1 = getConnection().prepareStatement("update transaction set id = ?,user_id = ?,book_id = ?,borrow_date = ?,return_date = ?,user_name = ?,book_name = ?,cost = ?,total_fine=? where id = ?" );
		pstmt1.setInt(1, transaction.getId());
		pstmt1.setInt(2, transaction.getUser_id());
		pstmt1.setInt(3, transaction.getBook_id());
		pstmt1.setDate(4,transaction.getBorrow_date());
		pstmt1.setDate(5, transaction.getReturn_date());
		pstmt1.setString(6, transaction.getUser_name());
		pstmt1.setString(7, transaction.getBook_name());
		pstmt1.setInt(8, transaction.getCost());
		pstmt1.setInt(9, transaction.getFine());
		pstmt1.setInt(10, transaction.getId());
		
		pstmt1.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
