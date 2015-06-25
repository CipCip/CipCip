package it.univr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import it.univr.bean.*;
//import dati.UserIO;

/**
* Servlet implementation class for Servlet: Controller
*
*/
public class UserServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet
{
  /* (non-Java-doc)
   * @see javax.servlet.http.HttpServlet#HttpServlet()
   */
  public UserServlet()
  {
    super();
  }
  
  /* (non-Java-doc)
   * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
	UserBean user = UserBean.getInstance();
    
	String username = request.getParameter("login");
    String password = request.getParameter("password");
    String nome = request.getParameter("firstName");
    String cognome = request.getParameter("lastName");
    String email = request.getParameter("email");
    
    user.setUsername(username);
    user.setPassword(password);
    user.setNome(nome);
    user.setCognome(cognome);
    user.setEmail(email);
    
    // Ricordarsi di creare la directory etc specificata!
    //UserIO.addItem( user, "WEB-INF/etc/users.txt");
    
    HttpSession session = request.getSession();
    session.setAttribute("user", user);
    
  RequestDispatcher dispatcher;
  dispatcher = getServletContext().getRequestDispatcher(
       "/PerUtente.jsp");
  dispatcher.forward(request,response);

  }
  
  /* (non-Java-doc)
   * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    this.doGet(request, response);
  }
}