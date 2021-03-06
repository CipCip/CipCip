package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.model.DAOFactory;
import it.univr.model.UserDAOInterface;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ModificaAmministratoreServlet
 */
@WebServlet("/ModificaAmministratoreServlet")
public class ModificaAmministratoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(true);
		UserBean utente = new UserBean();
		
		String email=(String)session.getAttribute("email");
		
		utente.setPassword(request.getParameter("password"));
		utente.setCellulare(request.getParameter("cellulare"));
		
		DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAOInterface UserDAO = factory.getUserDAO();		
		utente=UserDAO.modificaAmministratore(utente, email);
		
		if(utente.isError()==false )
			response.sendRedirect("dashboardAmministrazione.jsp");
		else
			response.sendRedirect("OperazioneNegataA.jsp");
		
	}

}
