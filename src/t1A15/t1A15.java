package t1A15;

public class t1A15 {

	public static void main(String[] args) {
		// Matrix mit 12 Zeilen und 12 Spalten
		int[][] tafel = new int[12][12];
		
		// durchlaufen durch alle Zeilen
		for(int i = 0; i < tafel.length; i++) {
			// durchlaufen durch alle Spalten einer Zeile
			for(int j = 0; j < tafel[i].length; j++) {
				// Element setzen
				tafel[i][j] = (i + 1) * (j + 1);
			}
		}
		
		// Ausgabe
		for(int[] eineZeile : tafel) {
			for(int eineZahl : eineZeile) {
				System.out.format("%4d", eineZahl);
			}
			System.out.println();
		}
	}

}
