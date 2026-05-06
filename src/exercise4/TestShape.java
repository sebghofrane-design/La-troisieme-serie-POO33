package exercise4;
public class TestShape {

    public static void main(String[] args) {

        System.out.println("===== SHAPE TEST START =====");

        Rectangle r = new Rectangle(4, 5);
        Circle c = new Circle(3);

        System.out.println();

        System.out.println("RECTANGLE DETAILS:");
        System.out.println(r);

        System.out.println();

        System.out.println("CIRCLE DETAILS:");
        System.out.println(c);

        System.out.println();

        System.out.println("MANUAL CALCULATION CHECK:");
        System.out.println("Rectangle Area = " + r.area());
        System.out.println("Circle Area    = " + c.area());

        System.out.println("===== TEST END =====");
    }
}