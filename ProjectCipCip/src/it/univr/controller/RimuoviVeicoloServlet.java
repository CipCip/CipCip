package it.univr.controller;

import it.univr.bean.VeicoloBean;
import it.univr.model.VeicoloDAO;

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
		boolean rimosso=VeicoloDAO.rimuoviVeicolo(targaUtente);
		
		if(rimosso){
			response.sendRedirect("veicolo.jsp");
		}
		else
			response.sendRedirect("OperazioneNegata.jsp");
		
		
	}

}
