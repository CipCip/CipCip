package it.univr.model;


import it.univr.bean.PosizioniBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PosizioniDAO {
	static Connection currentCon = null;
	static ResultSet rs = null; 
	
	
	public PosizioniBean positions(PosizioniBean pos){

		Statement stmt = null;
		String queryPos1 = "select startpos from tmid";
		String queryPos2 = "select endpos from tmid";
		
		try 
		{
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(queryPos1);
			rs.next();
			pos.setPosIniziale(rs.getString("posiniziale"));
			rs = stmt.executeQuery(queryPos2);
			rs.next();
			pos.setPosFinale(rs.getString("posfinale"));
		
		} 

		catch (Exception ex) 
		{
			System.out.println("Errore " + ex);
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

		return pos;

	}
	
	public PosizioniBean posizioniFinali(PosizioniBean pos){

		Statement stmt = null;
		String targa = pos.getTarga();
		String queryPos = "select posiniziale, posfinale from posizioni where targaposizioni='"+targa+"'";
		
		try 
		{
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(queryPos);
			int c=0;
			while (rs.next() && c<5) {
				pos.addListInit(rs.getString("posiniziale"));
				pos.addListFinal(rs.getString("posfinale"));
				c+=1;
			}
			
		} 

		catch (Exception ex) 
		{
			System.out.println("Problems! " + ex);
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

		return pos;

	}
}
