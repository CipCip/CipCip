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
	String a=user.getUsername();
	String b=user.getPassword();
	
	Statement stmt= null;
	String logInQuery="select * from utente where username='"+a+"' and password='"+b+"'";
	
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
			//setto all'user 
			//tutte gli altri attributi 
			//con 
			user.setFirstName(rs.getString("nome"));
			user.setLastName(rs.getString("cognome"));
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
		String a=user.getUsername();
		String b=user.getPassword();
		String c=user.getEmail();
		String d=user.getFirstName();
		String e=user.getLastName();
		
		Statement stmt= null;
		String registrationQuery="insert into utente(username, password, nome, cognome, email) values ('"
								+a
								+"','"
								+b
								+"','"
								+d
								+"','"
								+e
								+"','"
								+c
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
			rs=stmt.executeQuery(registrationQuery);
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
