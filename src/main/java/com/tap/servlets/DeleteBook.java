package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.Imple.BookImpl;

/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	
	BookImpl book = null;
	private static final long serialVersionUID = 1L;
	
	
	public void init() {
		
		
		this.book = new BookImpl();
		
		
		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		book.deleteBook(id);
		
		
		request.getRequestDispatcher("ViewAllBooks").forward(request, response);
		
		
		
		
		
	}

}
