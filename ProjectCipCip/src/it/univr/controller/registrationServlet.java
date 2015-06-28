package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.model.UserDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user=UserBean.getInstance();
		user.setNome(request.getParameter("nome"));
		user.setCognome(request.getParameter("cognome"));
		user.setEmail(request.getParameter("email"));
		user.setCellulare(request.getParameter("cellulare"));
		user.setPassword(request.getParameter("pwd"));
		//intanto lo lascio cos�
		//user.setAmministratore(0);
		
		user=UserDAO.registrazione(user);
		//non riesce ad entrare qui
		if(user.isValid()){
			response.sendRedirect("login.jsp");			
		}
		
		
		
	}

}
