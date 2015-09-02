package it.univr.model;

import it.univr.bean.HelpBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelpDAO {
	static ResultSet rs = null;
    static Connection connessione = null;
    
    public static HelpBean inserisciaiuto(HelpBean help){
    	Statement stmt=null;
    	
    	String a=help.getNome();
    	String b=help.getEmail();
    	String c=help.getMessaggio();
    	
    	if(a.length()!=0 || b.length()!=0 || c.length()!=0 ){
			help.setValid(true);
		}
    	else{
    		help.setValid(false);
    		return help;
    	}
    		  	
    	String insertQuery="insert into help(nome, email, messaggio) "
		+ "values ('"
		+ a 
		+ "','" 
		+ b 
		+ "','" 
		+ c 
		+ "')";
    	
    	System.out.print(c);
    	try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(insertQuery);
				help.setValid(true);	
				
			} catch (SQLException b1) {
				System.out.println("Invio messaggio fallito" + b1);
			}
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
    	
    	return help;
    }
}
