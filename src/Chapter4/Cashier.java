package Chapter4;
/*
The For-loop
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){

        System.out.println("Enter the number of items");
        Scanner scanner=new Scanner(System.in);
        int NumberOfItems = scanner.nextInt();

        double total =0;

        for(int i=0; i<NumberOfItems; i++){
            System.out.println("Enter the cost of the item:");
            double price =scanner.nextDouble();
            total =total+price;
        }
        scanner.close();
        System.out.println("Your total cost is  " + total);


    }
}

