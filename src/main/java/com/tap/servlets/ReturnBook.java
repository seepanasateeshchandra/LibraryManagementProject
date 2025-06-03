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
 * Servlet implementation class ReturnBook
 */
@WebServlet("/ReturnBook")
public class ReturnBook extends HttpServlet {
	
	BookImpl book = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	public void init() {
		
	book = new BookImpl();
		
	}
    public ReturnBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("bookId"));
		String name = request.getParameter("bookName");
		
		book.deleteBookByIdAndName(id,name);
		
	}

}
