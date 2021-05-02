package Chapter3;
/*
if else statement
All sales people are expected to make at least 10 sales each week.
For those who do,they receive a congratulation message.
For those who don't, they are informed of how many sales they were sort.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String args[]){

        //initialize value we know
        int quota = 10;

        //get unknown value
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int Sales = scanner.nextInt();
        scanner.close();

        //make a decision path to take - output
        if (Sales >= quota){
            System.out.println("Congrats! You have met your quota");
        }
        else {
            int salesShort = quota - Sales;
            System.out.println("You didn't make your quota, you were " +  salesShort  +  "sales short");

        }

    }
}
