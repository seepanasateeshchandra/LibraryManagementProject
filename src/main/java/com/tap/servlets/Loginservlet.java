package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionFactory.ConnectionFactoryJdbc;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.setAttribute("user", userName);
		
		try {
			Connection con = ConnectionFactoryJdbc.requestConnection();
			if(userName!=null && password!=null) {
				
				String query = "select * from users where userName=? and password=?";
				
				PreparedStatement pstmt1 = con.prepareStatement(query);
				
				pstmt1.setString(1, userName);
				pstmt1.setString(2, password);
				
				ResultSet res = pstmt1.executeQuery();
				
				//int id = res.getInt(1);
				
				//request.setAttribute("id", id);
				
				
		
				
				if(res.next()) {
					
					String role = res.getString(4);
					int idNumber = res.getInt(1);
					
					System.out.println(idNumber);
					
					request.setAttribute("id", idNumber);
					if(role.equalsIgnoreCase("admin")) {
						request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("/userDashboard.jsp").forward(request, response);
					}
					
				}else {
					request.getRequestDispatcher("/register.jsp").forward(request, response);
				}
				
				
				
			}else {
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
