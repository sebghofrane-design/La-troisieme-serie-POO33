package exercise4;
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle created successfully");
    }

   
    public double area() {
        return Math.PI * radius * radius;
    }

    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

   
    public String toString() {
        return "----- CIRCLE -----\n" +
               "Radius   : " + radius + "\n" +
               "Area     : " + area() + "\n" +
               "Perimeter: " + perimeter() + "\n" +
               "------------------";
    }
}
