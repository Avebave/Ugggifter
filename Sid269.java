package Ugggifter;

import java.util.Arrays;
import java.util.Scanner;

public class Sid269 {
    public static void main(String[] args) {
        System.out.println("Vilken uppgift?");//brukar ha en sådan här för att kunna ha alla uppgifter i samma kod
        Scanner tgb = new Scanner(System.in);
        int uppg = Integer.parseInt((tgb.nextLine()));
        if (uppg == 1) {
            uppg1();
        }

    }

    public static int[] uppg1() {
        int [] Nummer = new int[1000];
        int i = 0;
        System.out.println("nummrerna tack");
        Scanner Scanner = new Scanner(System.in);
        String NummerStr = null;
        String NummerPrint = null;
        int loop = 1; //hade problem med att sista talet inskrivet saknades så gjorde en loop för att den inte ska sluta direkt då ctrl+d trycks
            while (loop!=0){
                if (Scanner.hasNextInt()){//för att loopen inte ska ta slut tidigt
                    loop ++;
                }

                boolean add = true; //ser till att rätt tal läggs till
                int NummerCheck = 0;
                int[] Nummermid = Arrays.copyOfRange(Nummer, 0, i); //ser till att rätt nummer kopieras
                NummerStr = Arrays.toString(Nummermid); //gör om det till string så det går lätt att jämföra mot nya tal och printas ut

                if (Scanner.hasNextInt()){
                    NummerCheck = Integer.parseInt(Scanner.nextLine());
                }

                if (NummerStr.contains("" + NummerCheck)) { //kollar om nummret finns redan
                    add = false;
                }

                if (add == true){ //lägger till nummer
                    Nummer[i] = NummerCheck;
                    i++;
                }
                NummerPrint = NummerStr;
                loop--; //avslutar loopen när ctrl+d trycks.
            }





        System.out.println(NummerPrint);
        return Nummer;
    }

    public static String uppg2; {
        String temp [];
        int i = 0;

        System.out.println("tempen tack");
        Scanner tgb = new Scanner(System.in);

    }
}
