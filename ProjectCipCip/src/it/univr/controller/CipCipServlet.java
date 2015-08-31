package it.univr.controller;

import it.univr.bean.CipCipBean;
import it.univr.bean.PosizioniBean;
import it.univr.model.CipCipDAO;
import it.univr.model.PositionDAO;



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
			
			session.setAttribute("speed",cip.getVelocita());
			//cip = null;
			
			PosizioniBean positions = new PosizioniBean();
			positions = PositionDAO.positions(positions);
			
			session.setAttribute("posiniziale",positions.getPosIniziale());
			session.setAttribute("posfinale",positions.getPosFinale());
			positions = null;
			
			response.sendRedirect("dashboard.jsp");
			
		} 
		catch (Throwable theException) 	    
		{
			System.out.println(theException); 
		}
	}
	
	

}
