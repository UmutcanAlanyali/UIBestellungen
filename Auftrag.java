package de.hss.Aufgabe1;

import java.util.ArrayList;

public class Auftrag {
	
	//--- Attribute ---
	private String auftragsnr;
	private double gesamtPreis = 0.0;
	private ArrayList<Auftragsposition> positionen = new ArrayList(); 		// Assoziation
	
	//--- Konstruktor ---
	public Auftrag (String auftragsnr) {
		this.auftragsnr = auftragsnr;
	}
	
	public void addPositionen(String produktName, double produktPreis, int produktAnzahl) {
		positionen.add(new Auftragsposition(produktName, produktPreis, produktAnzahl));
		gesamtPreis += produktPreis * produktAnzahl;
	}

	//--- getMethoden ---
	public String getAuftragsnr() {
		return auftragsnr;
	}

	public double getGesamtPreis() {
		return gesamtPreis;
	}

	public ArrayList<Auftragsposition> getPositionen() {
		return positionen;
	}
}
