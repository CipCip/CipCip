package it.univr.controller;

import it.univr.bean.CipCipBean;
import it.univr.model.CipCipDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CipCipServlet
 */
@WebServlet("/CipCipServlet")
public class CipCipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{	    
			HttpSession session = request.getSession(true);
			CipCipBean cip = new CipCipBean();
			cip.setTargaCipCip((String) session.getAttribute("targa"));
	       
			cip = CipCipDAO.invio(cip);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/dashboard.jsp");
			session.setAttribute("velocita",cip.getVelocita());
			//session.setAttribute("video",tmid.getUrlvideo());
			rd.include(request, response);
			cip = null;
			
		} 
		catch (Throwable theException) 	    
		{
			System.out.println(theException); 
		}
	}
	
	

}
