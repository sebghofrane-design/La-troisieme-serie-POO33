package exercise1;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        System.out.println("[BankAccount CREATED] Account for " + ownerName + " initialized with balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: +" + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: -" + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Withdraw failed: insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        System.out.println("Owner changed from " + this.ownerName + " to " + name);
        this.ownerName = name;
    }

    public void setBalance(double balance) {
        System.out.println("Balance manually updated to: " + balance);
        this.balance = balance;
    }

    public String toString() {
        return "\n--- ACCOUNT INFO ---\n" +
               "Owner: " + ownerName + "\n" +
               "Balance: " + balance + "\n" +
               "--------------------";
    }

	public static void main(String[] args) {

	}

}
