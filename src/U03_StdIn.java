import java.util.Scanner;

public class U03_StdIn {
    public static void main(String[] args) {

        // Vergindung zur Standard-Eingabe resp.zum Keyboard:
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Ein String : ");

        // Einlesen eines Strings von der Standard-Eingabe:
        String str = eingabe.next();
        System.out.println("String = " + str);
        System.out.print("Ganze Zahl : ");

        // Einlesen einer Zahl von der Standard-Eingabe als Ganzahl
        // vom Typ 'int':
        int i = eingabe.nextInt();
        System.out.println("Zahl = " + i);
        System.out.print("Gleitkomma-Zahl : ");

        // Einlesen einer Zahl von der Standard-Eingabe als Gleitkommazahl
        // vom Typ 'double':
        double d = eingabe.nextDouble();
        System.out.println("Zahl = " + d);
        System.out.println("ENDE.");
        eingabe.close();

    }
}
