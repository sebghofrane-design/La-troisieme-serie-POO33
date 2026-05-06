package exercise4;
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle created successfully");
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "----- RECTANGLE -----\n" +
               "Length   : " + length + "\n" +
               "Width    : " + width + "\n" +
               "Area     : " + area() + "\n" +
               "Perimeter: " + perimeter() + "\n" +
               "---------------------";
    }
}
