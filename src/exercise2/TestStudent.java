package exercise2;
public class TestStudent {

    public static void main(String[] args) {

        System.out.println("========== STUDENT SYSTEM TEST ==========");

        System.out.println("\n[STEP 1] Creating student...");
        Student s = new Student("Ali", 20, 8.5);

        System.out.println("\n[STEP 2] Display initial information:");
        System.out.println(s);

        System.out.println("\n[STEP 3] Checking result manually:");
        System.out.println(s.getStatusMessage());

        System.out.println("\n[STEP 4] Updating grade...");
        s.setGrade(13.5);

        System.out.println("\n[STEP 5] Display updated information:");
        System.out.println(s);

        System.out.println("\n[FINAL] Test completed successfully");
    }
}