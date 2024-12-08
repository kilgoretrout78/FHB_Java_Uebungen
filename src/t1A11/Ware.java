package t1A11;

public class Ware {
	// Instanzvariable
	private String artikelBezeichnung;
	private String artikelNummer;
	private double preis;
	
	// Kontruktor
	public Ware(String n, String b, double p) {
		artikelBezeichnung = b;
		artikelNummer = n;
		preis = p;
	}
	
	// Mehtoden
	public void drucken() {
		System.out.println(artikelNummer + "\t" + artikelBezeichnung + "\t" + preis);
	}
	public String getArtikelBezeichnung() {
		return artikelBezeichnung;
	}
	public String getArtikelNummer() {
		return artikelNummer;
	}
	public double getPreis() {
		return preis;
	}
	
}
