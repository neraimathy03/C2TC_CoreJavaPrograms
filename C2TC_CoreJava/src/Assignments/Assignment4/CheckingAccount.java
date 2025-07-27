package Assignments.Assignment4;


public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -500) { // Allow overdraft up to -500
            balance -= amount;
            System.out.println(amount + " withdrawn from Checking Account.");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit reached.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

