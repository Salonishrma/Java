import java.util.LinkedList; //package importing
public class LinkedList_program {
    public static  void main(String[] args) {
        LinkedList<String>Country=new LinkedList<String>();
        Country.add("India");
        Country.add("Bhutan");
        Country.add("Nepal");
        Country.add("USA");
        Country.add("UK");
        Country.add("Australia");
        System.out.println(Country.getFirst());
        System.out.println(Country.getLast());
    }
}
