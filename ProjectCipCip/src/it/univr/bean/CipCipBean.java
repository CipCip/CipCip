package it.univr.bean;

import java.util.LinkedList;
import java.util.LinkedList;


	public class CipCipBean {
		
	
		private String posiniziale;
		private String posfinale;
		private String targaCipCip;
		private float velocita;
		private LinkedList <String> listainizio = new LinkedList<String>();
		private LinkedList <String> listafine= new LinkedList<String>();
		

		public CipCipBean(){

			// Setto dei percorsi
			
			listainizio.add("Strada le grazie, Verona");                   //1
			listainizio.add("Via Armando Diaz, 8, Verona");                //2
			listainizio.add("Via Pigna, 2, Verona");                       //3
			listainizio.add("Via Mazzini, 4, Verona");                     //4
			listainizio.add("Corso Porta Nuova, Verona");                  //5
			
			listafine.add("Via Daniele Manin, 8, Verona");              //1
			listafine.add("Via San Francesco, 5, Verona");              //2
			listafine.add("Via Colonnello Fasoli, 43, Verona");         //3
			listafine.add("Aeroporto di Verona, Caselle");              //4
			listafine.add("Via dei Fante, 2, Castelnuovo del Garda");   //5
			
			// Genero un indice per scegliere un percorso random
			
			int randomNumber = 0 + (int)(Math.random()*(listainizio.size()-1));
			System.out.println("Indice generato: "+randomNumber);
			
			// Setto il percorso random
		
			posiniziale = listainizio.get(randomNumber);
			posfinale = listafine.get(randomNumber);
			
			// Genero una velocità random
			
			velocita = (float) (20 + Math.random() * 100);
			System.out.println("VELOCITA: "+velocita);
			
		}


		public String getPosiniziale() {
			return posiniziale;
		}


		public String getPosfinale() {
			return posfinale;
		}


		public String getTargaCipCip() {
			return targaCipCip;
		}


		public float getVelocita() {
			return velocita;
		}


		public void setTargaCipCip(String targaCipCip) {
			this.targaCipCip = targaCipCip;
		}

}
