package Chapter5;

import java.util.Scanner;

/*
Variable scope
write a program that approve any one who makes more than $25,000
and has a credit score of $700 or better
reject all other
 */
public class InstantCreditCheck {
    public static void main(String args[]){
        //write what we know
        int requiredSalary = 25000;
        int creditScore = 700;

        //get what we dont know
        System.out.println("Enter your salary:");
        Scanner scanner= new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter your credit score:");
        double score =scanner.nextDouble();

        //check if the user qualified
        if(salary < requiredSalary && score < creditScore){
            System.out.println("Sorry! You are not qualified.");
        }
        else if(salary >= requiredSalary && score >= creditScore ){
            System.out.println("Yea! You are approved.");
        }
        else{
            System.out.println("You are rejected.");
        }
        scanner.close();
        //notify the user


    }
}
