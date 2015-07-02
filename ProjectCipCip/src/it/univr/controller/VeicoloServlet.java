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
		String emailUtente=(String)session.getAttribute("email");
		
		VeicoloBean car=new VeicoloBean();
		
		car.setTarga(request.getParameter("targa"));
		car.setMarca(request.getParameter("marca"));
		car.setModello(request.getParameter("modello"));
		car.setData_immatricolazione(request.getParameter("data_immatricolazione"));
		car.setSoglia_email(request.getParameter("soglia_email"));
		car.setSoglia_sms(request.getParameter("soglia_sms"));
		car.setTarga(request.getParameter("targa"));
		
		car=VeicoloDAO.inserimento(car, emailUtente);
		response.sendRedirect("dashboard.jsp");
	}

}
