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

import com.tap.DAOImpl.UserDAOIMPL;
import com.tap.model.User;

/**
 * Servlet implementation class ViewAllUsers
 */
@WebServlet("/ViewAllUsers")
public class ViewAllUsers extends HttpServlet {
	
	UserDAOIMPL user = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
    public ViewAllUsers() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void init() {
    	 this.user = new UserDAOIMPL();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		
		List<User> allUsers = new ArrayList<>();
		
		
		allUsers = user.getAllUsers();
		
		request.setAttribute("userList", allUsers);
		
		
		request.getRequestDispatcher("/viewAllUsers.jsp").forward(request, response);
		
		
	
	}


}
