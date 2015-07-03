package it.univr.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBean {
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private String cellulare;
	private int amministratore;
	private boolean valid;
	

	public UserBean(String email, String password, String nome, String cognome, 
			String cellulare, int amministratore, boolean valid) {
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
		this.amministratore = amministratore;
		this.valid=valid;
	}
	
	public UserBean(){
		new UserBean(email, password, nome, cognome, 
				cellulare, amministratore, valid); 
	}
	
	public UserBean(ResultSet rs) throws SQLException {
		this.email = rs.getString("email");
		this.password = rs.getString("password");
		this.nome = rs.getString("nome");
		this.cognome = rs.getString("cognome");
		this.cellulare=rs.getString("cellulare");
		this.amministratore = rs.getInt("amministratore");
		this.valid = true;
		
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	public int getAmministratore() {
		return amministratore;
	}
	public void setAmministratore(int amministratore) {
		this.amministratore = amministratore;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	

	

}
