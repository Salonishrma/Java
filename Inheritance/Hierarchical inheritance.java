Multiple classes extended from single super classes
// shape is super class
class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
//child class of shape
class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing a circle");
    }
}
//child class of shape
class squre extends Shape{
    void drawSqure(){
        System.out.println("Drawing a squre");
    }
}
public class Hello {
    public static void main(String args[]) {
        squre obj = new squre();
        obj.drawSqure();//child class owm method
        obj.draw();// inherited from parent
    }
}
