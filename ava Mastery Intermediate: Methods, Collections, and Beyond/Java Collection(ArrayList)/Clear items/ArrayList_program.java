import java.util.ArrayList; //import the arraylist library
public class ArrayList_program{
    public static  void main(String[] args) {
        //ArrayList declaration
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
        // to clear all item we can use clear()
        fruits.clear();
        System.out.println(fruits);
    }
}
