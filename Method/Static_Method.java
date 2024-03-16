public class Hello {
    //static method to multiplication
    public static int multiply(int a,int b){ 
        return a * b;
    }
    public static void main(String[] args) {
    //calling a static method directly we can access using class name
       int mult = Hello.multiply(5,6);
       System.out.println("multiply is equal to = "+mult);
    }
}
