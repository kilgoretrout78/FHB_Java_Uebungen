package t1A2;

public class Ratespiel {
	// Methode
	public void spiele() {
		int zufallsZahl = (int) (Math.random() * 10);
		// Spielerarray anlegen
		Spieler[] spieler = new Spieler[3];
		// Spieler Objekte erzeugen und im Array speichern
		spieler[0] = new Spieler("John");
		spieler[1] = new Spieler("Paul");
		spieler[2] = new Spieler("George");
		while (true) {
			for(Spieler einspieler : spieler) {
				int zz = einspieler.rateZahl();
				if(zufallsZahl == zz) {
					System.out.println("Sieger ist " + einspieler.getName() + " mit " + zufallsZahl);
					return;
				}
				else {
					System.out.println("Falsch geraten " + einspieler.getName() + " mit " + zz);
				}
			}
		}
	}

}
