package t1O3;

import java.util.Scanner;

public class T1O3 {

	public static void main(String[] args) {
		Scanner Inp = new Scanner(System.in);
		
		System.out.print("Seitelänge1 eingeben:");
		double seite1 = Double.parseDouble(Inp.nextLine());
		System.out.print("Seitelänge2 eingeben:");
		double seite2 = Double.parseDouble(Inp.nextLine());
//		 Scanner schließen und freigeben
		Inp.close();
		System.out.println("Umfang:" + (2*seite1+2*seite2));
		System.out.println("Fläche:" + (seite1*seite2));
	}

}
