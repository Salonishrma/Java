import java.util.HashSet;
public class HashSet_program {
    public static  void main(String [] args){
        //creating hashSet
     HashSet<String>sports=new HashSet<String>();
     sports.add("Football");
     sports.add("Tennis");
     sports.add("Cricket");
     sports.add("Cricket");
     sports.add("Badminton");
     System.out.println(sports.size());
    }
}
