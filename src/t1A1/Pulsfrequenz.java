package t1A1;

import java.time.Year;

public class Pulsfrequenz {
	// Instanzvariablen
	private int gbJahr;
	private String nachname;
	private String vorname;
	
	// Kontruktor
	public Pulsfrequenz(String v, String n, int j) {
		// Informationen aus den Parametern in den Instanzvariablen speichern
		gbJahr = j;
		nachname = n;
		vorname =v;
	}
	
	// Methoden
	public void drucken() {
		System.out.println(vorname + " " + nachname + " geboren " + gbJahr);
		System.out.println("Maximale Pulsfrequenz: " + maxFrequenz());
		int[] zpf = zielFrequenz();
		System.out.println("Zielfrequenz von " + zpf[0] + " bis " + zpf[1]);
	}
	
	public int maxFrequenz() {
		return (int) (223 - (Year.now().getValue() - gbJahr) * 0.9);
	}
	
	public int[] zielFrequenz() {
		int[] zf = new int[2];
		int mf = maxFrequenz();
		// UNtergrenze
		zf[0] = mf / 2;
		// Obergrenze
		zf[1] = (int) (mf * 0.85);
		// das ganze Array zurückliefern
		return zf;
		
	}


}
