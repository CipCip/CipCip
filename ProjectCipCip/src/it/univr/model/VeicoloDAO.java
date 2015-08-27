package it.univr.model;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VeicoloDAO {
	static ResultSet rs = null;
    static Connection connessione = null;
    
    public static VeicoloBean inserimento(VeicoloBean car, String targa, String email){
    	
    	Statement stmt=null;
    	
    	//String a=car.getTarga();
    	String b=car.getMarca();
    	String c=car.getModello();
    	String d=car.getData_immatricolazione();
    	String e=car.getSoglia_email();
    	String f=car.getSoglia_sms();
    	//String g=car.getEmail_utente();
    	//Controllo che g sia uguale alla String emailUtente
    	
    	
    	if(b.length()==0 || c.length()==0 || d.length()==0 || e.length()==0 || f.length()==0){
			car.setError(true);
			return car;
		}
    	//String modificaCar="update veicolo set soglia_mail='"+a+"', soglia_sms='"+b+"' where targa='"+targa+"'";
		
    	String inserimentoVeicolo="update veicolo set marca='"
				+ b + "', modello='" 
				+ c + "', data_immatricolazione='"
				+ d + "', soglia_sms='" 
				+ f + "', soglia_mail='" 
				+ e + "' where targa='"+targa+"'";
    	
    	//String val="select * from veicolo where targa='"+targa+"'";
    	
    	try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(inserimentoVeicolo);
				int bla=stmt.getUpdateCount();
				if(bla!=0){
					car.setValid(true);	
				}
				else{
					car.setValid(false);
					
				}
				
				
			} catch (SQLException b1) {
				System.out.println("Inserimento fallito " + b1);
				car.setError(true);
			}
			
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return car;
	
    }
    
    public static VeicoloBean modifica(VeicoloBean car, String targa) {
		Statement stmt = null;
		
		String a = car.getSoglia_email();
		String b= car.getSoglia_sms();
		System.out.println(targa);

		if(a.length()==0 || b.length()==0){
			car.setError(true);
			return car;
		}
		String modificaCar="update veicolo set soglia_mail='"+a+"', soglia_sms='"+b+"' where targa='"+targa+"'";
		
		try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(modificaCar);
				int more = stmt.getUpdateCount();
				
				if(more!=0){					
					car.setValid(true);
				}
				else{
					car.setValid(false);
					car.setError(true);
				}
				
					
			} catch (SQLException b1) {
				System.out.println("Modifica fallita " + b1);
				car.setError(true);
			}
			
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return car;
	}
    
    public static boolean rimuoviVeicolo(String targaUtente){
    	Statement stmt=null;
    	boolean res= false;
    
    	String elimina= "delete from veicolo where targa='"+targaUtente+"'";
    	try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(elimina);
				int more = stmt.getUpdateCount();
					
					if(more!=0){
						res=true;
						
					}
					else
						res=false;
				
			} catch (SQLException b1) {
				System.out.println("Modifica fallita " + b1);
				
				
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return res;
	}
    
    public static VeicoloBean listaVeicolo(VeicoloBean car, String targaUtente){
    	
    	Statement stmt=null;
    	
    	String seleziona= "select * from veicolo where targa='"+targaUtente+"'";
    	
    	try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				rs = stmt.executeQuery(seleziona);
				boolean more=rs.next();
				if(more)
					car=new VeicoloBean(rs);				
				
			} catch (SQLException b1) {
				System.out.println("Modifica fallita " + b1);
				car.setError(true);
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return car;
	
    }
    public static VeicoloBean updateVeicolo(VeicoloBean car, String targa){
		 Statement stmt = null;
			
			String a = car.getTarga();
			String b = car.getMarca();
			String c = car.getModello();
			String d = car.getData_immatricolazione();
			String e = car.getSoglia_sms();
			String f = car.getSoglia_email();
			
			if(a.length()==0 || b.length()==0 || c.length()==0 || d.length()==0 || e.length()==0 || f.length()==0){
				car.setError(true);
				return car;
			}
			
			
			String modificaCar="update veicolo set targa='"+a+"'"
					+ ", marca='"+b+"'"
					+ ", modello='"+c+"'"
					+ ", data_immatricolazione='"+d+"'"
					+ ", soglia_sms='"+e+"'"
					+ ", soglia_mail='"+f+"'"
					+ " where targa='"+targa+"'";
			
			try{
				try {
					connessione = ConnectionManager.getConnection(); 
					stmt= connessione.createStatement();
					stmt.executeUpdate(modificaCar);
					int more = stmt.getUpdateCount();
					if(more!=0)
						car.setValid(true);
					
				} catch (SQLException b1) {
					System.out.println("Modifica fallita " + b1);
					car.setError(true);
				}
				//rs.close();
				stmt.close();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				return car;
		 
	 }
    
    public static List<VeicoloBean> getCars() {
	 	Statement stmt=null;
		List<VeicoloBean> res = new ArrayList<>();
		
		String query="select * from veicolo order by targa";
		
		try {
			connessione = ConnectionManager.getConnection(); 
			stmt= connessione.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next())
				res.add(new VeicoloBean(rs));
			} 
		catch (SQLException e) {
			System.out.println("Select failed: An Exception has occurred! " + e);
		}
		
		return res;
	}
    
    public static VeicoloBean selezionaVeicolo(/*UserBean user, */VeicoloBean car){
    	Statement stmt=null;
    	
    	
		//String a=user.getEmail();
		String b=car.getTarga();
		
		/*if(a.length()==0 ){
			car.setError(true);
			return car;
		}*/
		
    	//String selezioneQuery="select * from veicolo v, utente u where u.email='"+a+"' and u.email=v.emailutente"
    			//+ "and v.targa='"+b+"'";
    	
		String selezioneQuery="select * from veicolo v where and v.targa='"+b+"'";
		
    	try{
    		try {
    			connessione = ConnectionManager.getConnection(); 
    			stmt= connessione.createStatement();
    			rs = stmt.executeQuery(selezioneQuery);
    			boolean more = rs.next();
    			if (more){
    				car.setValid(true);
    				car.setMarca(rs.getString("marca"));
    				car.setModello(rs.getString("modello"));
    				car.setTarga(rs.getString("targa"));
    				car.setData_immatricolazione(rs.getString("data_immatricolazione"));
    			
    			}
    			else
    				car.setValid(false);
    		
    			
    			
    		} catch (SQLException a1) {
    			System.out.println("Selezione fallita in selezione veicolo " + a1);
    			car.setError(true);
    		}
    		rs.close();
    		stmt.close();
    		}
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    		return car;
    	
    }
    
    
  
}
