package Ugggifter;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class MultiplikationsTabeller {

    public static void main(String[] args) {
        System.out.println("Vilken gånger tabell?");
        Scanner tgb = new Scanner(System.in);
        int Tabell = Integer.parseInt(tgb.nextLine());

        int x = 1;

        /*while (x <= 10) {
            System.out.println(x*Tabell);
            x++;

        }*/

        /*for (x=1 ; x <= 10 ; x++) {
            System.out.println(x*Tabell);
        }*/

        do {
            System.out.println(x*Tabell);
            x++;
        } while (x <= 10);



    }
}
