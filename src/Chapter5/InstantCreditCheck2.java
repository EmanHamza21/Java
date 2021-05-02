package Chapter5;

import java.util.Scanner;

/*
Variable scope
write a program that approve any one who makes more than $25,000
and has a credit score of $700 or better
reject all other
 */
public class InstantCreditCheck2 {
    static int requiredSalary = 25000;
    static int creditScore = 700;
    static Scanner scanner= new Scanner(System.in);

    public static void main(String args[]) {
        double score = getScore();
        double salary = getSalary();
        scanner.close();
        boolean qualified = isUSerQualified(salary , score);
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary =scanner.nextDouble();
        return salary;
    }
    public static double getScore(){
        System.out.println("Enter your credit score:");
        double score =scanner.nextDouble();
        return score;
    }
    public static boolean isUSerQualified(double salary , double score) {
        if (salary >= requiredSalary && score >= creditScore) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser (boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! you've been approved");
        }
        else{
            System.out.println("Sorry! you're not qualified");
        }
    }
}
