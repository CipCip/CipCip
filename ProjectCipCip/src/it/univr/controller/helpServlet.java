package it.univr.controller;

import it.univr.bean.HelpBean;
import it.univr.model.HelpDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class helpServlet
 */
@WebServlet("/helpServlet")
public class helpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HelpBean help=new HelpBean();
			

		help.setNome(request.getParameter("nome"));
		help.setEmail(request.getParameter("email"));
		help.setMessaggio(request.getParameter("messaggio"));
			
		
		help=HelpDAO.inserisciaiuto(help);
		
		if(help.isValid()==true){
			response.sendRedirect("help.jsp");
		}
		else
			response.sendRedirect("OperazioneNegata.jsp");
	}

}
