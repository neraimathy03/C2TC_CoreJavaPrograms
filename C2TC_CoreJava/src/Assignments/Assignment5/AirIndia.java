package Assignments.Assignment5;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // ✅ Default constructor
    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // ✅ Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // ✅ Must implement interface methods
    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}
