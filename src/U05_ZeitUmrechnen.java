import java.util.Scanner;

public class U05_ZeitUmrechnen {
    public static void main(String[] args) {
        // Vergindung zur Standard-Eingabe resp.zum Keyboard:
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Eingabe Sekunden   : ");
        int sec1 = eingabe.nextInt();

        System.out.println("Eingabe Sekunden 2 : ");
        int sec2 = eingabe.nextInt();

        if (sec1 >= 0 && sec2 >= 0) {
            int day = 86400;
            int hour = 3600;
            int min = 60;
            int rest;

            System.out.println("Sekunden : " + sec1);
            System.out.println("Tage     = " + sec1 / day);
            rest = sec1 % 86400;
            System.out.println("Stunden  = " + rest / hour);
            rest = sec1 % 3600;
            System.out.println("Minuten  = " + rest / min);
            rest = sec1 % 60;
            System.out.println("Sekunden = " + rest);

            System.out.println();

            System.out.println("Sekunden : " + sec2);
            System.out.println("Tage     = " + sec2 / day);
            rest = sec2 % 86400;
            System.out.println("Stunden  = " + rest / hour);
            rest = sec2 % 3600;
            System.out.println("Minuten  = " + rest / min);
            rest = sec2 % 60;
            System.out.println("Sekunden = " + rest);


            System.out.println("ENDE.");
            eingabe.close();
        }else {
            System.out.println("Sekunden : " + sec1 + " " + sec2);
            System.out.println("Good Bye");
        }
    }
}
