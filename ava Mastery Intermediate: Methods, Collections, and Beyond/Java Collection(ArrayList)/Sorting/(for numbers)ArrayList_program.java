import java.util.ArrayList; //import the arraylist library
import java.util.Collections;
public class ArrayList_program{
    public static  void main(String[] args) {
        //ArrayList declaration
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Sapota");
        //collection of items  for applying for sort()
        Collections.sort(fruits);
        for(String i:fruits){
            System.out.println(i);
        }
        ArrayList<Integer>number = new ArrayList<Integer>();
        number.add(30);
        number.add(90);
        number.add(130);
        number.add(20);
        Collections.sort(number);
        for(int i:number){
            System.out.println(i);
        }
    }
}
