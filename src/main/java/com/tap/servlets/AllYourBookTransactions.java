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

import com.tap.DAOImpl.TransactionImpl;
import com.tap.model.Transaction;

/**
 * Servlet implementation class AllYourBookTransactions
 */
@WebServlet("/AllYourBookTransactions")
public class AllYourBookTransactions extends HttpServlet {
	
	TransactionImpl transaction = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllYourBookTransactions() {
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
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		List<Transaction> allTransaction = new ArrayList<>();
		
		allTransaction = transaction.getAllTransactions();
		
		request.setAttribute("allTransaction", allTransaction);
		
		
		
		request.getRequestDispatcher("/viewAllUserTransactions.jsp").forward(request, response);
		
		
		
	}

	
}
