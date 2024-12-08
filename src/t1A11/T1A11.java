package t1A11;

import java.util.Scanner;

public class T1A11 {

	public static void main(String[] args) {
		Rechnung r = new Rechnung(5);
		
		Scanner in = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println("Artikelnummer eingeben");
			String nummer = in.nextLine();
			System.out.println("Artikelbezeichnung eingeben");
			String bezeichnung = in.nextLine();
			double preis;
			do {
				System.out.println("Artikelpreis eingeben");
				preis = Double.parseDouble(in.nextLine());
			} while(preis < 0);
			Ware w = new Ware(nummer, bezeichnung, preis);
			int anzahl;
			do {
				System.out.println("Stückzahl eingeben");
				anzahl = Integer.parseInt(in.nextLine());
			} while(anzahl <= 0);
			r.neuWare(w, anzahl);
		}
		in.close();
		r.drucken();
	}

}
