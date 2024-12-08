package t1A11;

public class RechnungZeile {
	//Instanzvariable
	private Ware ware;
	private int anzahl;
	
	// Konstruktor
	public RechnungZeile(Ware w, int z) {
		ware = w;
		anzahl = z;
	}
	// Methoden
	public double berechneZeilenPreis() {
		return ware.getPreis() * anzahl;
	}
	public void drucken() {
		ware.drucken();
		System.out.println("\t" + anzahl + "\t" + berechneZeilenPreis());
	}
}
