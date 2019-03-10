package de.hss.Aufgabe1;

public class Auftragsposition {
	
	//--- Attributen ---
		private String produktname;
		private double produktPreis;
		private int produktAnzahl;
		
		//---Konstruktor---
		public Auftragsposition(String produktname, double produktPreis, int produktAnzahl) {
			this.produktname = produktname;
			this.produktPreis = produktPreis;
			this.produktAnzahl = produktAnzahl;
		}
		
		//--- get Methoden ---
		public String getProduktname() {
			return produktname;
		}

		public double getProduktPreis() {
			return produktPreis;
		}

		public int getProduktAnzahl() {
			return produktAnzahl;
		}
}
