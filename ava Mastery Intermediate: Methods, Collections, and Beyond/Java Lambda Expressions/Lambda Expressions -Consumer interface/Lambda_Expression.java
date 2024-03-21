import java.util.ArrayList; //array list implematation
import java.util.function.Consumer;
public class Lambda_Expression {
    //Lambda
    public static void main(String[] args) {
      ArrayList<Integer>number=new ArrayList<Integer>();
      number.add(45);
      number.add(25);
      number.add(35);
      number.add(75);
      number.add(85);
      Consumer<Integer>myMethod=(n)->{System.out.println(n);};
      number.forEach(myMethod);
    }
}
