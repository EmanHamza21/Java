package Chapter3;
/*
nested if statement
To qualify for a loan, a person must make at least $30,000
and have been working at their current job at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {

        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter years of employment:");
        double years = scanner.nextDouble();
        scanner.close();

        //make decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
                System.out.println("Congrats! You're qualified to take a loan");
        }
        else {
            System.out.println("Sorry! You're not qualified for the loan you must make at least  $ "
                    + requiredSalary  );
        }

    }

    }
