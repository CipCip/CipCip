package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;
import it.univr.model.UserDAO;
import it.univr.model.VeicoloDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserBean utente=new UserBean();
		utente.setEmail(request.getParameter("email"));
		utente.setPassword(request.getParameter("password"));
		
		utente=UserDAO.logIn(utente);
		
		
		if(utente.isValid()){
			VeicoloBean car=new VeicoloBean();
			
			car=UserDAO.selezionaVeicolo(utente,car);
			
			HttpSession session=request.getSession(true);
			
			session.setAttribute("email",utente.getEmail());
			session.setAttribute("targa", car.getTarga());
			session.setAttribute("marca", car.getMarca());
			session.setAttribute("modello", car.getModello());
			session.setAttribute("data_immatricolazione", car.getData_immatricolazione());
			if(utente.getAmministratore()==1){
				response.sendRedirect("dashboardAmministrazione.jsp");
			}
			else
				response.sendRedirect("dashboard.jsp");}
		}
		
	}


