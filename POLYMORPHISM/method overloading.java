public class MethodOverloading{

    //method with 2 paramenter
    static int add(int a,int b){
        return a+b;
    }
    //method with 3 parameters
    static int add(int a,int b,int c){
        return a+b+c;
    }
    //method with 2 double data type parameters
    static double add(double a, double b){
        return a+b;
    }
     static String add(String a, String b){
        return a+b;
    }
    public static void main(String args[]){
        int sum= add(5,4);
        int sum2=add(5,4,2);
        double sum3=add(5.5,2.1);
        System.out.println("sum is " +sum);
        System.out.println("sum2 is " +sum2);
        System.out.println("sum3 is " +sum3);
    }
}
