package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.model.UserDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class indexServlet
 */
@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		UserBean user=UserBean.getInstance();
		
		user=UserDAO.indexHome(user);
		
		/*HttpSession session=request.getSession(true);
		session.setAttribute("nome", user.getFirstName());
		session.setAttribute("cognome", user.getLastName());
		response.sendRedirect("index.jsp");*/
	
		 
		 
		 
		
		
	}

	

}
