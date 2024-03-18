public class Method_overloading {
    //method overoading
    static int addMethod(int x,int y){
        return x+y;
    }
    static double addMethod(double x,double y){
        return x+y;
    }
    public static  void main(String[] args) {
      int  total1=addMethod(2,3);
      double total2=addMethod(2.0,3.2);
        System.out.println("my total1 is " +total1);
        System.out.println("my total2 is " +total2);
    }
}
