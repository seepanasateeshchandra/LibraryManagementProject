package com.tap.DAO.interfaces;

import java.util.List;

import com.tap.model.Book;

public interface BookDAO {
	
	int saveBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(int id);
	void deleteBook(int id);
	List<Book> getAvaliableBooks();
	
	int updateBook(Book book);
	Book getBookByIdAndName(int id,String name);
	
	
	
	
	

}
