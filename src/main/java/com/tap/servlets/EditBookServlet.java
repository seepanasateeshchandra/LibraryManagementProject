package com.tap.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.Imple.BookImpl;
import com.tap.model.Book;

/**
 * Servlet implementation class EditBook
 */
@WebServlet("/EditBookServlet")
public class EditBookServlet extends HttpServlet {
	
	 BookImpl book = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void init() {
    	this.book = new BookImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String category = request.getParameter("category");
		String isAvaliable = request.getParameter("is_available");
		Date borrow_date = Date.valueOf((request.getParameter("borrow_date")));
		Date return_date = Date.valueOf((request.getParameter("return_date")));
		int book_cost = Integer.parseInt(request.getParameter("book_cost"));
		int TotalFine = Integer.parseInt(request.getParameter("total_fine"));
		
		
		Book books = new Book(id,title,author,category,isAvaliable);
		
		
		book.updateBook(books);
		
		request.getRequestDispatcher("userDashboard.jsp").forward(request, response);
		
		
	}

}
