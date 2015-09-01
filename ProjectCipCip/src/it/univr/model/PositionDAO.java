package it.univr.model;



//import it.univr.bean.CipCipBean;
import it.univr.bean.PosizioniBean;
//import it.univr.bean.UserBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PositionDAO {
	static Connection currentCon = null;
	static ResultSet rs = null; 
	
	
	public static PosizioniBean positions(PosizioniBean pos){

		Statement stmt = null;
		String queryPos1 = "select posiniziale from cipcip";
		String queryPos2 = "select posfinale from cipcip";
		
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
			System.out.println("Si è verificato un problema! " + ex);
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
	
	/*public static PosizioniBean lastfivepositions(CipCipBean pos){

		Statement stmt = null;
		String targa = pos.getTargaCipCip();
		PosizioniBean posizione=new PosizioniBean();
		System.out.println("Targa:"+pos.getTargaCipCip());
		String queryPos = "select posiniziale, posfinale from posizioni where targaposizioni='"+targa+"'";
		
		try 
		{
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(queryPos);
			
			int c=0;
			System.out.println("Posizioni: "+pos.getPosiniziale()+", "+pos.getPosfinale());
			while (rs.next() && c<5) {
				posizione.addListInit(rs.getString("posiniziale"));
				posizione.addListFinal(rs.getString("posfinale"));
				c+=1;
			}
			
		} 

		catch (Exception ex) 
		{
			System.out.println("Si è verificato un problema! " + ex);
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

		return posizione;

	}*/
	
	public static List<PosizioniBean> getPosizioni(String targa) {
	 	Statement stmt=null;
		List<PosizioniBean> res = new ArrayList<>();
		System.out.println("Targa:"+targa);
	
		String queryPos = "select * from posizioni where targaposizioni='"+targa+"'";
		
		try {
			currentCon = ConnectionManager.getConnection(); 
			stmt= currentCon.createStatement();
			rs = stmt.executeQuery(queryPos);
			
			while (rs.next())
				res.add(new PosizioniBean(rs));
			} 
		catch (SQLException e) {
			System.out.println("Select failed: An Exception has occurred! " + e);
			
		}
		
		return res;
	}
}
