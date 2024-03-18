public class Method_decision {
    static void checkAge(int age) {
        // if else statement
        // if age is less than 18 = access denied
        if(age < 18){
            System.out.println("You are not eligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }
        public static  void main(String[] args){
           checkAge(19);
           checkAge(17);
        }
    }
