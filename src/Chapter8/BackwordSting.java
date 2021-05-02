package Chapter8;

public class BackwordSting {
    public static void main (String args []){
        printBackWord("Iman Hamza");
    }
    public static void printBackWord(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }

    }
}
