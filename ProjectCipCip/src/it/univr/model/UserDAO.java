package it.univr.model;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//DAO responsabile delle query
public class UserDAO implements UserDAOInterface {
	

    static ResultSet rs = null;
    static Connection connessione = null;

	public UserBean logIn(UserBean user, VeicoloBean car) {
		
		Statement stmt = null;
	    
		String d = user.getEmail();
		String e = user.getPassword();
		String f = car.getTarga();
		
		if(d.length()==0 || e.length()==0){
			user.setError(true);
			return user;
		}
		
		String logInQuery="select * from utente u, veicolo v where u.email='" + d
				+ "' and u.password='" + e + "' and v.targa='" + f + "'";
		try{
		try {
			connessione = ConnectionManager.getConnection(); 
			stmt= connessione.createStatement();
			rs = stmt.executeQuery(logInQuery);
			boolean more = rs.next();
			if (more){
				user = new UserBean(rs); 
			}
		
			else
				user.setValid(false);
			
			
		} catch (SQLException a) {
			System.out.println("Selezione fallita logIn" + a);
			
			
		}
		rs.close();
		stmt.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			user.setError(true);
		}
		
		user.setError(false);
		return user;
		
	
}
		
	public UserBean registrazione(UserBean user, VeicoloBean car) {
		Statement stmt = null;
	
		String a = user.getEmail();
		String b = user.getPassword();
		String c = user.getNome();
		String d = user.getCognome();
		String e = user.getCellulare();
		int f = user.getAmministratore();
		String g=car.getTarga();
		
		if(a.length()==0 || b.length()==0 || c.length()==0 || d.length()==0 || e.length()==0 ){
			user.setError(true);
			return user;
		}
		
		String registrationQueryUser = "insert into utente(email, password, nome, cognome, cellulare, amministratore) "
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
		
		String registrationQueryCar="insert into veicolo(targa, emailutente) "
				+ "values ('"
				+ g 
				+ "','"
				+ a
				+ "')";
	
		try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(registrationQueryUser);
				//stmt.executeUpdate(registrationQueryCar);
				//user.setValid(true);
				//car.setValid(true);
			
				
			} catch (SQLException b1) {
				System.out.println("Non reinserisco l'utente, aggiungo solo un auto riferita " + b1);
				stmt.executeUpdate(registrationQueryCar);
				user.setValid(true);
				car.setValid(true);
				//user.setError(true);
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return user;
	}
	
	public UserBean modifica(UserBean user, String emailUtente) {
		Statement stmt = null;
		
		//String a = user.getEmail();
		String b= user.getPassword();
		String e = user.getCellulare();
		
		if(b.length()==0 || e.length()==0){
			user.setError(true);
			return user;
		}
		
		String modificaUser="update utente set password='"+b+"', cellulare='"+e+"' where email='"+emailUtente+"'";
		System.out.println(e);
		System.out.println(e.length());
		try{
			
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(modificaUser);
				int more = stmt.getUpdateCount();
				if(more!=0)
					user.setValid(true);
			
			} catch (SQLException b1) {
				System.out.println("Modifica fallita " + b1);
				user.setError(true);
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return user;
	}
	 
	 public UserBean updateUtente(UserBean user, String emailP){
		 Statement stmt = null;
			
			//String a = user.getEmail();
			String b = user.getPassword();
			String c = user.getCellulare();
			String d = user.getNome();
			String e = user.getCognome();
			
			if(b.length()==0 || c.length()==0 || d.length()==0 || e.length()==0 ){
				user.setError(true);
				return user;
			}
			
			
			
			String modificaUser="update utente set password='"+b+"'"
					+ ", nome='"+d+"'"
					+ ", cognome='"+e+"'"
					+ ", cellulare='"+c+"'"
					+ " where email='"+emailP+"'";
			
			try{
				try {
					connessione = ConnectionManager.getConnection(); 
					stmt= connessione.createStatement();
					stmt.executeUpdate(modificaUser);
					int more = stmt.getUpdateCount();
					if(more!=0)
						user.setValid(true);
					
				} catch (SQLException b1) {
					System.out.println("Modifica fallita " + b1);
					user.setError(true);
				}
				//rs.close();
				stmt.close();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				return user;
		 
	 }
	 
	 public List<UserBean> getUsers() {
		 	Statement stmt=null;
			List<UserBean> res = new ArrayList<>();
			
			String query="select * from utente order by nome";
			
			try {
				connessione = ConnectionManager.getConnection(); 
    			stmt= connessione.createStatement();
    			rs = stmt.executeQuery(query);
    			
				while (rs.next())
					res.add(new UserBean(rs));
				} 
			catch (SQLException e) {
				System.out.println("Select failed: An Exception has occurred! " + e);
				
			}
			
			return res;
		}
	 
	 public boolean eliminaUtente(UserBean user){
		 Statement stmt = null;
		 boolean res=false;
		 String a = user.getEmail();
		 
		 if(a.length()==0 ){
				user.setError(true);
				return res;
			}
		 
		 String eliminaQuery = "delete from utente where email='"+a+"'";
		 try{
				try {
					connessione = ConnectionManager.getConnection(); 
					stmt= connessione.createStatement();
					stmt.executeUpdate(eliminaQuery);
					int more = stmt.getUpdateCount();
					if(more!=0)
						res=true;
						
					
				} catch (SQLException b1) {
					System.out.println("Eliminazione fallita " + b1);
					user.setError(true);
				}
				//rs.close();
				stmt.close();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				return res;
		 
	 }
	 
	 public UserBean modificaAmministratore(UserBean user, String email){
		 Statement stmt= null;
		 ;
			String b = user.getPassword();
			String c = user.getCellulare();
		
			if(b.length()==0 || c.length()==0){
				user.setError(true);
				return user;
			}
			
			String modificaUser="update utente set password='"+b+"'"
					+ ", cellulare='"+c+"'"
					+ " where email='"+email+"'";
			
			try{
				try {
					connessione = ConnectionManager.getConnection(); 
					stmt= connessione.createStatement();
					stmt.executeUpdate(modificaUser);
					int more = stmt.getUpdateCount();
					if(more!=0)
						user.setValid(true);
					
				} catch (SQLException b1) {
					System.out.println("Modifica fallita " + b1);
					user.setError(true);
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