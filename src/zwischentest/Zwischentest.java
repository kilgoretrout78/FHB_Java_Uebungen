package zwischentest;

import java.util.Scanner;

public class Zwischentest {

	public static void main(String[] args) {
		// Scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Abflugort:");
		String von = in.nextLine();
		System.out.println("Zielort:");
		String nach = in.nextLine();
		System.out.println("Basispreis eingeben:");
		double basisPreis = Double.parseDouble(in.nextLine());
		System.out.println("Fist class? j/n");
		String firstClassEin = in.nextLine();
		boolean firstClass = false;
		if (firstClassEin.equals("j")) {
			firstClass = true;
		}
		if (firstClassEin.equals("n")) {
			firstClass = false;
		}
		System.out.println("Verpflegung? j/n");
		String VerpflegungEin = in.nextLine();
		boolean verpflegung = false;
		if (VerpflegungEin.equals("j")) {
			verpflegung = true;
		}
		if (VerpflegungEin.equals("n")) {
			verpflegung = false;
		}
		System.out.println("Anzahl der Gepäckstücke");
		int anzahl = in.nextInt();
		
		Flug f = new Flug(von, nach, basisPreis, firstClass, verpflegung);
		f.setAnzahlGepaeck(anzahl);
		f.berechnePreis();
		f.drucken();
	}

}
