package de.hss.Aufgabe1;

import java.util.ArrayList;

public class Kunde {
	//--- Attribute ---
	private String name;
	private int kdnr;
	private ArrayList<Auftrag> auftraege = new ArrayList();
	//--- Konstruktor---
	public Kunde(String name, int string) {
		this.name = name;
		this.kdnr = string;
	}
	
	//--- Kunde vergibt nuene Auftrag---
	public void addAuftrag(String auftragsnr) {
		auftraege.add(new Auftrag(auftragsnr));
	}
	
	//--- zum bestehenden Auftrag eine Position hinzufügen ---
	public void addPositionen(String auftragsnr, String produktName, double produktPreis, int produktAnzahl) {
	
		//schauen, ob es den Auftrag gibt, u. entsprechende Position hinzufügen...
		
		for (Auftrag a : auftraege) {
			if (a.getAuftragsnr().equals(auftragsnr)){
				a.addPositionen(produktName, produktPreis, produktAnzahl);
			}
		}
	}
	
	public String info(){
		String text = "----------- Auftragsverwaltung ----------- \n" +
					  " Kunde: " + name + ", Kundennummer: " + kdnr + "\n \n";
		
		for (Auftrag a : auftraege) {
			text += "Auftragsnummer: " + a.getAuftragsnr() + "\n";
			
			for (Auftragsposition p : a.getPositionen()) {
				text += p.getProduktname()+", " + p.getProduktAnzahl() + ", " + p.getProduktPreis() + "\n";
			}
			text += "Gesamtpreis: " + a.getGesamtPreis() + "\n\n";
		}
		
		return text;
	}
}
