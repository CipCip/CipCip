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
 * Servlet implementation class CarAmminServlet
 */
@WebServlet("/CarAmminServlet")
public class CarAmminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VeicoloBean car=new VeicoloBean();
		
		HttpSession session=request.getSession(true);
		String targaP=(String)session.getAttribute("rdbSelezione");
		System.out.println(targaP);
		
		car.setTarga(request.getParameter("targa"));
		car.setMarca(request.getParameter("marca"));
		car.setModello(request.getParameter("modello"));
		car.setData_immatricolazione(request.getParameter("data_immatricolazione"));
		car.setSoglia_sms(request.getParameter("soglia_sms"));
		car.setSoglia_email(request.getParameter("soglia_mail"));
		car.setEmail_utente(request.getParameter("emailutente"));
		
		
		
		car=VeicoloDAO.updateVeicolo(car, targaP);
		
		if(car.isError()==false)
			response.sendRedirect("dashboardAmministrazione.jsp");
		else
			response.sendRedirect("OperazioneNegataA.jsp");
		
		
	}

}
