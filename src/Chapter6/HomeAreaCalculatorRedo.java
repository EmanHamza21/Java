package Chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static void main(String args[]){
        /*
        #Instatiating objects
        ClassName Name = new ClassName();
         */
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle Kitchen = calculator.getRoom();
        Rectangle BathRoom =calculator.getRoom();
        double area = calculator.calculateTotalArea (Kitchen , BathRoom);
        System.out.println("The total area = " + area);
    }
    public Rectangle getRoom(){
        System.out.println("Enter the length:");
        Scanner scanner =new Scanner(System.in);
        double length = scanner.nextDouble();

        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    }
    /*
    #Parts of a method
    public static int calculateSum(int number1 , int number2){
    int sum =number1 + number 2
    return sum;
    }
     */
    public double calculateTotalArea (Rectangle rectangle1 , Rectangle rectangle2 ){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
