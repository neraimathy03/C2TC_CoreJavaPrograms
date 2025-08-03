package Day8.Abstraction;

public class Rectangle extends Shape {
    private float length, width;

    public Rectangle() {
        length = 5.0f;
        width = 3.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calArea() {
        area = length * width;
    }
}
