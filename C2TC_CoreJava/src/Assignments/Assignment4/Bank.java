package Assignments.Assignment4;

public class Bank {
    // Static variable to track total accounts
    private static int totalAccounts = 0;

    // Increment total accounts whenever a new account is created
    public static void incrementAccounts() {
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

