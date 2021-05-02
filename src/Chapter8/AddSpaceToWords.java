package Chapter8;

public class AddSpaceToWords {
    public static void main (String args []){
        addSpace("MyNameIsImanHamza");
    }
    public static void addSpace(String text){
        var modifiedText = new StringBuilder(text);
        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.print(modifiedText);
    }
}
