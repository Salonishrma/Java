abstract class Shape {
    // abstract method (no implementation)
    public abstract void draw();

    // concrete method (having actual implementation)
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }

    // abstract method
    protected abstract double calculateArea();
}

//concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }
}

//subclass implementation
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    protected double calculateArea() {
        return length * width;
    }
}

public class Hello {

    public static void main(String[] args) {
        //creating an instance or object
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(4, 6);

        //using abstract class reference
        Shape shape = circle;
        Shape shape1 = rectangle;

        //calling an abstract method
        shape.draw();
        shape.displayArea();
        shape1.draw();
        shape1.displayArea();
    }
}
