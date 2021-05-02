package Chapter10;

public class Banana extends Fruit {
      public Banana(){
          setCalories(70);
      }

      public void peel(){
         System.out.println("Juice is peeled!");
      }
    public void makeJuice (){
        System.out.println("This is a banana juice");
    }
}
