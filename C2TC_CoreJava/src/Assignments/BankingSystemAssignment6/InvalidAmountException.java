package Assignments.BankingSystemAssignment6;

public class InvalidAmountException extends Exception{

	/**
	 * Custom Exception:
	 * Thrown when the deposit or withdrawal amount is zero or negative.
	 */
	    public InvalidAmountException(String message) {
	        super(message);
	    }
	}


