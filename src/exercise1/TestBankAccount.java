package exercise1;
	public class TestBankAccount {
	    public static void main(String[] args) {

	        System.out.println("BANK ACCOUNT TEST START");

	        BankAccount acc = new BankAccount("Connie Client", 1000);

	        acc.deposit(500);
	        acc.withdraw(200);
	        acc.withdraw(2000);

	        acc.setOwnerName("Updated Name");
	        acc.setBalance(3000);

	        System.out.println(acc);

	        System.out.println("TEST END");
	    }
	}
