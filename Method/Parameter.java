public class Hello {
    static void myMethod(int age,String name){ //parameters
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        myMethod(20,"Alice"); //passing data arguments
        myMethod(22,"BOB"); 
    }
}
