package Chapter8;
/*
write a method that counts the number of words in a string
and print them individually on a new line.
 */

public class TextProcessor {
    public static void main(String args[]) {
        countTheWords("I Love malik so much");
    }

    public static void countTheWords (String text){
               var words = text.split (" ");
               int numberOfWords = words.length;

               String message =String.format ("Your text contain words " + numberOfWords);
               System.out.println(message);

               for (int i=0; i<numberOfWords; i++){
                System.out.println(words[i]);
      }
    }
}
