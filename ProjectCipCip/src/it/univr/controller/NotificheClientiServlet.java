package it.univr.controller;

import it.univr.model.DAOFactory;
import it.univr.model.HelpDAOInterface;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NotificheClientiServlet
 */
@WebServlet("/NotificheClientiServlet")
public class NotificheClientiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String id=(String) session.getAttribute("rdbSelezione");
		
		System.out.println("ID1: "+id);
		
		DAOFactory factory = DAOFactory.getDAOFactory();
        HelpDAOInterface HelpDAO = factory.getHelpDAO();
		boolean res=HelpDAO.deleteSelection(id);
		
		if(res==true)
				response.sendRedirect("dashboardAmministrazione.jsp");
		else
				response.sendRedirect("OperazioneNegataA.jsp");
	}

}
