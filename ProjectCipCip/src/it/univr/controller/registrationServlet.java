package it.univr.controller;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;
import it.univr.model.UserDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//richiedo anche la targa in registrazione
		UserBean user=new UserBean();
		VeicoloBean car=new VeicoloBean();
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setNome(request.getParameter("nome"));
		user.setCognome(request.getParameter("cognome"));
		user.setCellulare(request.getParameter("cellulare"));
		
		car.setTarga(request.getParameter("targa"));
		
		user.setAmministratore(0);
		
		
		user=UserDAO.registrazione(user, car);
	
	
		
		if(user.isValid()){
			HttpSession session=request.getSession(true);
			
			session.setAttribute("email", user.getEmail());
			session.setAttribute("nome",user.getNome());
			session.setAttribute("targa", car.getTarga());
			response.sendRedirect("dashboard.jsp");	}
	
			

		}
		
		
		
	}

