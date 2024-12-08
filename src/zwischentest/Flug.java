package zwischentest;

public class Flug {
	//	Instanzvariablen
	private String von;
	private String nach;
	private double basisPreis;
	private boolean firstClass;
	private boolean verpflegung;
	private int anzahlGepaeck;
	private double gesamtPreis;
	
    // Konstruktor
    public Flug(String von, String nach, double basisPreis, boolean firstClass, boolean verpflegung) {
        this.von = von;
        this.nach = nach;
        this.basisPreis = basisPreis;
        this.firstClass = firstClass;
        this.verpflegung = verpflegung;
    }
    
    // Setter Anzahl Gepäck
    public void setAnzahlGepaeck(int anzahl) {
    	this.anzahlGepaeck = anzahl;
    }
    
    // Methoden
    public double berechnePreis() {
        gesamtPreis = this.basisPreis;
        
        // Adjust price for first-class passengers
        if (this.firstClass) {
            gesamtPreis *= 1.5;
        }

        // Add a fee for food service if applicable
        if (this.verpflegung) {
            gesamtPreis += 15;
        }

        // Add fees for baggage if applicable
        if (anzahlGepaeck != 0) {
            gesamtPreis += anzahlGepaeck * 21;
        }

        return gesamtPreis;
    }
    
    public void drucken () {
    	System.out.println("Flug von " + von + " nach " + nach + " zum Basispreis von " + basisPreis);
    	
       	System.out.println("First Class " + firstClass + "\n" + "Verpflegung " + verpflegung + "\n" +" Gesamtpreis " + gesamtPreis);
    }
}