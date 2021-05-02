package Chapter9;

public class Rectangle {
    protected double lenght;
    protected double width;
    protected double sides = 4;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePramete(){
        return (2*lenght)+(2*width);
    }
    public void print(){
        System.out.println("Iam a rectangle");
    }
}
