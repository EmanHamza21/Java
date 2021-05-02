package Chapter10;

public class Fruit {

    private static int calories;
    public static int getCalories() {
        return calories;
    }
    public static void setCalories(int calories) {
        Fruit.calories = calories;
    }

    public void makeJuice (){
        System.out.println("Juice is made");
    }

}
