import java.lang.IllegalArgumentException;
public class Error_Handling {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied:you must 18 years old to process.");
        }
        else{
            System.out.println("Access Granted.");
        }
    }
    //try - catch block of coding

    public static void main(String[] args){
       try{
           int age=-5;
           if(age<0){
               throw new IllegalArgumentException("Age cannot be negative");
           }
           System.out.println("Your age is "+age);
       }
       catch (IllegalArgumentException e){
           System.out.println("Exception occured."+e.getMessage());
       }
    }
}
