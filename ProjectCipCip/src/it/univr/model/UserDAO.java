package it.univr.model;

import it.univr.bean.UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DAO responsabile delle query
public class UserDAO {
static Connection conn=null;
static ResultSet rs=null;
 
public static UserBean logIn(UserBean user){
	//String a=user.getNome();
	//String b=user.getCognome();
	//String c=user.getEmail();
	String d=user.getEmail();
	String e=user.getPassword();
	
	Statement stmt= null;
	String logInQuery="select * from utente where username='"+d+"' and password='"+e+"'";
	
	try{
		try{
			String url="jdbc:postgresql://dbserver.scienze.univr.it/dblab38";
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(url, "userlab38", "trentottoDH");
		}
		catch(SQLException ex){
			ex.printStackTrace();			
		}
		stmt=conn.createStatement();
		rs=stmt.executeQuery(logInQuery);
		boolean db=rs.next();
		if(db==true){
			//setto all'user tutte gli altri attributi con 
			user.setNome(rs.getString("nome"));
			user.setCognome(rs.getString("cognome"));
			//user.setUsername(rs.getString("username"));
			//user.setPassword(rs.getString("password"));
			user.setEmail(rs.getString("email"));
			user.setValid(true);
		}
		else{user.setValid(false);}
		rs.close();
		stmt.close();
	}
	
	catch(Exception ex){
		ex.printStackTrace();			
	}
	
	return user;
}

public static UserBean registrazione(UserBean user){
		String a=user.getNome();
		String b=user.getCognome();
		String c=user.getEmail();
		String d=user.getCellulare();
		String e=user.getPassword();
		//int f=user.getAmministratore();
		
		Statement stmt= null;
		String registrationQuery="insert into utente(nome, cognome, email, username, password, amministratore) values ('"
								+a
								+"','"
								+b
								+"','"
								+c
								+"','"
								+d
								+"','"
								+e
								+"','"
								//+f
								+"')";
		try{
			try{
				String url="jdbc:postgresql://dbserver.scienze.univr.it/dblab38";
				Class.forName("org.postgresql.Driver");
				conn=DriverManager.getConnection(url, "userlab38", "trentottoDH");
			}
			catch(SQLException ex){
				ex.printStackTrace();			
			}
			stmt=conn.createStatement();
			int quante=stmt.executeUpdate(registrationQuery);
			//user.setValid(true);
			
			 
	            if(quante>0)
	            {
	                System.out.println("Succesfully Registered");
	                
	            }
			
			if(rs.next()){
				//setto all'user tutti gli altri attributi con 
				user.setNome(rs.getString("nome"));
				user.setCognome(rs.getString("cognome"));
				user.setCellulare(rs.getString("cellulare"));
				//user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				//user.setAmministratore(rs.getString("amministratore").toString());
				user.setValid(true);
			}
			else{
				user.setValid(false);
				}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception ex){
			ex.printStackTrace();			
		}
		
		
		return user;
	}
public static UserBean indexHome(UserBean user){
	String d=user.getNome();
	String e=user.getCognome();
	
	Statement stmt= null;
	String indexQuery="select * from utente where nome='"+d+"' and cognome='"+e+"'";
	
	try{
		try{
			String url="jdbc:postgresql://dbserver.scienze.univr.it/dblab38";
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(url, "userlab38", "trentottoDH");
		}
		catch(SQLException ex){
			ex.printStackTrace();			
		}
		stmt=conn.createStatement();
		rs=stmt.executeQuery(indexQuery);
		boolean ok=rs.next();
		if(ok){
			user.setValid(true);
		}
		else{
			user.setValid(false);
		}
		rs.close();
		stmt.close();
	}
	catch(Exception ex){
		ex.printStackTrace();			
	}
	
	return user;
}

}
