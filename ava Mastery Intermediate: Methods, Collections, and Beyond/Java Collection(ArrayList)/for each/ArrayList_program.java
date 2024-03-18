import java.util.ArrayList; //import the arraylist library
public class ArrayList_program{
    public static  void main(String[] args) {
        //ArrayList declaration
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Sapota");

        //loop through an arrayList
        for(String i:fruits){
            System.out.println(i);
        }

    }
}
