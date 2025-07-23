package Day3.Constructor;
import java.util.Scanner;

public class Customer {
    // Class variables
    private String name;
    private String city;
    private int cid;

    // Default constructor
    public Customer() {
        this.name = "";
        this.city = "";
        this.cid = 0;
    }

    // Parameterized constructor
    public Customer(String name, int cid, String city) {
        this.name = name;
        this.cid = cid;
        this.city = city;
    }

    // Setters
    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString() method to print Customer object
    @Override
    public String toString() {
        return "Customer ID: " + cid + "\n"
             + "Customer Name: " + name + "\n"
             + "Customer City: " + city + "\n";
    }
}

