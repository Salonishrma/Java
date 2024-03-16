interface Flyer{
    void fly();
}
class Bird{
    void chirp(){
    System.out.println("Bird chirps");
    }
}
class sparrow extends Bird implements Flyer{
   @Override
   public void fly(){
     System.out.println("sparrow flys");
   }
}
public class Hello {
    public static void main(String args[]) {
        //creating a local instant
        sparrow obj = new sparrow();
        obj.fly();//interface and child class method
        obj.chirp();// inherited from parent
    }
}
