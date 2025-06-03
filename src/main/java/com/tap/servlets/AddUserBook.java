package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAOImpl.TransactionImpl;
import com.tap.model.Transaction;

/**
 * Servlet implementation class AddUserBook
 */
@WebServlet("/AddUserBook")
public class AddUserBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TransactionImpl transaction = null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserBook() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	this.transaction = new TransactionImpl();
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
		
		
		  PrintWriter writer= response.getWriter();
		  
		  int id = Integer.parseInt(request.getParameter("id"));
		  
		  int user_id = Integer.parseInt(request.getParameter("user_id"));
		  
		  int book_id = Integer.parseInt(request.getParameter("book_id"));
		  
		  Date borrow_date = Date.valueOf(request.getParameter("borrow_date"));
		  
		  Date return_date = Date.valueOf(request.getParameter("return_date"));
		  
		  
		  String user_name = request.getParameter("user_name");
		  
		  String book_name = request.getParameter("book_name");
		  
		  int total_cost = Integer.parseInt(request.getParameter("book_cost"));
		  
		  int total_Fine = Integer.parseInt(request.getParameter("total_fine"));
		  
		  
		  Transaction transactions = new Transaction(id,user_id,book_id,borrow_date,return_date,user_name,book_name,total_cost,total_Fine);
		  
		  
		  transaction.saveTransaction(transactions);
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
	}

}
