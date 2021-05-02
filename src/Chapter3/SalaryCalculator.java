package Chapter3;
/*
All salesPeople got a payment of $1000 for the week
SalesPeople who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){

        //initialize known values
        int salary = 1000 ;
        int bonus = 250 ;
        int quota = 10 ;

        //get the value for the unknown
        System.out.println("How many sales did the employee make this weak?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //quick detour for the bonus earners
        if (sales > quota){
            salary = salary + bonus ;
        }


        //output
        System.out.println("The employee's pay is $" + salary);

    }
}
