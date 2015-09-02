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
 * Servlet implementation class VeicoloServlet
 */
@WebServlet("/VeicoloServlet")
public class VeicoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		String targa=(String)session.getAttribute("targa");
		String email=(String)session.getAttribute("email");
		System.out.print(targa);
		VeicoloBean car=new VeicoloBean();
		
		car.setMarca(request.getParameter("marca"));
		car.setModello(request.getParameter("modello"));
		car.setData_immatricolazione(request.getParameter("data_immatricolazione"));
		car.setSoglia_sms(request.getParameter("soglia_sms"));
		car.setSoglia_email(request.getParameter("soglia_mail"));
		//car.setTarga(request.getParameter("targa"));
		
		car=VeicoloDAO.inserimento(car, targa, email);
		
		if(car.isValid()==true){
			
			session.setAttribute("targa",car.getTarga());
			session.setAttribute("marca",car.getMarca());
			session.setAttribute("modello",car.getModello());
			session.setAttribute("data_immatricolazione",car.getData_immatricolazione());
			session.setAttribute("soglia_mail",car.getSoglia_email());
			session.setAttribute("soglia_sms",car.getSoglia_sms());
		}
		if(car.isError())
			response.sendRedirect("OperazioneNegata.jsp");
		else
			response.sendRedirect("dashboard.jsp");
		
	}

}
