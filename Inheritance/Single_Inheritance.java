//parent class or superclass
class Animal {
   void eat(){
    System.out.println("this animal eat food");
   }
   void sleep(){
    System.out.println("this animal sleep");
   }
}
class Dog extends Animal{
    void bark(){
       System.out.println("dog will bark" );
    }
}
public class Hello{
   public static void main (String args[]){
   Animal myobj=new Animal();
   myobj.eat();
   Dog myobj1=new Dog();
   myobj1.bark(); //child class method
   myobj1.sleep(); //parent class method
   }
}
