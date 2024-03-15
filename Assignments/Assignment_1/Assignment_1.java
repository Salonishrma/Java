class Vehicle{

    //Attributes
    String name;
    String color;
    int speed;

    //Constructor
    public Vehicle(String name, String color, int speed){
        this.name=name;
        this.color=color;
        this.speed=speed;
    }

    //Method
    public void Display(){
        System.out.println("Name of Vehicle is: " + name);
        System.out.println("Color of Vehicle is: " + color);
        System.out.println("Speed of Vehicle is: " + speed);
    }
}

//Derived Class
class Car extends Vehicle{
    int capacity;
    //constructor
    public Car(String name, String color, int speed,int capacity){
        super(name, color, speed);
        this.capacity=capacity;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Passengener Capacity: "+capacity);
    }
    public void on(){
        System.out.println("Happy Journey......");
    }
}
public class Assignment_1 {
    public static void main(String[] args){
        Car obj=new Car("Audi","Black",90,6);
        Car obj1=new Car("BMW","Red",100,4);
        obj.Display();
        obj1.Display();
        obj1.on();
    }
}
