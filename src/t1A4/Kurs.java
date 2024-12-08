package t1A4;

public class Kurs {
	private String kursname;
	private double kurspreis;
	private String[] teilnehmer = new String[10]; // alle Arrayelemente sind auf null initialisiert
	
	// Kontruktor
	public Kurs(String n, double p) {
		kursname = n;
		kurspreis = p;
	}
	
	// Methoden
	public boolean aufnehmen(String teilnehmerName) {
		// durch das Teilnehmerarray durchlaufen
		for(int i = 0; i < teilnehmer.length; i++) {
			// ist Platz frei?
			if(teilnehmer[i] == null) {
				// ja, Teilnehmer eintragen und mit true beenden
				teilnehmer[i] = teilnehmerName;
				return true;
			}
		}
		// nein, mit false beenden
		return false;
	}
	
	public boolean stornieren(String teilnehmerName) {
		// durch das Teilnehmerarray durchlaufen
		for(int i = 0; i < teilnehmer.length; i++) {
			// ist der Platz besetzt und ist es der gesuchte Teilnehmer
			if(teilnehmer[i] != null && teilnehmer[i].equals(teilnehmerName)) {
				// ja, Teilnehmer sntfernen und mit true beenden
				teilnehmer[i] = null;
				return true;
			}
		}
		// nein, mit false beenden
		return false;
	}
	
	public void drucken() {
		System.out.println(kursname + " zum Preis von " + kurspreis);
		System.out.println("Folgende Teilnehmer sind angemeldet");
		for (String einTeilnehmer : teilnehmer) {
			if (einTeilnehmer != null) {
				System.out.println(einTeilnehmer);
			}
		}
	}
}
