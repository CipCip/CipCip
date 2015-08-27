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
		VeicoloBean car=new VeicoloBean();
		utente.setEmail(request.getParameter("email"));
		car.setTarga(request.getParameter("targa"));
		utente.setPassword(request.getParameter("password"));
		
		utente=UserDAO.logIn(utente, car);
		
		
		if(utente.isValid()){
			
			HttpSession session=request.getSession(true);
			
			session.setAttribute("email",utente.getEmail());
			session.setAttribute("nome",utente.getNome());
			session.setAttribute("cognome",utente.getCognome());
			session.setAttribute("targa", car.getTarga());
			System.out.print(car.getMarca());
			
			car=VeicoloDAO.selezionaVeicolo(utente,car);
			
			session.setAttribute("marca", car.getMarca());
			session.setAttribute("modello", car.getModello());
			session.setAttribute("data_immatricolazione", car.getData_immatricolazione());
			
			if(utente.getAmministratore()==1){
				response.sendRedirect("dashboardAmministrazione.jsp");
			}
			else
				response.sendRedirect("dashboard.jsp");}
		else
				response.sendRedirect("errorLogIn.jsp");
		}
		
	}
