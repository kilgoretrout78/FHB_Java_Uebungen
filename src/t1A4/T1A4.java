package t1A4;

public class T1A4 {

	public static void main(String[] args) {
		// Kurs Objekt anlegen
		Kurs k = new Kurs("Basis Java", 990);
		// Teilnehmer bei Kurs anmelden
		k.aufnehmen("John");
		k.aufnehmen("Paul");
		k.aufnehmen("George");
		k.aufnehmen("Ringo");
		// Deails des Kurses ausgeben
		k.drucken();
		
		k.stornieren("John");
		k.aufnehmen("Joe Strummer");
		k.aufnehmen("Topper Headon");
		k.stornieren("George");
		k.aufnehmen("Mick Jones");
		k.drucken();
	}

}
