package Chapter13;
/*
create a new file
Handle exceptions that may occure
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String args[]) throws Exception{
        createNewFile();
        numbersExceptionHandling();
        createNewFileReThrow();
    }
    public static void createNewFile(){
     File file = new File("resources/nonexistent.txt");
     try {
         file.createNewFile();
     } catch (Exception e){
         System.out.println("Directory doesn't exist");
         e.printStackTrace();
     }
    }

    public static void createNewFileReThrow() throws Exception {
        File file = new File("resources/nonexistent.txt");

            file.createNewFile();

        }


    public static void numbersExceptionHandling(){
        File file = new File("resources/nonexistent.txt");
           Scanner fileReader = null;
       try{
           fileReader = new Scanner(file);

           while (fileReader.hasNext()){
               double num = fileReader.nextDouble();
               System.out.println(num);
           }
       }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
       }finally {
           fileReader.close();
       }
    }
}
