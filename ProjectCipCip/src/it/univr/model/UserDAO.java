package it.univr.model;

import it.univr.bean.UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Statement;

//DAO responsabile delle query
public class UserDAO {
	

    static ResultSet rs = null;
    static Connection connessione = null;

	public static UserBean logIn(UserBean user) {
		
		Statement stmt = null;
	    
		String d = user.getEmail();
		String e = user.getPassword();
		
		String logInQuery="select * from utente where email='" + d
				+ "' and password='" + e + "'";
		try{
		try {
			connessione = ConnectionManager.getConnection(); //il problema � qui
			stmt= connessione.createStatement();//problema vuole prendere una connessione aspe
			rs = stmt.executeQuery(logInQuery);
			boolean more = rs.next();
			if (more){
				user = new UserBean(rs); 
				
			}
		
			else
				user.setValid(false);
			
			
		} catch (SQLException a) {
			System.out
					.println("Selezione fallita " + a);
		}
		rs.close();
		stmt.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return user;
		
	
}
		
	public static UserBean registrazione(UserBean user) {
		Statement stmt = null;
	
		String a = user.getEmail();
		String b = user.getPassword();
		String c = user.getNome();
		String d = user.getCognome();
		String e = user.getCellulare();
		int f = user.getAmministratore();

		//String registrationQuery="insert into utente(email, password, nome, cognome, cellulare, amministratore) values (?,?,?,?,?,?)";
		String registrationQuery = "insert into utente(email, password, nome, cognome, cellulare, amministratore) "
				+ "values ('"
				+ a 
				+ "','" 
				+ b 
				+ "','" 
				+ c 
				+ "','" 
				+ d 
				+ "','" 
				+ e 
				+ "','"
				+ f
				+ "')";
		//String inserimentoEff = "select * from utente where email='"+a+"'";*/
		try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(registrationQuery);
				//int more = stmt.getUpdateCount();
				//rs = stmt.executeQuery(inserimentoEff);
				//boolean more=rs.next();
				
				user.setValid(true);
				
				
				
				
			} catch (SQLException b1) {
				System.out
						.println("Inserimento fallito " + b1);
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return user;
	}
}
	/*
	 * public static UserBean indexHome(UserBean user){ String d=user.getNome();
	 * String e=user.getCognome();
	 * 
	 * Statement stmt= null; String
	 * indexQuery="select * from utente where nome='"+d+"' and cognome='"+e+"'";
	 * 
	 * try{ try{ String
	 * url="jdbc:postgresql://dbserver.scienze.univr.it/dblab38";
	 * Class.forName("org.postgresql.Driver");
	 * conn=DriverManager.getConnection(url, "userlab38", "trentottoDH"); }
	 * catch(SQLException ex){ ex.printStackTrace(); }
	 * stmt=conn.createStatement(); rs=stmt.executeQuery(indexQuery); boolean
	 * ok=rs.next(); if(ok){ user.setValid(true); } else{ user.setValid(false);
	 * } rs.close(); stmt.close(); } catch(Exception ex){ ex.printStackTrace();
	 * }
	 * 
	 * return user; }
	 

}*/