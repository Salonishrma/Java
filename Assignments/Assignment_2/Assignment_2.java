// Interface define
interface Shape {
    double calculate_Area();
    double calculate_Perimeter();
}

// Class  Circle implement Shape interface
class Circle implements Shape {
    private double r;

    // Constructor calling
    public Circle(double r) {
        this.r = r;
    }

    // methods of Shape interface
    @Override
    public double calculate_Area() {
        return Math.PI * r * r;
    }

    @Override
    public double calculate_Perimeter() {
        return 2 * Math.PI * r;
    }
}

// Class  Rectangle implement Shape interface
class Rectangle implements Shape {
    private double l;
    private double w;

    // Constructor
    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    // Implementing methods of Shape interface
    @Override
    public double calculate_Area() {
        return l * w;
    }

    @Override
    public double calculate_Perimeter() {
        return 2 * (l + w);
    }
}

// Main class that represent dependency injection
public class Assignment_2 {
    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        System.out.println("Area of Cricle is  : " + circle.calculate_Area());
        System.out.println("Perimeter of Circle is : " + circle.calculate_Perimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area of Rectangle : " + rectangle.calculate_Area());
        System.out.println("Perimeter of Rectangle : " + rectangle.calculate_Perimeter());
    }
}


