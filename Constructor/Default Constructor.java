public class Hello {
   String name;
   int age;
   //default constuctor
   public Hello(){
    name="saloni";
    age=10;
   }

   void show(){
    System.out.println("Name is equal to = "+name);
    System.out.println("Age is equal to = "+age);
   }
   public static void main (String args[]){
    Hello h1=new Hello();
    h1.show();
   }
}
