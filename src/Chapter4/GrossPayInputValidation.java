package Chapter4;

import java.util.Scanner;

/*
while loop:
the employee make $15 an hour
dont allow for over time
 */

public class GrossPayInputValidation {
    public static void main(String args[]){
        int rate = 15;
        int maxHour = 40;

        System.out.println("Enter the number of hours you work this week:");
        Scanner scanner = new Scanner(System.in);
        double weeklyHours = scanner.nextDouble();

        while (weeklyHours > maxHour){
            System.out.println("Invalidate entry.Your hours must be between 1 and 40. Try again.");
            weeklyHours=scanner.nextDouble();
        }
        scanner.close();

        //Calculate their pay
        double gross = rate * weeklyHours;
        System.out.println("Gross =  " + gross);

    }
}
