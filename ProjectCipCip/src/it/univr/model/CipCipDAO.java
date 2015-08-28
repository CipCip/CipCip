package it.univr.model;


import it.univr.bean.CipCipBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CipCipDAO {
	static Connection currentCon = null;
	static ResultSet rs = null; 


	public CipCipBean invio(CipCipBean cinguetto) throws InterruptedException{

		Statement stmt = null;
		String a = cinguetto.getTargaCipCip();
		String b = cinguetto.getPosiniziale();
		String c = cinguetto.getPosfinale();
		String d = Float.toString(cinguetto.getVelocita());
		
		try 
		{
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			
			String insertQuery =
					"insert into cipcip(targacipcip,posiniziale, posfinale, velocita) VALUES ('"
							+ a
							+ "','"
							+ b
							+ "','"
							+ c
							+ "','"
							+ d
							+ "')";
			String insertInPos = "insert into positions(targaposizioni, posiniziale, posfinale) VALUES ('"
					+ a
					+ "','"
					+ b
					+ "','"
					+ c
					+ "')";
			String searchQuery = "select * from cipcip where targacipcip='"+a+"'";
			String deleteQuery = "delete from cipcip";
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			if (more) 
			{
				stmt.executeUpdate(deleteQuery);
				stmt.executeUpdate(insertQuery);
				stmt.executeUpdate(insertInPos);
				
			} 

			// Se l'utente non esiste setto isValid a true
			else if (!more) 
			{    	
				stmt.executeUpdate(insertQuery);
				stmt.executeUpdate(insertInPos);
				
			}
		
		} 

		catch (Exception v) 
		{

			System.out.println("Errore- " + v);
		} 


		finally 
		{
			if (rs != null)	{
				try {
					rs.close();
				} catch (Exception e) {}
				rs = null;
			}


			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		
		return cinguetto;

	}
}
