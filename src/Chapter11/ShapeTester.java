package Chapter11;

public class ShapeTester {
    public static void main ( String args[]){
        Shape rectangle = new Rectangle(5,9);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
