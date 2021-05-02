package Chapter10;

public class Apple extends Fruit {
    public Apple() {
        setCalories(90);
    }

    public static void removeSeeds() {
    System.out.println("Seed is removed!");
    }

    @Override
    public void makeJuice() {
        System.out.println("This is an apple juice");
    }
}
