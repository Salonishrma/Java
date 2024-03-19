import java.util.ArrayList;
import java.util.Iterator;

public class Collections_program {

    //iterator
    //make a collection
    public static void main (String[]args){
    ArrayList<Integer>number=new ArrayList<Integer>();
    number.add(300);
     number.add(200);
      number.add(90);
       number.add(70);
        number.add(250);

        //getting an iterator method
        Iterator<Integer>item=number.iterator();
        while(item.hasNext()){
            Integer i=item.next();
            if(i<100){
                item.remove();
            }
        }
        System.out.println(number);
    }
}
