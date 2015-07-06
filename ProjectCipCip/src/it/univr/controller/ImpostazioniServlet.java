package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;
import it.univr.model.UserDAO;
import it.univr.model.VeicoloDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImpostazioniServlet
 */
@WebServlet("/ImpostazioniServlet")
public class ImpostazioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user=new UserBean();
		VeicoloBean car=new VeicoloBean();
		
		HttpSession session=request.getSession(true);
		String targaUtente=(String)session.getAttribute("targa");
		String emailUtente=(String)session.getAttribute("email");
		

		user.setPassword(request.getParameter("password"));
		user.setCellulare(request.getParameter("cellulare"));
		car.setSoglia_sms(request.getParameter("soglia_sms"));
		car.setSoglia_email(request.getParameter("soglia_mail"));
		//car.setTarga(request.getParameter("targa"));
		
		
		user=UserDAO.modifica(user, emailUtente);
		car=VeicoloDAO.modifica(car, targaUtente);
		
		if(user.isError()==false && car.isError()==false)
			response.sendRedirect("dashboard.jsp");
		else
			response.sendRedirect("OperazioneNegata.jsp");
	}

}
