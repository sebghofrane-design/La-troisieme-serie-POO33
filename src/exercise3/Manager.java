package exercise3;
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Manager created successfully");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        System.out.println("Bonus updated from " + this.bonus + " to " + bonus);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public String toString() {
        return "===== MANAGER INFO =====\n" +
               "Name         : " + getName() + "\n" +
               "Base Salary  : " + getSalary() + "\n" +
               "Bonus        : " + bonus + "\n" +
               "Total Salary : " + getTotalSalary() + "\n" +
               "========================";
    }
}