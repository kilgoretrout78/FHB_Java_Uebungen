package t1K10;

public class T1K10 {

	public static void main(String[] args) {
		// 1. Mitarbeiter Objekt anlegen
		Mitarbeiter m1 = new Mitarbeiter("Max","Mustermann",3000);
		m1.drucken();
		System.out.printf("Mitarbeiter1 nach Gehaltserhöhung um 15 Prozent: \n");
		m1.setMonatsgehalt(m1.getMonatsgehalt()*1.15);
		m1.drucken();
		
		System.out.printf("\n\n");
		
		// 2. Mitarbeiter Objekt anlegen
		Mitarbeiter m2 = new Mitarbeiter("Maria","Mustermann",5000);
		m2.drucken();
		System.out.printf("Mitarbeiter2 nach Gehaltserhöhung um 3 Prozent: \n");
		m2.setMonatsgehalt(m2.getMonatsgehalt()*1.03);
		m2.drucken();
	}

}
