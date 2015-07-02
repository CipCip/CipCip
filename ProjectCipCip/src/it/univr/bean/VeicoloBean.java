package it.univr.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class VeicoloBean {
	
	private String targa;
	private String marca;
	private String modello;
	private java.sql.Date data_immatricolazione;
	private float soglia_email;
	private float soglia_sms;
	private String email_utente;
	private int codposizione;
	
	public VeicoloBean(String targa, String marca, String modello,
			java.sql.Date data_immatricolazione, float soglia_email, float soglia_sms,
			String email_utente, int codposizione) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.data_immatricolazione = data_immatricolazione;
		this.soglia_email = soglia_email;
		this.soglia_sms = soglia_sms;
		this.email_utente = email_utente;
		this.codposizione = codposizione;
	}
	
	public VeicoloBean(ResultSet rs) throws SQLException {
		this.targa = rs.getString("targa");
		this.marca = rs.getString("marca");
		this.modello = rs.getString("modello");
		this.data_immatricolazione = rs.getDate("data_immatricolazione");
		this.soglia_email = rs.getInt("soglia_email");
		this.soglia_sms = rs.getInt("soglia_sms");
		this.email_utente =rs.getString("email_utente");
		this.codposizione =rs.getInt("codposizione");
		
	}
	
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public java.sql.Date getData_immatricolazione() {
		return data_immatricolazione;
	}
	public void setData_immatricolazione(java.sql.Date data_immatricolazione) {
		this.data_immatricolazione = data_immatricolazione;
	}
	public float getSoglia_email() {
		return soglia_email;
	}
	public void setSoglia_email(float soglia_email) {
		this.soglia_email = soglia_email;
	}
	public float getSoglia_sms() {
		return soglia_sms;
	}
	public void setSoglia_sms(float soglia_sms) {
		this.soglia_sms = soglia_sms;
	}
	public String getEmail_utente() {
		return email_utente;
	}
	public void setEmail_utente(String email_utente) {
		this.email_utente = email_utente;
	}
	public int getCodposizione() {
		return codposizione;
	}
	public void setCodposizione(int codposizione) {
		this.codposizione = codposizione;
	}
	
	
}
