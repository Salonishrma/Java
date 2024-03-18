import java.util.ArrayList; //import the arraylist library
public class ArrayList_program{
    public static  void main(String[] args) {
        //ArrayList declaration
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
       //change items inside arraylist using set() method
        fruits.set(3,"Strawberry");
        System.out.println(fruits);
    }
}
