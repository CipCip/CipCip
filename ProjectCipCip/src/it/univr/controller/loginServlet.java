package it.univr.controller;


import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;
import it.univr.model.DAOFactory;
import it.univr.model.UserDAOInterface;
import it.univr.model.VeicoloDAOInterface;

import java.io.IOException;

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
		
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAOInterface UserDAO = factory.getUserDAO();
		utente=UserDAO.logIn(utente, car);
		
		
		if(utente.isValid()){
			
			HttpSession session=request.getSession(true);
			
			session.setAttribute("email",utente.getEmail());
			session.setAttribute("nome",utente.getNome());
			//session.setAttribute("cognome",utente.getCognome());
			session.setAttribute("targa", car.getTarga());
			System.out.print(car.getTarga());
			
			factory = DAOFactory.getDAOFactory();
	        VeicoloDAOInterface VeicoloDAO = factory.getVeicoloDAO();
			car=VeicoloDAO.selezionaVeicolo(utente,car);
			
			session.setAttribute("marca", car.getMarca());
			session.setAttribute("modello", car.getModello());
			session.setAttribute("data_immatricolazione", car.getData_immatricolazione());
			session.setAttribute("soglia_mail",car.getSoglia_email());
			session.setAttribute("soglia_sms",car.getSoglia_sms());
			
			if(utente.getAmministratore()==1){
				response.sendRedirect("dashboardAmministrazione.jsp");
			}
			else{
				//aggiungo codice di Cipcip servlet per vedere se da qui funziona
				/*try
				{	    
					HttpSession session1 = request.getSession(true);
					CipCipBean cip = new CipCipBean();
					cip.setTargaCipCip((String) session1.getAttribute("targa"));
					
					cip = CipCipDAO.invio(cip);
					
					session1.setAttribute("speed",cip.getVelocita());
					//cip = null;
					
					PosizioniBean positions = new PosizioniBean();
					positions = PositionDAO.positions(positions);
					
					session1.setAttribute("posiniziale",positions.getPosIniziale());
					session1.setAttribute("posfinale",positions.getPosFinale());
					positions = null;
					
					response.sendRedirect("dashboard.jsp");
					
				} 
				catch (Throwable theException) 	    
				{
					System.out.println(theException); */
				response.sendRedirect("dashboard.jsp");
				}
				}
		else
				response.sendRedirect("errorLogIn.jsp");
		}
		
	}
