Hello.java
public class Hello {
    public void fun1(){ 
      System.out.println("HAr HAr mahadev");  
    }
    public void fun2(int var){ 
      System.out.println("value is given : "+var);  
    }
}

Rectangle.java
public class Rectangle{
    public static void main(String[] args) {
        Hello h1=new Hello();
        h1.fun1();
        h1.fun2(9);
    }  
}
