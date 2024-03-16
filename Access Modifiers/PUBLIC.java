Hello.java
public class Hello {
    public int publicVariable;

    public void publicMethod(){
        System.out.println("This is a public method");
    }
}

Rectangle.java
public class Rectangle{
    //to accessing public method and attributes 
    public static void main(String[] args) {
        //creating an instance 
        Hello h1=new Hello();
        h1.publicMethod();   
    }  
}
