package Chapter7;

import java.util.Arrays;
import java.util.Random;

/*
*Array-lesson
* Create a lottery quick pick application that'll generate
* lottery ticket with 6 random numbers between 1-69
*/
public class LotteryQuickPickSequintialSearch {
    private static final int LENGTH = 6;
    private static final int MAXPICK = 69;

    public static void main(String args[]){
     int [] ticket = generateLotteryTicket();
        Arrays.sort(ticket);
     printLotteryTicket(ticket);
    }
    public static int[] generateLotteryTicket(){
        int [] ticket = new int[LENGTH];
        Random random = new Random();
        for ( int i=0; i < LENGTH; i++){
            int randomNumber;
            /*
            Generate a random number then search to make sure it doesn't
            already exist in the array,if it does, generate and search again.
             */
            do {
                randomNumber= random.nextInt(MAXPICK )+ 1;
            } while (search (ticket , randomNumber));

            //number is unique,add it to the array.
            ticket [i] = randomNumber;
        }
        return ticket;
    }
    /**
     * this does a sequential search on the array to find a value
     * @param array this is a array to search through
     * @param numberToSearchFor this is the value to search
     * @return true if found , false if not.
     */
    public static boolean search (int [] array , int numberToSearchFor){
        //this is called the enhanced loop.it iterate through the array and each time
        //assign the current element Value.
        for (int value : array){
           if (value == numberToSearchFor){
            return true;
           }
        }
        //if we reached this point,that mean the entire array was searched
        //and the value was not found
           return false;
    }

                  /**********************
                     Binary Search
                   *********************/
    public static boolean binarySearch ( int[] array , int numberToSearchFor){
        // array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array , numberToSearchFor);
        if (index >= 0){
            return true;
        }
        else return false;
    }

    public static void printLotteryTicket (int[] ticket){
        for (int i=0; i<LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }

    }
}
