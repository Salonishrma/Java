public class Hello {
   String name;
   int age;
   //parameterised constuctor
   public Hello(String n,int a){
    name=n;
    age=a;
   }

   void show(){
    System.out.println("Name is equal to = "+name);
    System.out.println("Age is equal to = "+age);
   }
   public static void main (String args[]){
    Hello h1=new Hello("Saloni",20);
    h1.show();
   }
}
