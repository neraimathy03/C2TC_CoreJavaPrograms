package Day6.StaticVariable;

public class Employee {
    // Instance variables (outside main)
    private String name;
    private int id;

    // Static variable (shared by all objects)
    static String companyName = "TNS";

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", Company=" + companyName + "]";
    }
}
