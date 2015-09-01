package it.univr.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class PosizioniBean {
	
	
	private LinkedList <String> listainiziale = new LinkedList<String>();
	private LinkedList <String> listafinale= new LinkedList<String>();
	
	
	private String posiniziale;
	private String posfinale;
	
	private String targaPosizione;
	
	
	
	public PosizioniBean(String posiniziale, String posfinale,
			String targaPosizione) {
		super();
		this.posiniziale = posiniziale;
		this.posfinale = posfinale;
		this.targaPosizione = targaPosizione;
	}
	
	public PosizioniBean(){
		new PosizioniBean(posiniziale, posfinale, targaPosizione); 
	}

	public PosizioniBean(ResultSet rs) throws SQLException {
		this.posiniziale = rs.getString("posiniziale");
		this.posfinale = rs.getString("posfinale");
		this.targaPosizione = rs.getString("targaposizioni");
		
	}
	


	public LinkedList<String> getListInit() {

		return listainiziale;
	}

	public void addListInit(String valore){
		this.listainiziale.add(valore);
	}

	public void addListFinal(String valore){
		this.listafinale.add(valore);
	}

	public void setListInizio(LinkedList<String> listainiziale) {
		this.listainiziale = listainiziale;
	}
	
	public LinkedList<String> getListFinale() {
		return listafinale;
	}

	public void setListFinal(LinkedList<String> listafinale) {
		this.listafinale = listafinale;
	}

	public String getPosIniziale() {
		return posiniziale;
	}

	public void setPosIniziale(String posiniziale) {
		this.posiniziale = posiniziale;
	}

	public String getPosFinale() {
		return posfinale;
	}

	public void setPosFinale(String posfinale) {
		this.posfinale = posfinale;
	}

	public String getTarga() {
		return targaPosizione;
	}

	public void setTarga(String targaPosizione) {
		this.targaPosizione = targaPosizione;
	}

}
