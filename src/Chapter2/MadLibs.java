package Chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]) {

        //1.Ask the user what season of the year
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();


        //2.Ask the user the whole number
        System.out.println("Enter the whole number");
        int number = scanner.nextInt();

        //3.Ask the user for the adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4.Display the results
        System.out.println("On a " + adjective +  season +" day,I drink a minimum of " + number + " cups of coffee.");

    }
}

