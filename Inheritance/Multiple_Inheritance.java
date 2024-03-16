interface Walkable{
    void walk();
}
interface Swimable{
    void swim();
}
class Ambhibian implements Walkable,Swimable{
   public void walk(){
       System.out.println("Ambhibian is walking" );
    }
     public void swim(){
       System.out.println("Ambhibian is swiming" );
    }
}
public class Hello{
   public static void main (String args[]){
   Ambhibian obj=new Ambhibian();
   obj.swim();
   obj.walk();
   }
}
