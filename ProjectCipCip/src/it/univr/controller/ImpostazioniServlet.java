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

/**
 * Servlet implementation class ImpostazioniServlet
 */
@WebServlet("/ImpostazioniServlet")
public class ImpostazioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user=new UserBean();
		VeicoloBean car=new VeicoloBean();
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setCellulare(request.getParameter("cellulare"));
		car.setSoglia_email(Float.parseFloat(request.getParameter("soglia_email")));
		car.setSoglia_sms(Float.parseFloat(request.getParameter("soglia_sms")));
		car.setTarga(request.getParameter("targa"));
		
		user=UserDAO.modifica(user);
		car=VeicoloDAO.modifica(car);
		//stampare un messaggio di successo � a livello front??
		response.sendRedirect("dashboard.jsp");
	}

}
