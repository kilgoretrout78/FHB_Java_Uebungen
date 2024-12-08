package t1O1;

import java.util.Scanner;

public class T1O1 {

	public static void main(String[] args) {
		Scanner Inp = new Scanner(System.in);
		
//		 Anzahl der Fahrkarten
		System.out.print("Anzahl der Fahrkarten eingeben:");
		int fahrKarten = Integer.parseInt(Inp.nextLine());
//		 Preis pro Fahrkarte
		System.out.print("Preis pro Fahrkarte:");
		double preisFK = Double.parseDouble(Inp.nextLine());
//		 Rabatt
		System.out.print("Rabatt eingeben:");
		int rabatt = Integer.parseInt(Inp.nextLine());
//		 Berechnung
		double rabPreis = preisFK-preisFK*rabatt/100;
		double gesamtPreis = rabPreis*fahrKarten;
		//		 Scanner schließen und freigeben
		Inp.close();
		
//		 Ausgabe
		System.out.println("Anzahl der Fahrkarten: " + fahrKarten);
		System.out.println("Preis pro Fahrkarte: " + rabPreis);
		System.out.println("Gesamtpreis: " + gesamtPreis);
		

	}

}
