package com.tap.DAO.Imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.interfaces.BookDAO;
import com.tap.model.Book;

import ConnectionFactory.ConnectionFactoryJdbc;

public class BookImpl implements BookDAO {
	
	Connection con;
	

		
		@Override
		public int saveBook(Book book) {
			// TODO Auto-generated method stub
			
			int isValid = 0;
			
			try {
				con = ConnectionFactoryJdbc.requestConnection();
				
				PreparedStatement pstmt1 = con.prepareStatement("insert into books values(?,?,?,?,?)");
				
				pstmt1.setInt(1, book.getId());
				pstmt1.setString(2, book.getTitle());
				pstmt1.setString(3, book.getAuthor());
				pstmt1.setString(4, book.getCategory());
				pstmt1.setString(5, book.isAvailable());
				
			isValid = pstmt1.executeUpdate();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
			
			
			return isValid;
		}

		@Override
		public List<Book> getAllBooks() {
			// TODO Auto-generated method stub
			List<Book> allBooks = new ArrayList<>();
			try {
				con = ConnectionFactoryJdbc.requestConnection();
				PreparedStatement pstmt1 = con.prepareStatement("select * from books");
				ResultSet res  = pstmt1.executeQuery();
				
				while(res.next()) {
					
					int id = res.getInt(1);
					String title = res.getString(2);
					String name = res.getString(3);
					String author = res.getString(4);
					String is_valid = res.getString(5);
					
					allBooks.add(new Book(id,title,name,author,is_valid));
					
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return allBooks;
		}

		@Override
		public Book getBookById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteBook(int id) {
			// TODO Auto-generated method stub
			
			try {
				con  = ConnectionFactoryJdbc.requestConnection();
				PreparedStatement pstmt1 = con.prepareStatement("delete from books where id = ?");
				pstmt1.setInt(1, id);
				pstmt1.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		@Override
		public List<Book> getAvaliableBooks() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Book getBookByIdAndName(int id, String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int updateBook(Book book) {
			// TODO Auto-generated method stub
			
			int value = 0;
		
			try {
				con = ConnectionFactoryJdbc.requestConnection();
				PreparedStatement pstmt1 = con.prepareStatement("update books set id = ?,title = ?,author = ?, category = ?,is_available = ? where id = ?" );
				pstmt1.setInt(1, book.getId());
				pstmt1.setString(2, book.getTitle());
				pstmt1.setString(3,book.getAuthor());
				pstmt1.setString(4, book.getCategory());
				pstmt1.setString(5, book.isAvailable());
				pstmt1.setInt(6, book.getId());
				
				  value = pstmt1.executeUpdate();
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return value;
		}

		public void deleteBookByIdAndName(int id, String name) {
		
			try {
				
			 con = 	ConnectionFactoryJdbc.requestConnection(); 
			 
			 PreparedStatement pstmt1 = con.prepareStatement("delete from Books where id=? and title = ?");
			 
			 pstmt1.setInt(1, id);
			 pstmt1.setString(2, name);
			 
		    pstmt1.execute();
			 
			 
			 
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	   
		
	}
	   
	
	   
   
	   


   
