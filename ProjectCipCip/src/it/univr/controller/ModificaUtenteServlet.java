package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.model.UserDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImpostazioniAmministratoreServlet
 */
@WebServlet("/ModificaUtenteServlet")
public class ModificaUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserBean user=new UserBean();
		
		HttpSession session=request.getSession(true);
		String emailP=(String)session.getAttribute("rdbSelezione");
		System.out.println(emailP);
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setNome(request.getParameter("nome"));
		user.setCognome(request.getParameter("cognome"));
		user.setCellulare(request.getParameter("cellulare"));
		
		
		
		user=UserDAO.updateUtente(user, emailP);
		
		response.sendRedirect("dashboardAmministrazione.jsp");
	}

}
