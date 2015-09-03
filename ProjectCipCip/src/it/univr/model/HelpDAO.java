package it.univr.model;

import it.univr.bean.HelpBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
    public static List<HelpBean> getHelp() {
	 	Statement stmt=null;
		List<HelpBean> res = new ArrayList<>();
		
		String query="select * from help order by email";
		
		try {
			connessione = ConnectionManager.getConnection(); 
			stmt= connessione.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next())
				res.add(new HelpBean(rs));
			} 
		catch (SQLException e) {
			System.out.println("Select failed: An Exception has occurred! " + e);
			
		}
		
		return res;
	}
    
    public static boolean deleteSelection(String id){
		 Statement stmt = null;
		 boolean res=false;
		 
		 String eliminaQuery = "delete from help where id='"+id+"'";
		 try{
				try {
					connessione = ConnectionManager.getConnection(); 
					stmt= connessione.createStatement();
					stmt.executeUpdate(eliminaQuery);
					int more = stmt.getUpdateCount();
					if(more!=0){
						res=true;
						
					}
						
					
				} catch (SQLException b1) {
					System.out.println("Eliminazione messaggio cliente fallita " + b1);
					
				}
				
				stmt.close();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				return res;
		 
	 }
}
