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
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

    }
}
