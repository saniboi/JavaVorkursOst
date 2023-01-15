import java.util.Scanner;

public class U06_PotenzRechnung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        while (true) {
            System.out.print("Basis    : ");
            int basis = eingabe.nextInt();

            if (basis < 0) {
                System.out.println("Basis : " + basis);
                System.out.println("Good Bye");
                break;
            }

            System.out.print("Exponent : ");
            int exponent = eingabe.nextInt();
            int potenz = 1;

            for (int i = 1; i <= exponent ; i++) {
                potenz *= basis;
            }

            System.out.println(basis + "^" + exponent + " = " + potenz);
            System.out.println();

        }
    }
}
