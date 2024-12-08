package t1O2;

import java.util.Scanner;

public class T1O2 {

	public static void main(String[] args) {
		Scanner Inp = new Scanner(System.in);
		
		System.out.print("Ganze Zahl eingeben:");
		double zahl1 = Double.parseDouble(Inp.nextLine());
		System.out.print("Quadrierte Zahl:" + zahl1*zahl1);

		// Scanner schließen und freigeben
		Inp.close();
	}

}
