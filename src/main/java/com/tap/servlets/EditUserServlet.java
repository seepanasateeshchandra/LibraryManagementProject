package com.tap.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAOImpl.UserDAOIMPL;
import com.tap.model.User;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserDAOIMPL user = null;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void  init() {
    	this.user = new  UserDAOIMPL();
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
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		String role = request.getParameter("role");
		
		
		User user1 = new User(id,userName,password,role);
		
		user.updateUser(user1);
		
		
		request.getRequestDispatcher("userDashboard.jsp").forward(request, response);
		
		
		
		
	}

}
