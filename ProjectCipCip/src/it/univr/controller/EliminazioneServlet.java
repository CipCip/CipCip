package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.model.UserDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminazioneServlet
 */

@WebServlet("/EliminazioneServlet")
public class EliminazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserBean user=new UserBean();
		
		user.setEmail(request.getParameter("email"));
		
		boolean res=UserDAO.eliminaUtente(user);
		
		 if(res==true)
				response.sendRedirect("dashboardAmministrazione.jsp");
			else
				response.sendRedirect("OperazioneNegataA.jsp");
			
			
			 
		
	}

}
