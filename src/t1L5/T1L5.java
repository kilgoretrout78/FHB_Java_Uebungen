package t1L5;

import java.util.Scanner;

public class T1L5 {

	public static void main(String[] args) {
		// Scanner öffnen
		Scanner Inp = new Scanner(System.in);
			int summe = 0;
	        int produkt = 1;
	        // Eingabe
	        System.out.println("Bitte Zahlen eingeben (0 = Ende):");

	        while (true) {
	            System.out.print("Zahl: ");
	            int zahl = Integer.parseInt(Inp.nextLine());


	            // 0 beendet Eingabe
	            if (zahl == 0) {
	                break;
	            }

	            // Summe und Produkt berechnen
	            summe += zahl;
	            produkt *= zahl;
	        }


	        	// Summe und Produkt ausgeben
	            System.out.println("Summe der Zahlen: " + summe);
	            System.out.println("Produkt der Zahlen: " + produkt);

	        Inp.close();
	    }

}
