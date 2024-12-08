package t1O13;

import java.util.Scanner;

public class T1O13 {

	public static void main(String[] args) {
		// Scanner öffnen
		Scanner Inp = new Scanner(System.in);
		
//		Eingabe	Gesamtzahl Kisten 	
		System.out.print("Gesamtzahl der Kisten:");
		int gesKisten = Integer.parseInt(Inp.nextLine());	
		
//		Eingabe	Kisten pro LKW	
		System.out.print("wieviele Kisten können pro LKW transportiert werden:");
		int kistenProLKW = Integer.parseInt(Inp.nextLine());	

//		 Scanner schließen und freigeben
		Inp.close();
		
//		Berechnung wieviele Fahrten notwendig sind
		int gesFahrten = gesKisten / kistenProLKW;
		
//		Berechnung wieviele Kisten übrig bleiben		
		int kistenRest = gesKisten % kistenProLKW;
		
//		Ausgabe
		System.out.println("Benötigte Fahrten:" + gesFahrten);
		System.out.println("übriggebliebene Kisten:" + kistenRest);
	}

}
