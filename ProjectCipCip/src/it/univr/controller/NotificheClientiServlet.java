package it.univr.controller;

import it.univr.bean.HelpBean;
import it.univr.model.HelpDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NotificheClientiServlet
 */
@WebServlet("/NotificheClientiServlet")
public class NotificheClientiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HelpBean help=new HelpBean();
		
		
		boolean res=HelpDAO.deleteSelection(help);
		
		 if(res==true)
				response.sendRedirect("dashboardAmministrazione.jsp");
			else
				response.sendRedirect("OperazioneNegataA.jsp");
	}

}
