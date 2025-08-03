package Assignments.BankingSystemAssignment6;

public class InsufficientFundsException extends Exception {
	/**
	 * Custom Exception:
	 * Thrown when the withdrawal amount is greater than the available balance.
	 */
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}

