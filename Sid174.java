package Ugggifter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sid174 {


    public static void main (String[]args){
        int jag =0;
        while (jag == 0){
            System.out.println("behöver du veta dag/klocka?, j eller n");
            Scanner tgb = new Scanner(System.in);
            String K = (tgb.nextLine());
            String j = "j";

            if (K.equals("j")) {
                IfKlocka();

            }

        }

    }

    public static String Klocka(){

        String Format = "yyyy/MM/dd HH:mm:ss";
        Date dd = Calendar.getInstance().getTime();
        DateFormat DF = new SimpleDateFormat(Format);
        String kalle = DF.format(dd);
        System.out.println(kalle);
        return kalle;
        //den korta versionen
    }

    public static String IfKlocka() {
        String tid = Calendar.getInstance().getTime().toString();
        String Månad = null;
        String[] MånArray = {("Jan"), ("Feb"), ("Mar"), ("Apr"), ("May"), ("Jun"), ("Jul"), ("Aug"), ("Sep"), ("Oct"), ("Nov"), ("Dec")};
        //dessa är för att identifiera vilken månad det är

        String år = tid.substring(24, 28);
        String dag = tid.substring(8, 11);
        //substrings som plackar ut respektive år

        for (int i = 0; i < 12 ; i++) {
            if (tid.contains(MånArray[i])){
                if (i < 10) {
                    Månad = "0" + (i+1);
                }

                else {
                    Månad = ""+(i+1);
                }
            }


        }
        //en for-loop för att konvertera månad till två siffror

        String DagensDatum = år+"/"+Månad+"/"+dag;
        System.out.println(DagensDatum);
        //lägger ihop allt till rät format och printar det
        return DagensDatum;
    }





}
