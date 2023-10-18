package Ugggifter;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Betygskoll {
    public static void main(String[] args) {
        System.out.println("Vad heter du?");
        Scanner tgb = new Scanner(System.in);
        String namn = tgb.nextLine();
        System.out.println(namn);

        System.out.println("Hur många poäng har du fått?");
        int i = Integer.parseInt(tgb.nextLine());

        int E = 15;
        int D = 18;
        int C = 21;
        int B = 24;
        int A = 27;

        if (0 <= i && i < 31) {
            if (0 <= i && i < E) {
                System.out.println(namn + "Du har F");
            }
            if (E <= i && i < D) {
                System.out.println(namn + "Du har E");
            }
            if (D <= i && i < C) {
                System.out.println(namn + "Du har D");
            }
            if (C <= i && i < B) {
                System.out.println(namn + "Du har C");
            }
            if (B <= i && i < A) {
                System.out.println(namn + "Du har B");
            }
            if (A <= i && i < 31) {
                System.out.println(namn + "Du har A");
            }

        }
        else {
            System.out.println("Jävla retard helvet gå och skaffa dig ett liv ditt jävla handikapp!?");
        }
    }
}

