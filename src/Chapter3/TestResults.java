package Chapter3;
/*
The if-else-if statement
 */

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){

        //get the test results
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //determine the letter grade
        char grade;

        if (score < 60){
            grade = 'F';
        }
        else if (score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'c';
        }
        else if (score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is  " + grade);

    }
}
