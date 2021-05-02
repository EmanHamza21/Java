package Chapter4;

import java.util.Scanner;

/*
Nested Loops
find the average test score for each student inside the class
There are 24 student and 4 tests.
 */
public class AverageTestScore {
    public static void main(String args[]){

        //initialize the known values
        int NumberOfStudent = 24;
        int NumberOfTests = 4;
        Scanner scanner=new Scanner(System.in);

        for(int i=0; i<NumberOfStudent; i++){

            double Total =0;
            for(int j=0; j<NumberOfTests; j++){
                System.out.println("Enter the score of test # "+ (j+1));
                double score = scanner.nextDouble();
                Total = Total+score;
            }
            double Average = Total/NumberOfTests;
            System.out.println("Your average for student #" + (i+1) +     "is"   +  Average);
        }
        scanner.close();



    }
}
