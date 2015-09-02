package it.univr.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelpBean {
	private int id;
	private String nome;
	private String email;
	private String messaggio;
	private boolean valid;
	
	
	public HelpBean(int id, String nome, String email, String messaggio, boolean valid) {
		super();
		this.id=id;
		this.nome = nome;
		this.email = email;
		this.messaggio = messaggio;
		this.valid=valid;
	}
	
	public HelpBean(){
		new HelpBean(id, nome, email, messaggio, valid);
	}
	
	public HelpBean(ResultSet rs)throws SQLException {
		this.id = rs.getInt("id");
		this.nome = rs.getString("nome");
		this.email = rs.getString("email");
		this.messaggio = rs.getString("messaggio");
		this.valid = true;		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
