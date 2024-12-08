package t1KE1;

public class T1KE1 {

	public static void main(String[] args) {
		// Scanner zum Einlesen einer Konsole vorbereiten
		java.util.Scanner Inp = new java.util.Scanner(System.in);
		
		// ganze Zahl
		System.out.println("Ganze Zahl eingeben:");
		// in.nextLine() - liest die Zeile von der Konsole als String
		// Integer.parseInt() - konvertiert den String in Datentyp int
		int ganzeZahl = Integer.parseInt(Inp.nextLine());
		System.out.println("Eingegeben wurde: " + ganzeZahl);
		
		// ganze Zahl
		System.out.println("Gleitkommazahl eingeben:");
		// Inp.nextLine() - liest die Zeile von der Konsole als String
		// Double.parseDouble() - konvertiert den String in Datentyp double
		double gleitZahl = Double.parseDouble(Inp.nextLine());
		System.out.println("Eingegeben wurde: " + gleitZahl);
				
		// einzelnes Zeichen
		System.out.println("Einzelnes Zeichen eingeben:");
		char einZeichen = Inp.nextLine().charAt(0);
		System.out.println("Eingegeben wurde: " + einZeichen);
		
		// Zeichenkette String
		System.out.println("Text eingeben:");
		String zeichenKette = Inp.nextLine();
		System.out.println("Eingegeben wurde: " + zeichenKette);
		
		// Scanner schließen und freigeben
		Inp.close();
		
		// TODO muss hier noch weiterarbeiten
	}

}
