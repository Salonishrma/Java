interface Shape2{
    double  area();
    void display();
}
//implementation the shape2 interface in this class 
class Circle2 implements  Shape2{
    double radius;
    // constructor creation
    public Circle2(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
          return Math.PI * radius * radius;
    }
    @Override
     public void display(){
            System.out.println("this is circle");
    }
}
public class Interface_program{
   
    public static void main(String[] args){
    Circle2 circle=new Circle2(5);
    System.out.println("Area of ctrclee=  " + circle.area());
    circle.display();
    }
}
