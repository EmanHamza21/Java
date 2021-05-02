package Chapter7;

import java.util.Scanner;

/*
make an array hold the textual values of the days of the week.
have the user input a number corresponding to the day of the week.
assume the 1st day is monday.
your program should input the string that represents the day of the week.
 */
public class DayOfTheWeekHW {

    public static void main(String args[]){

        //declearation of the array
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = input.nextInt();
        input.close();

        System.out.println("Corresponding day: " + week[index - 1]);
    }

}

