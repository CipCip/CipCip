package it.univr.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager  {
	
		private static String myUrl;
		private static String myUser;
		private static String myPassword;
		private static Connection connection;
		private static ConnectionManager instance;

		// Design pattern creazionale SINGLETON
		
		//creo una classe privata che auto-istanzia se stessa
		private ConnectionManager(){}
		
		//uso il metodo getIstance() per accedere alla classe e alle variabili in essa incapsulate
		//ritorna il suo indirizzo
		public static ConnectionManager getInstance() {
			if(instance==null)
				return instance=new ConnectionManager();
			else
				return instance;
			
		}	
		
		public static Connection getConnection(){
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			myUrl = "jdbc:postgresql://dbserver.scienze.univr.it/dblab38";
			myUser = "userlab38";
			myPassword = "trentottoDH";
			try {
				connection = DriverManager.getConnection(myUrl, myUser,
						myPassword);
			} catch (SQLException e) {
				System.out.println("Manca connessione");
			}
			System.out.println("CONNESSO");
			return connection;
		}

			

		public void close() throws SQLException {
			connection.close();
		}

	

		
}


