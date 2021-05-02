package Chapter7;

import java.util.Random;
import java.util.Scanner;
/*
*Array-lesson
* Create a lottery quick pick application that'll generate
* lottery ticket with 6 random numbers between 1-69
*/
public class LotteryQuickPick {
    private static final int LENGTH = 6;
    private static final int MAXPICK = 69;

    public static void main(String args[]){
     int [] ticket = generateLotteryTicket();
     printLotteryTicket(ticket);
    }
    public static int[] generateLotteryTicket(){
        int [] ticket = new int[LENGTH];
        Random random = new Random();
        for ( int i=0; i < LENGTH; i++){
            ticket [i] = random.nextInt(MAXPICK) +1;
        }
        return ticket;
    }
    public static void printLotteryTicket (int[] ticket){
        for (int i=0; i<LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }

    }
}
