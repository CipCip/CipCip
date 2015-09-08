package it.univr.model;

import it.univr.bean.PosizioniBean;
//import it.univr.bean.UserBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PositionDAO implements PositionDAOInterface {
	static Connection currentCon = null;
	static ResultSet rs = null; 
	
	
	public PosizioniBean positions(PosizioniBean pos){

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
	
	
	public List<PosizioniBean> getPosizioni(String targa) {
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
