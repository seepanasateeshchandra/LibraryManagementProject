package com.tap.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.Imple.BookImpl;

/**
 * Servlet implementation class DeleteBookByIdAndName
 */
@WebServlet("/DeleteBookByIdAndName")
public class DeleteBookByIdAndName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BookImpl book = null;
	
	
	public void init() {
		this.book = new BookImpl();
		
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookByIdAndName() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
