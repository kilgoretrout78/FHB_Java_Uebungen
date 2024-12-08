package t1A5;

public class T1A5 {

	public static void main(String[] args) {
		/*
		 * 0
		 * 1
		 * 1	i-2
		 * 2	i-1
		 * 3	i
		 * 5
		 * 8
		 * 13
		 * etc..... 
		 * */
		int [] fibo = new int[30]; // alle Elemente sidn mit 0 initialisiert
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			// Zahl berechnen
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		// Ausgabe
		for (int eineZahl : fibo) {
			System.out.println(eineZahl);
		}
	}

}
