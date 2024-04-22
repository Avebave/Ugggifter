package Ugggifter;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Yatzy30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många ska spela?");
        int Spelare = scanner.nextInt();
        if (Spelare == 1){
            OnePlayer();
        }
        if (Spelare <= 6 && Spelare >= 2){
            MorePlayer();
        }
        
    }


    public static int OnePlayer() { //all infor står i MorePlayer då det finns mer kod där
        int score1 = 30;
        int score2 = 30;


        Scanner scanner = new Scanner(System.in);
        while (score1 > 0 && score2 > 0){
            int sum = 0;
            int[] tärningar = new int[6];
            int[] spar = new int [6];
            int sparpl = 0;
            int Avsl = 1;
            for(int tärning = 6; tärning > 0;){
                Avsl = 1;

                for (int i = 0;i < tärning;) {
                    tärningar[i] = Tärning();
                    i++;
                }
                int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
                String TärningStr = Arrays.toString(Resultat);
                System.out.println(TärningStr);

                System.out.println("Välj en tärning att spara");
                int önsvärde = Integer.parseInt(scanner.nextLine())-1;

                spar[sparpl] = tärningar[önsvärde];
                sparpl++;
                tärning--;
                TärningStr = Arrays.toString(spar);
                System.out.println(TärningStr);

                if (tärning == 0){
                    Avsl = 0;
                }

                while (Avsl != 0){
                    System.out.println("skriv 0 du inte vill ha en till tärning, annars skriv annan siffra");

                    Avsl = Integer.parseInt(scanner.nextLine());



                    if(Avsl == 0){
                        System.out.println("nya tärningar");
                    }
                    else{
                        Resultat[önsvärde] = 0;
                        TärningStr = Arrays.toString(Resultat);
                        System.out.println(TärningStr);

                        System.out.println("Välj en tärning att spara");
                        önsvärde = Integer.parseInt(scanner.nextLine())-1;

                        spar[sparpl] = tärningar[önsvärde];
                        sparpl++;
                        tärning--;
                        TärningStr = Arrays.toString(spar);
                        System.out.println(TärningStr);
                    }

                    if (tärning == 0){
                        Avsl = 0;
                    }


                }
            }

            for (int a =0; a < 6;){
                sum = sum + spar[a];
                a++;
            }
            System.out.println("Din total är " + sum);

            if (sum < 30){
                sum = sum - 30;
                score1 = score1 + sum;
                System.out.println("Din score är nu "+score1);

            }
            if (sum > 30){
                sum = sum - 30;
                if (sum == 1){
                    score2 = score2 - Attack_1();
                    System.out.println("motsåndarens score är " + score2);
                }
                if (sum == 2){
                    score2 = score2 - Attack_2();
                    System.out.println("motsåndarens score är " + score2);
                }
                if (sum == 3){
                    score2 = score2 - Attack_3();
                    System.out.println("motsåndarens score är " + score2);
                }
                if (sum == 4){
                    score2 = score2 - Attack_4();
                    System.out.println("motsåndarens score är " + score2);
                }
                if (sum == 5){
                    score2 = score2 - Attack_5();
                    System.out.println("motsåndarens score är " + score2);
                }
                if (sum == 6){
                    score2 = score2 - Attack_6();
                    System.out.println("motsåndarens score är " + score2);
                }
            }
        }
        return 0;
    }
    public static int MorePlayer(){
        String[] spelare = new String[6]; //array för alla spelare
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sry jag glum, hur många ska spela?");
        int U = scanner.nextInt();
        System.out.println("Vilka spelar?");

        for (int i = 0; i<U;i++){
            spelare[i] = scanner.next();
        }

        String[] Spelare = Arrays.copyOfRange(spelare,0,U);
        String spelarStr = Arrays.toString(Spelare);
        System.out.println(spelarStr);

        int[] SpelarScore = new int[U];
        Arrays.fill(SpelarScore, 30); // Ger alla spelare 30 i score

        int PlayerTurn = -1;
        int GameStop = 0;
        int GameStopCheck = 0;


        while (GameStop==0){
            int Avsl = 1;
            int sparpl = 0;
            int sum = 0;
            int[] tärningar = new int[6];
            int[] spar = new int [6];


            PlayerTurn++;
            if(PlayerTurn>(U-1)){
                PlayerTurn = 0;
            } //Ändrar vems tur det är
            if(1 > SpelarScore[PlayerTurn]){ //skippar rundan på dem som är ute

            }
            else {
                System.out.println("Nu är det "+spelare[PlayerTurn]+"'s tur");
                for(int tärning = 6; tärning > 0;){ //en vanlig tur
                    Avsl = 1;

                    for (int i = 0;i < tärning;i++) {
                        tärningar[i] = Tärning();
                    }
                    int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
                    String TärningStr = Arrays.toString(Resultat);
                    System.out.println(TärningStr);

                    System.out.println("Välj en tärning att spara");
                    int önskVärde = Integer.parseInt(scanner.next())-1; //tärningen som ska sparas

                    spar[sparpl] = tärningar[önskVärde];
                    sparpl++;
                    tärning--;
                    TärningStr = Arrays.toString(spar);
                    System.out.println(TärningStr);

                    if (tärning == 0){
                        Avsl = 0;
                    }

                    while (Avsl != 0){ //den här loopen är efter man valt första tärningen
                        System.out.println("skriv 0 du inte vill ha en till tärning, annars skriv annan siffra");

                        Avsl = Integer.parseInt(scanner.next());



                        if(Avsl == 0){
                            System.out.println("nya tärningar");
                        }
                        else{
                            Resultat[önskVärde] = 0;
                            TärningStr = Arrays.toString(Resultat);
                            System.out.println(TärningStr);

                            System.out.println("Välj en tärning att spara");
                            önskVärde = Integer.parseInt(scanner.next())-1;

                            spar[sparpl] = tärningar[önskVärde];
                            sparpl++;
                            tärning--;
                            TärningStr = Arrays.toString(spar);
                            System.out.println(TärningStr);
                        }

                        if (tärning == 0){
                            Avsl = 0;
                        }


                    }
                }

                for (int a =0; a < 6;){ //räknar ut totala poäng
                    sum = sum + spar[a];
                    a++;
                }
                System.out.println("Din total är " + sum);

                if (sum < 30){ //tar bort från sin egna score
                    sum = sum - 30;
                    SpelarScore[PlayerTurn] = SpelarScore[PlayerTurn] + sum;
                    System.out.println("Din score är nu "+SpelarScore[PlayerTurn]);

                }
                if (sum > 30){ //attackera någon annan
                    System.out.println("Vem vill du attackera?");
                    System.out.println(spelarStr);
                    int Target = Integer.parseInt(scanner.next())-1;//den övre delen är för att välja en att attackera

                    sum = sum - 30;//för att få scoren till 1-6
                    if (sum == 1){//ett exempel på hur attack saken ser ut
                        SpelarScore[Target] = SpelarScore[Target] - Attack_1();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                    if (sum == 2){
                        SpelarScore[Target] = SpelarScore[Target] - Attack_2();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                    if (sum == 3){
                        SpelarScore[Target] = SpelarScore[Target] - Attack_3();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                    if (sum == 4){
                        SpelarScore[Target] = SpelarScore[Target] - Attack_4();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                    if (sum == 5){
                        SpelarScore[Target] = SpelarScore[Target] - Attack_5();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                    if (sum == 6){
                        SpelarScore[Target] = SpelarScore[Target] - Attack_6();
                        System.out.println("motsåndarens score är " + SpelarScore[Target]);
                    }
                }
            }


            GameStopCheck = 0;
            for (int i = 0;i<U;i++){//kollar hur många som har kvar score
                if (SpelarScore[i]<=0){
                    GameStopCheck++;
                }
                if (GameStopCheck == (U-1)){ //stoppar om det bara är en kvar
                    GameStop=1;
                }
            }
        }


        return 0;
    }


    public static int Tärning() { //metod för tärning
            Random random = new Random();
            int tärning = 0;
            tärning = random.nextInt(6);
            int tal = tärning + 1;
            return tal;
    }
    public static int Attack_1() {//exempel på attack, bara 2 värden byts ut beroende vilken siffra man vill ha.
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int i = 0;i < tärning;i++){
                if (tärningar[i] == 1){ //kollar om tärningen är det jag letar efter, ändras utifrån vad jag söker
                    tärning--;
                    RättTärn++;
                }
            }

            if (FelCheck == RättTärn){ //kollar om det är 0 Rätta tärningar, isånnafall tar bort alla tärningar för framtida slag
                tärning = 0;
            }
            FelCheck = RättTärn; //gör om felCheck till nuvarande antalet rätta tärningar
        }
        sum = RättTärn * 1;//här gångrar den antalet rätta tärningar med talet jag letar efter, ändras beroende på vad jag söker
        System.out.println(sum);

        return sum;
    }
    public static int Attack_2() {
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int a = 0;a < tärning;){
                if (tärningar[a] == 2){
                    tärning--;
                    RättTärn++;
                }
                a++;


            }
            if (FelCheck == RättTärn){
                tärning = 0;
            }
            FelCheck = RättTärn;
        }
        sum = RättTärn * 2;
        System.out.println(sum);

        return sum;
    }
    public static int Attack_3() {
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int a = 0;a < tärning;){
                if (tärningar[a] == 3){
                    tärning--;
                    RättTärn++;
                }
                a++;

            }
            if (FelCheck == RättTärn){
                tärning = 0;
            }
            FelCheck = RättTärn;
        }
        sum = RättTärn * 3;
        System.out.println(sum);

        return sum;
    }
    public static int Attack_4() {
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int a = 0;a < tärning;){
                if (tärningar[a] == 4){
                    tärning--;
                    RättTärn++;
                }
                a++;

            }
            if (FelCheck == RättTärn){
                tärning = 0;
            }
            FelCheck = RättTärn;
        }
        sum = RättTärn * 4;
        System.out.println(sum);

        return sum;
    }
    public static int Attack_5() {
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int a = 0;a < tärning;){
                if (tärningar[a] == 5){
                    tärning--;
                    RättTärn++;
                }
                a++;

            }
            if (FelCheck == RättTärn){
                tärning = 0;
            }
            FelCheck = RättTärn;
        }
        sum = RättTärn * 5;
        System.out.println(sum);

        return sum;
    }
    public static int Attack_6() {
        int sum = 0;
        int FelCheck = 0;
        int RättTärn = 0;
        for (int tärning = 6; tärning > 0;){
            int [] tärningar = new int[6];

            for (int i = 0;i < tärning;) {
                tärningar[i] = Tärning();
                i++;
            }
            int[] Resultat = Arrays.copyOfRange(tärningar, 0, tärning);
            String TärningStr = Arrays.toString(Resultat);
            System.out.println(TärningStr);

            for (int a = 0;a < tärning;){
                if (tärningar[a] == 6){
                    tärning--;
                    RättTärn++;
                }
                a++;

            }
            if (FelCheck == RättTärn){
                tärning = 0;
            }
            FelCheck = RättTärn;
        }
        sum = RättTärn * 6;
        System.out.println(sum);

        return sum;
    }
}