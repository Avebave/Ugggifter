package Ugggifter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class sid205 {

    public static void main(String[] args) {
        System.out.println("Vilken uppgift?");
        Scanner tgb = new Scanner(System.in);
        int uppg = Integer.parseInt((tgb.nextLine()));
        if (uppg == 1) {
            uppg1();
        }
        if (uppg == 2) {
            uppg2();
        }
        if (uppg == 3) {
            uppg3();
        }
        if (uppg == 4) {
            uppg4();
        }
        if (uppg == 5) {
            uppg5();
        }
    }

    public static String uppg1() {
        Scanner tgb = new Scanner(System.in);
        System.out.print("Dagens mätarställning? ");
        int dagens = Integer.parseInt((tgb.nextLine()));

        System.out.print("Mätarställning för ett år sedan? ");
        int gammal = Integer.parseInt((tgb.nextLine()));

        System.out.print("Antal liter förbrukad bensin? ");
        int Bensin = Integer.parseInt((tgb.nextLine()));

        float Mil = dagens-gammal;
        System.out.println(Mil);
        float BenMil = Bensin/Mil;
        System.out.println(BenMil);
        double BenMilKort = BenMil + 0.005;
        String BenMilKortStr = String.valueOf(BenMilKort);
        String PerMil = BenMilKortStr.substring(0,4);
        System.out.println(PerMil);
        return null;
    }
    public static String uppg2() {
        Scanner tgb = new Scanner(System.in);
        System.out.print("Hur mycket har du betalat? ");
        int Kostnad = Integer.parseInt((tgb.nextLine()));

        System.out.print("Hur mycket betalar du med? ");
        int Betalning = Integer.parseInt((tgb.nextLine()));

        int i = Betalning-Kostnad;

        int tvåhundra = 0;
        int femtio = 0;
        int tjugo = 0;
        int tio = 0;
        int femma = 0;
        int etta =0;

        while (i >= 200){
            tvåhundra += 1;
            i -= 200;
        }
        while (i >= 50) {
            femtio += 1;
            i -= 50;
        }
        while (i >= 20) {
            tjugo += 1;
            i -= 20;
        }
        while (i >= 10) {
            tio += 1;
            i -= 10;
        }
        while (i >= 5) {
            femma += 1;
            i -= 5;
        }
        while (i >= 1) {
            etta += 1;
            i -= 1;
        }
        JOptionPane.showMessageDialog(null,"Du ska få: \n" + tvåhundra + " tvåhundralappar, \n"+femtio+" femtiolappar, \n"+tjugo+" tjugolappar, \n"+tio+" tiokronor, \n"+femma+" femkronor, \n"+etta+" enkronor." );

        return null;
    }
    public static int uppg3(){
        Scanner tgb = new Scanner(System.in);
        System.out.print("Hur mycket har du på kontot?? ");
        float Konto = Integer.parseInt((tgb.nextLine()));

        System.out.print("hur mycket ska du ta ut varje år? ");
        int uttag = Integer.parseInt(tgb.nextLine());

        System.out.print("hur många år? ");
        int år = Integer.parseInt(tgb.nextLine());
        int i = 1;




        while (i <= år) {
            float a = (float) (Konto*1.01);
            float b = a-uttag;
            Konto = b;
            String Resultat = String.format("%-10s",b);
            JOptionPane.showMessageDialog(null,"År | Pengar \n" + i +"   |"+Resultat);
            i++;
        }

        return i;
    }
    public static String uppg4(){
        String[] TipArr = {("1"),("X"),("2")};
        int i = 1;

        while (i < 14){
            System.out.println(i);
            System.out.println("rad "+i+(Math.random()));
            i++;
        }
        return null;
    }
    public static String uppg5(){
        System.out.println("en text pls");
        Scanner tgb = new Scanner(System.in);
        String txt = (tgb.nextLine());
        int i = 1;
        String[] word = {(" ")};

        while (i < txt.length()){
            i++;
        }
        System.out.println(i);

        return null;
    }











}
