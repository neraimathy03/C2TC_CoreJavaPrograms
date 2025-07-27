package Assignments.Assignment4;

public class Transaction {

    // Final variable → fixed transaction fee
    private final double transactionFee = 10.0;

    // Final method → cannot be overridden
    public final void performTransaction(Account account, String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type!");
            return;
        }

        // Deduct transaction fee
        account.withdraw(transactionFee);
        System.out.println("Transaction fee of " + transactionFee + " deducted.");
    }
}

