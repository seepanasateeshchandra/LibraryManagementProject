package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.Imple.BookImpl;
import com.tap.model.Book;

import ConnectionFactory.ConnectionFactoryJdbc;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BookImpl bookImp = null;
	
	
	public void init() {
		
		bookImp = new BookImpl();
		
		
	}
		
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		
		System.out.println(request.getSession().getAttribute("username"));
		System.out.println(request.getSession().getAttribute("id"));
		
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String category = request.getParameter("category");
		String isAvaliable = request.getParameter("is_available");
		Date borrow_date = Date.valueOf((request.getParameter("borrow_date")));
		Date return_date = Date.valueOf((request.getParameter("return_date")));
		int book_cost = Integer.parseInt(request.getParameter("book_cost"));
		int TotalFine = Integer.parseInt(request.getParameter("total_fine"));
		
		
		
		Book book = new Book(id,title,author,category,isAvaliable);
		
		request.setAttribute("book", book);
		
		
			
			int isValid = bookImp.saveBook(book);
			if(isValid==1) {
				
				request.getRequestDispatcher("/viewbooks.jsp").forward(request, response);
				
				
				
			}else {
				request.getRequestDispatcher("/addBook.jsp").forward(request, response);
			}
		} 
	}


