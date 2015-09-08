package it.univr.controller;

import it.univr.bean.CipCipBean;
import it.univr.bean.PosizioniBean;
import it.univr.model.CipCipDAOInterface;
import it.univr.model.DAOFactory;
import it.univr.model.PositionDAOInterface;

import java.io.IOException;

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
			
			DAOFactory factory = DAOFactory.getDAOFactory();
	        CipCipDAOInterface CipCipDAO = factory.getCipCipDAO();
			cip = CipCipDAO.invio(cip);
			
			session.setAttribute("speed",cip.getVelocita());
			//cip = null;
			
			PosizioniBean positions = new PosizioniBean();
			factory = DAOFactory.getDAOFactory();
	        PositionDAOInterface PositionDAO = factory.getPositionDAO();
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
