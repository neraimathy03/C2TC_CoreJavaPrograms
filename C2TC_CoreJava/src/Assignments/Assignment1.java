package Assignments;

public class Assignment1 {

    // Instance variables
    String name;
    int age;
    int rollNumber;

    // Main method
    public static void main(String[] args) {
        // Create object of Assignment1
        Assignment1 student = new Assignment1();

        // Assign values
        student.name = "Brainy";
        student.age = 20;
        student.rollNumber = 101;

        // Call display method
        student.display();
    }

    // Method to display student details
    public void display() {
        System.out.println("Enter student details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}
