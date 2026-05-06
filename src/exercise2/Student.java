package exercise2;
public class Student extends Person {

    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("[INIT] Student profile completed with grade: " + grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        System.out.println("[UPDATE] Grade changed: " + this.grade + " -> " + grade);
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 10;
    }

    public String getStatusMessage() {
        return isPassed() ? "Result: SUCCESS (Passed)" : "Result: FAILURE (Not Passed)";
    }

    public String toString() {
        return super.toString() +
               "\n--- STUDENT DETAILS ---\n" +
               "Grade  : " + grade + "\n" +
               getStatusMessage() + "\n" +
               "------------------------";
    }
}