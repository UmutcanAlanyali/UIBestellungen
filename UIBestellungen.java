package de.hss.Aufgabe1;

public class UIBestellungen {

	public static void main(String[] args) {
		// Objekte
		Kunde k = new Kunde("Bodo Schmidt",4711);
		
		//---Aufträge und Positionen
		k.addAuftrag("0815");
		k.addPositionen("0815", "Grafikkarte", 250, 8);
		k.addPositionen("0815", "HDD", 100, 15);
		
		k.addAuftrag("0816");
		k.addPositionen("0816", "Fernseher", 259, 10);
		k.addPositionen("0816", "Beamer", 599, 7);
		k.addPositionen("0816", "Soundbar", 199, 10);
		
		//alles anzeigen
		System.out.println(k.info());
	}

}
