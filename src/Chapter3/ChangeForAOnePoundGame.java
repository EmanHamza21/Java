package Chapter3;
/*
homework
 */

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ChangeForAOnePoundGame {
    public static void main(String args[]){
       int OnePound = 1;
       double penny = .01;
       double shilling = .05;
       double riyals =.2;
       double quarter = .25;

       //Ask the user how many pennies they have
        System.out.println("How many pennies do you have?");
        Scanner scanner = new Scanner(System.in);
        int NumOfPennies = scanner.nextInt();

        //Ask the user how many shilling they have
        System.out.println("How many half shilling do you have?");
        int NumOfShilling =scanner.nextInt();

        //Ask the user how many riyals they have
        System.out.println("How many riyals do you have?");
        int NumOfRiyals =scanner.nextInt();

        System.out.println("How many quarters do you have?");
        int NumOfQuarter =scanner.nextInt();
        scanner.close();

        double total =NumOfPennies*penny + NumOfShilling*shilling +NumOfRiyals*riyals +NumOfQuarter*quarter;

        if(total < OnePound){
            double Short = OnePound - total;
            System.out.println("It's less than one pound by  " + Short);
        }
        else if (total > OnePound){
            double over = total - OnePound;
            System.out.println("It's more than one pound by  " + over);
        }
        else{
            System.out.println("Congrats! You won one pound");
        }







    }
}
