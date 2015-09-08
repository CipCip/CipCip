package it.univr.controller;

import it.univr.model.DAOFactory;
import it.univr.model.VeicoloDAOInterface;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RimuoviVeicoloServlet
 */
@WebServlet("/RimuoviVeicoloServlet")
public class RimuoviVeicoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//VeicoloBean car=new VeicoloBean();
		
		HttpSession session=request.getSession(true);
		String targaUtente=(String)session.getAttribute("targa");
		
		DAOFactory factory = DAOFactory.getDAOFactory();
        VeicoloDAOInterface VeicoloDAO = factory.getVeicoloDAO();
		boolean rimosso=VeicoloDAO.rimuoviVeicolo(targaUtente);
		
		if(rimosso){
			response.sendRedirect("veicolo.jsp");
			//si potrebbe fare così:
			//una volta rimosso il veicolo l'utente verrà reindirizzato alla pagina di registrazione dove potrà 
			//potrà inserire un nuovo veicolo
			
			//response.sendRedirect("registrazione.jsp");
		}
		else
			response.sendRedirect("OperazioneNegata.jsp");
		
		
	}

}
