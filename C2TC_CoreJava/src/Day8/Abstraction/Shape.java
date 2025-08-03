package Day8.Abstraction;

public abstract class Shape {
    protected float area;

    abstract void calArea(); // Abstract method

    public void show() {
        System.out.println("Area = " + area);
    }
}
