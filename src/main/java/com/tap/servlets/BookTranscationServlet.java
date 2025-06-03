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

import ConnectionFactory.ConnectionFactoryJdbc;

/**
 * Servlet implementation class BookTranscationServlet
 */
@WebServlet("/BookTranscationServlet")
public class BookTranscationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		int transaction_id = Integer.parseInt(request.getParameter("id"));
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		Date borrowDate = Date.valueOf(request.getParameter("borrow_date"));
		Date returnDate = Date.valueOf(request.getParameter("return_date"));
		
		try {
			Connection con = ConnectionFactoryJdbc.requestConnection();
			
			PreparedStatement pstmt1 = con.prepareStatement("insert into transactions values(?,?,?,?,?)");
			pstmt1.setInt(1,transaction_id);
			pstmt1.setInt(2, user_id);
			pstmt1.setInt(3, book_id);
			pstmt1.setDate(4, borrowDate);
			pstmt1.setDate(5, returnDate);
			
			pstmt1.execute();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
