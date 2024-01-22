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
                Klocka();

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
    }



}
