package Assignments.BankingSystemAssignment6;

public class BankAccount {

	/**
	 * BankAccount class simulates a basic bank account with:
	 * - accountNumber (int)
	 * - balance (double)
	 *
	 * Methods:
	 *  deposit()  -> Adds money to account
	 *  withdraw() -> Deducts money from account
	 *  displayBalance() -> Prints current balance
	 *
	 * Custom Exceptions are used to make the program more reliable
	 * by preventing invalid transactions.
	 */
	    private int accountNumber;
	    private double balance;

	    //  Parameterized constructor
	    public BankAccount(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    /** Deposit method */
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be greater than 0.");
	        }
	        balance += amount;
	        System.out.println("Deposited: ₹" + amount);
	    }

	    /** Withdraw method */
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds. Available balance: ₹" + balance);
	        }
	        balance -= amount;
	        System.out.println(" Withdrawn: ₹" + amount);
	    }

	    /** Display current balance */
	    public void displayBalance() {
	        System.out.println(" Current Balance: ₹" + balance);
	    }
}
