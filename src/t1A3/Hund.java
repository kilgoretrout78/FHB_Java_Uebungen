package t1A3;

public class Hund {
	// Instanzvariablen
	private int alter;
	private String name;
	
	// Kontruktor
	public Hund(int a, String n) {
		alter = a;
		name = n;
	}
	
	public void bellen() {
		System.out.println("Wuff");
	}
}
