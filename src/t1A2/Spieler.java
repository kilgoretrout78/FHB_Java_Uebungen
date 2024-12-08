package t1A2;

public class Spieler {
	//Instanzvariable
	private String name;
	
	// Konstruktor
	public Spieler(String n) {
		name = n;
	}

	// Methoden
	public String getName() {
		return name;
	}
	
	public int rateZahl() {
		return (int) (Math.random() * 10);
	}
}
