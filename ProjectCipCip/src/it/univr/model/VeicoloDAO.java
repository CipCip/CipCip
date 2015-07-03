package it.univr.model;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VeicoloDAO {
	static ResultSet rs = null;
    static Connection connessione = null;
    
    public static VeicoloBean inserimento(VeicoloBean car, String emailUtente){
    	
    	Statement stmt=null;
    	
    	String a=car.getTarga();
    	String b=car.getMarca();
    	String c=car.getModello();
    	String d=car.getData_immatricolazione();
    	String e=car.getSoglia_email();
    	String f=car.getSoglia_sms();
    	//String g=car.getEmail_utente();
    	//Controllo che g sia uguale alla String emailUtente
    	
    	String inserimentoVeicolo="insert into veicolo(targa, marca, modello, data_immatricolazione, soglia_sms, soglia_mail,  emailutente) "
				+ "values ('"
				+ a 
				+ "','" 
				+ b 
				+ "','" 
				+ c 
				+ "','" 
				+ d 
				+ "','" 
				+ f 
				+ "','"
				+ e
				+ "','" 
				+ emailUtente
				+ "')";
    	
    	try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				
				stmt.executeUpdate(inserimentoVeicolo);
				//int more = stmt.getUpdateCount();
				//rs = stmt.executeQuery(inserimentoEff);
				//boolean more=rs.next();
				
				car.setValid(true);
				
				
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
			return car;
	
    }
    
    public static VeicoloBean modifica(VeicoloBean car, String targa) {
		Statement stmt = null;
		
		String a = car.getSoglia_email();
		String b= car.getSoglia_sms();
		System.out.println(targa);
		//String e = car.getTarga();
		//String vecchiaMail = request.getSession().getAttribute("modalita").toString();
		//UPDATE impiegato SET stipendio = stipendio + 100 WHERE nome_dipartimento = ‘Vendite’;
		String modificaCar="update veicolo set soglia_mail='"+a+"', soglia_sms='"+b+"' where targa='"+targa+"'";
		
		try{
			try {
				connessione = ConnectionManager.getConnection(); 
				stmt= connessione.createStatement();
				stmt.executeUpdate(modificaCar);
				//int more = stmt.getUpdateCount();
				//rs = stmt.executeQuery(inserimentoEff);
				//boolean more=rs.next();
				
				car.setValid(true);
				
				
			} catch (SQLException b1) {
				System.out
						.println("Modifica fallita " + b1);
			}
			//rs.close();
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
				//rs = stmt.executeQuery(inserimentoEff);
				//boolean more=rs.next();
				if(more!=0)
					res=true;				
				
			} catch (SQLException b1) {
				System.out
						.println("Modifica fallita " + b1);
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
				System.out
						.println("Modifica fallita " + b1);
			}
			//rs.close();
			stmt.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return car;
	
    }
    
    
  
}
