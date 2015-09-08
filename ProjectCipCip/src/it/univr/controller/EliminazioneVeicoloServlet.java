package it.univr.controller;


import it.univr.bean.VeicoloBean;
import it.univr.model.DAOFactory;
import it.univr.model.VeicoloDAOInterface;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminazioneVeicoloServlet
 */
@WebServlet("/EliminazioneVeicoloServlet")
public class EliminazioneVeicoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VeicoloBean car=new VeicoloBean();
		
		car.setTarga(request.getParameter("targa"));
		
		DAOFactory factory = DAOFactory.getDAOFactory();
        VeicoloDAOInterface VeicoloDAO = factory.getVeicoloDAO();		
		boolean res=VeicoloDAO.eliminaVeicolo(car);
		
		 if(res==true)
				response.sendRedirect("dashboardAmministrazione.jsp");
			else
				response.sendRedirect("OperazioneNegataA.jsp");
	}

}
