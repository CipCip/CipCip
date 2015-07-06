package it.univr.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class VeicoloBean {
	
	private String targa;
	private String marca;
	private String modello;
	private String data_immatricolazione;
	private String soglia_email;
	private String soglia_sms;
	private String email_utente;
	private int codposizione;
	private boolean valid;
	

	public VeicoloBean(String targa, String marca, String modello,
			String data_immatricolazione, String soglia_email, String soglia_sms,
			String email_utente, int codposizione, boolean valid) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.data_immatricolazione = data_immatricolazione;
		this.soglia_email = soglia_email;
		this.soglia_sms = soglia_sms;
		this.email_utente = email_utente;
		this.codposizione = codposizione;
		this.valid=valid;
	}
	
	public VeicoloBean(ResultSet rs) throws SQLException {
		this.targa = rs.getString("targa");
		this.marca = rs.getString("marca");
		this.modello = rs.getString("modello");
		this.data_immatricolazione = rs.getString("data_immatricolazione");
		this.soglia_email = rs.getString("soglia_mail");
		this.soglia_sms = rs.getString("soglia_sms");
		this.email_utente =rs.getString("emailutente");
		//this.codposizione =rs.getInt("codposizione");
		this.valid=true;
		
	}
	
	
	public VeicoloBean() {
		new VeicoloBean(targa, marca, modello, data_immatricolazione, soglia_email, soglia_sms,
			email_utente, codposizione, valid);
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
	public String getData_immatricolazione() {
		return data_immatricolazione;
	}
	
	public void setData_immatricolazione(String data_immatricolazione){
		this.data_immatricolazione=data_immatricolazione;
	}
	
	public String getSoglia_email() {
		return soglia_email;
	}
	public void setSoglia_email(String soglia_email) {
		this.soglia_email = soglia_email;
	}
	public String getSoglia_sms() {
		return soglia_sms;
	}
	public void setSoglia_sms(String soglia_sms) {
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
	
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
