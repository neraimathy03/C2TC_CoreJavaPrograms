package Day3.ScannerDemo;

public class Person {
    // ✅ Data members — at class level
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // ✅ Getter and Setters
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ✅ toString method
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }

    // ✅ main method — only for creating & testing Person object
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Brainy");
        p.setIncome(500000);
        p.setGender("Female");
        p.setAge(21);
        p.setTax(50000);

        System.out.println(p);
    }
}


