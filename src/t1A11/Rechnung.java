package t1A11;

public class Rechnung {
	// Instanzvariable
	private	RechnungZeile[] zeilen;
	
	//Konstruktor
	public Rechnung(int anzahlZeilen) {
		zeilen = new RechnungZeile[anzahlZeilen];
	}
	
	// Methoden
	public void drucken() {
		double gesamt = 0;
		for(RechnungZeile eineRechnungzeile : zeilen) {
			if(eineRechnungzeile != null) {
				eineRechnungzeile.drucken();
				gesamt += eineRechnungzeile.berechneZeilenPreis();
			}
		}
		System.out.println("Gesamt\t\t\t\t" + gesamt);
	}
	public boolean neuWare(Ware w, int anzahlStueck) {
		for(int i = 0; i < zeilen.length; i++) {
			if(zeilen[i] == null) {
				zeilen[i] = new RechnungZeile(w, anzahlStueck);
				return true;
			}
		}
		return false;
	}
}
