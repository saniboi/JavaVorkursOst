import java.util.Scanner;

public class U04_Rechnen {
    public static void main(String[] args) {
        // Vergindung zur Standard-Eingabe resp.zum Keyboard:
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Eingabe 1. ganze Zahl = ");
        int zahl1 = eingabe.nextInt();

        System.out.println("Eingabe 2. ganze Zahl = ");
        int zahl2 = eingabe.nextInt();

        System.out.println("Eingabe 1. Gleitkommazahl = ");
        double d1 = eingabe.nextDouble();

        System.out.println("Eingabe 2. Gleitkommazahl = ");
        double d2 = eingabe.nextDouble();

        System.out.println("1. ganze Zahl = " + zahl1);
        System.out.println("2. ganze Zahl = " + zahl2);

        int zahl3 = zahl1 + zahl2;
        System.out.println("Summe         = " + zahl3);

        int zahl4 = zahl1 - zahl2;
        System.out.println("Differenz     = " + zahl4);

        int zahl5 = zahl1 * zahl3;
        System.out.println("Produkt       = " + zahl5);

        int zahl6 = zahl1 / zahl2;
        System.out.println("Quotient      = " + zahl6);

        int zahl7 = zahl1 % zahl2;
        System.out.println("Rest          = " + zahl7);

        System.out.println();

        System.out.println("1. ganze Zahl = " + d1);
        System.out.println("2. ganze Zahl = " + d2);

        double d3 = d1 + d2;
        System.out.println("Summe         = " + d3);

        double d4 = d1 - d2;
        System.out.println("Differenz     = " + d4);

        double d5 = d1 * d2;
        System.out.println("Produkt       = " + d5);

        double d6 = d1 / d2;
        System.out.println("Quotient      = " + d6);

        double d7 = d1 % d2;
        System.out.println("Rest          = " + d7);

//		System.out.print("2 : ");
//		// Einlesen einer Zahl von der Standard-Eingabe als Ganzahl
//		// vom Typ 'int':
//		int i = eingabe.nextInt();
//		System.out.println("Zahl = " + i);
//		System.out.print("Gleitkomma-Zahl : ");
//		// Einlesen einer Zahl von der Standard-Eingabe als Gleitkommazahl
//		// vom Typ 'double':
//		double d = eingabe.nextDouble();
//		System.out.println("Zahl = " + d);
        System.out.println("ENDE.");
        eingabe.close();

    }
}
