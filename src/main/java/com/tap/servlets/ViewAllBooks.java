package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.Imple.BookImpl;
import com.tap.model.Book;

/**
 * Servlet implementation class ViewAllBooks
 */
@WebServlet("/ViewAllBooks")
public class ViewAllBooks extends HttpServlet {
	
	BookImpl book = null;
	
	
	
    public ViewAllBooks() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void init() {
    	
    	 book = new BookImpl();
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		List<Book> allBooks = new ArrayList<>();
		
		System.out.println(book);
		
		allBooks = book.getAllBooks();
		
		
		System.out.println(allBooks);
		
		
		request.setAttribute("bookList", allBooks);
		
		
		request.getRequestDispatcher("/viewAllBooks.jsp").forward(request, response);
		
		

		
		
	}

	

}
