class Lion{
    void makeSound(){
        System.out.println("some sound");
    }
}
class Tiger extends Lion{
    @Override
    void makeSound(){
        System.out.println("Roar.....");
    }
}
class Horse extends Lion{
    @Override
    void makeSound(){
        System.out.println("Hurr....");
    }
}
public class Hello {
    public static void main(String args[]) {
        Lion obj=new Tiger();
        obj.makeSound();

        Lion obj1=new Horse();
        obj1.makeSound();
    }
}
