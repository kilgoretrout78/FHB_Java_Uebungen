package t1O9;

import java.util.Scanner;

public class T1O9 {

	public static void main(String[] args) {
// 		Scanner öffnen
		Scanner Inp = new Scanner(System.in);
		
//		Eingabe	gefahrene Kilometer	
		System.out.print("gefahrene Kilometer eingeben:");
		double gefKilometer = Double.parseDouble(Inp.nextLine());
		
//		Eingabe verbrauchte Liter
		System.out.print("vebrauchte Liter Benzin:");
		double verbLiter = Double.parseDouble(Inp.nextLine());
		
//		Scanner schließen und freigeben
		Inp.close();
		
//		Berechnung verbrauchte Liter / 100 km
		double verbPro100Kilometer = verbLiter/(gefKilometer/100);
		
//		Berechnung Kilometergeld		
		double kilometerGeld = 0.42*gefKilometer;
		
//		Ausgabe
		System.out.printf("Verbrauch pro 100 Kilometer: %.2f Liter\n", verbPro100Kilometer);
		System.out.printf("Kilometergeld: %.2f €\n", kilometerGeld);
	}

}
