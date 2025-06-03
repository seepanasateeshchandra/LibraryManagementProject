package com.tap.servlets;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionFactory.ConnectionFactoryJdbc;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		String role = request.getParameter("role");
		
		try {
			Connection con = ConnectionFactoryJdbc.requestConnection();
			String query = "insert into users values(?,?,?,?)";
			PreparedStatement pstmt1 = con.prepareStatement(query);
			pstmt1.setInt(1, id);
			pstmt1.setString(2, userName);
			pstmt1.setString(3, password);
			pstmt1.setString(4, role);
			
		   boolean isValid =  pstmt1.execute();
		   
		   if(isValid) {
			   request.getRequestDispatcher("/register.jsp").forward(request, response);
		   }else {
			   
			   request.getRequestDispatcher("/login.jsp").forward(request, response);
			   
		   }
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
