package exercise3;
public class TestEmployee {

    public static void main(String[] args) {

        System.out.println("===== EMPLOYEE / MANAGER TEST START =====");

        Manager m = new Manager("ghofrane", 5000, 1200);

        System.out.println();
        System.out.println("DISPLAY MANAGER DATA:");
        System.out.println(m);

        System.out.println();
        System.out.println("UPDATING VALUES...");

        m.setName("ghofrane Updated");
        m.setSalary(5500);
        m.setBonus(1500);

        System.out.println();
        System.out.println("UPDATED DATA:");
        System.out.println(m);

        System.out.println("TOTAL SALARY CALCULATION: " + m.getTotalSalary());

        System.out.println("===== TEST END =====");
    }
}
