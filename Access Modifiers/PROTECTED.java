Hello.java

public class Hello {
    public int publicVariable;
    private int privatevariable; //private variable
    protected int protectedVariable;//protected variable
    public void  publicMethod(){
        System.out.println("This is a public method");
    }
    //private method 
    private void privateMethod(){
        System.out.println("This is a private method");
    }
     //protected method 
    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }
     public static void main(String[] args) {
        //object creatation
        Hello obj=new Hello();
        obj.privateMethod();//private method is accesible inside a class only
     }
}


Rectangle.java
public class Rectangle extends Hello{
    //to accessing public method and attributes 
    public static void main(String[] args) {
        //creating an instance 
        Hello h1=new Hello();
        h1.publicMethod();
        Rectangle r1=new Rectangle();
        r1.protectedMethod();//derived access 
    }  
}
