package Chapter6;
/*
write a class that create instant rectangle class to find the total area
of two rooms in a house
 */
public class HomeAreaCalculator {
    public static void main(String args[]){

        /******************
         * Rectangle 1
         *****************/
        //create instance for rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        /******************
         * Rectangle 2
         *****************/
        //create instant for rectangle 2
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("The area is " + totalArea);
    }
}
