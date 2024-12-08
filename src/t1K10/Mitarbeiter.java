package t1K10;

public class Mitarbeiter {
	//	Instanzvariablen
	private String vorname;
	private String nachname;
	private double monatsgehalt;
	
    // Konstruktor
    public Mitarbeiter(String vorname, String nachname, double monatsgehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsgehalt = monatsgehalt;
    }
    
    // Getter für die Instanzvariable vor- und nachname
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	
	// Setter für die Instanzvariable vor- und nachname
	public void setVorname(String vn) {
		this.vorname = vn;
	}
	public void setNachname(String nn) {
		this.nachname = nn;
	}
	
	// Getter und Setter für monatsgehalt
	public double getMonatsgehalt( ) {
		return monatsgehalt;
	}
	public void setMonatsgehalt(double m) {
		this.monatsgehalt = m;
	}
	
	// Methode drucken Ausgabe von Vor-, Nachname und Monatsgehalt und berrechnetem Jahresgehalt
	public void drucken() {
        System.out.printf("Mitarbeiter: %s %s, Monatsgehalt: %.2f Euro, Jahresgehalt: %.2f Euro%n", vorname, nachname, monatsgehalt, monatsgehalt*12);
    }
	
}
