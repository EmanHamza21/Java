package Chapter5;
/*
write a method that asks the user for their name
and then greet them by name
 */

import java.util.Scanner;

public class TheUserName {
    public static void main(String args[]) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        greetUser(Name);
    }

    public static void greetUser (String Name){
        System.out.println("Hi there, " + Name);

    }
}
