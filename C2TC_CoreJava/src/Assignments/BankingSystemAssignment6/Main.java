package Assignments.BankingSystemAssignment6;

public class Main {
	/**
	 * Demonstrates deposit and withdrawal operations
	 * with proper exception handling.
	 */
	    public static void main(String[] args) {

	        //  Create a BankAccount object
	        BankAccount account = new BankAccount(101, 5000);

	        try {
	            System.out.println("---- Deposit Operation ----");
	            account.deposit(2000); // Valid deposit
	            account.displayBalance();

	            System.out.println("\n---- Invalid Deposit ----");
	            account.deposit(-500); //  Invalid deposit

	        } catch (InvalidAmountException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("Deposit process completed.\n");
	        }

	        try {
	            System.out.println("---- Withdraw Operation ----");
	            account.withdraw(3000); // Valid withdrawal
	            account.displayBalance();

	            System.out.println("\n---- Invalid Withdrawal ----");
	            account.withdraw(10000); // Insufficient funds

	        } catch (InvalidAmountException | InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("Withdrawal process completed.");
	        }
	   }
}

