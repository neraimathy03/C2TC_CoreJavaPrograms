package Assignments.Assignment3;
import java.util.Scanner;

public class Commission {
	// Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Accept employee details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Calculate and print commission
    public void calculateCommission() {
        double commission;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Commission Details ---");
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: ₹" + salesAmount);
        System.out.println("Commission: ₹" + commission);
    }

    // Main method to test
    public static void main(String[] args) {
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }

}
