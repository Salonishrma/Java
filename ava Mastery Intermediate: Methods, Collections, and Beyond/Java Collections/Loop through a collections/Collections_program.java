import java.util.ArrayList;
import java.util.Iterator;

public class Collections_program {

    //iterator
    //make a collection
    public static void main (String[]args){
    ArrayList<String>fruits=new ArrayList<String>();
    fruits.add("Apple");
     fruits.add("Mango");
      fruits.add("Kiwi");
       fruits.add("Grapes");
        fruits.add("Orange");

        //getting an iterator method
        Iterator<String>it=fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
