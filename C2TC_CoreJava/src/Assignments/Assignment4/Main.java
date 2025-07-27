package Assignments.Assignment4;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Shubh", 5000);
        Account acc2 = new CheckingAccount("Deep", 2000);

        Transaction transaction = new Transaction();

        // Perform transactions
        transaction.performTransaction(acc1, "deposit", 1000);
        transaction.performTransaction(acc1, "withdraw", 2000);

        transaction.performTransaction(acc2, "deposit", 500);
        transaction.performTransaction(acc2, "withdraw", 3000);

        // Display balances
        System.out.println("\nFinal Balances:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        // Show total accounts
        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}

