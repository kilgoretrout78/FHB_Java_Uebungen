package t1O4;

import java.util.Scanner;

public class T1O4 {

	public static void main(String[] args) {
		Scanner Inp = new Scanner(System.in);
		
		System.out.print("Radius eingeben:");
		double radius = Double.parseDouble(Inp.nextLine());
//		 Scanner schließen und freigeben
		Inp.close();
		
		System.out.println("Umfang:" + (2*radius*Math.PI));
		System.out.println("Fläche:" + (radius*radius*Math.PI));
	}

}
