package t1KE2;

public class T1KE2 {

	public static void main(String[] args) {
		// 2 Zahlen in Variablen einlesen und ausgeben
		java.util.Scanner Inp = new java.util.Scanner(System.in);
		
		// ganze Zahl
		System.out.println("Ganze Zahl1 eingeben:");
		int zahl1 = Integer.parseInt(Inp.nextLine());
		System.out.println("Ganze Zahl2 eingeben:");
		int zahl2 = Integer.parseInt(Inp.nextLine());
		
		System.out.println("Zahl1: " + zahl1);
		System.out.println("Zahl2: " + zahl2);

		System.out.println("Variable tauschen!");
		int zahl3 = zahl1;
		zahl1 = zahl2;
		zahl2 = zahl3;
		
		System.out.println("Zahl1: " + zahl1);
		System.out.println("Zahl2: " + zahl2);
		// Scanner schließen und freigeben
		Inp.close();
	}

}
