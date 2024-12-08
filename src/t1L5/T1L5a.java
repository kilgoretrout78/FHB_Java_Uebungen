package t1L5;

import java.util.Scanner;

public class T1L5a {

   /*
    T1L5 – Zahlen summieren und multiplizieren
    Implementieren Sie ein Programm, welches in einer Schleife Zahlen von der Konsole einliest.
    Die Schleife wird beendet bei Eingabe der Zahl 0.
    Geben Sie anschließend die Summe und das Produkt der eingelesenen Zahlen auf der Konsole aus.
   */

    public static void main(String[] args) {

        // Scanner öffnen
        Scanner in = new Scanner(System.in);

        // Variablen, das Produkt muss 1 sein zu Beginn, damit Multiplikationen nicht automatisch 0 ergeben
        int summe = 0;
        int produkt = 1;

        // Eingabeaufforderung für die erste Zahl
        System.out.println("Bitte geben Sie ein Zahl ein: (0 zum beenden)");
        int zahl = Integer.parseInt(in.nextLine());

        // Falls gleich zu Beginn die Eingabe 0 wäre, bliebe das Produkt im Ergebnis noch immer 1
        if (zahl == 0) {
            produkt = 0;
        }

        // Berechnung
        while (zahl != 0) {
            summe += zahl;
            produkt *= zahl;

            // Nach der ersten Berechnung soll erneut nach einer Zahl gebeten werden.
            System.out.println("Bitte geben Sie ein Zahl ein: (0 zum beenden)");
            zahl = Integer.parseInt(in.nextLine());
        }

        // Scanner wieder schließen
        in.close();

        // Ergebnisse
        System.out.println("Summe der eingegeben Zahlen beträgt: " + summe);
        System.out.println("Produkt der eingegebenen Zahlen beträgt: " + produkt);

    }
}
