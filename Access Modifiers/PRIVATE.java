public class Hello {
    public int publicVariable;
    private int privatevariable; //private variable
    public void  publicMethod(){
        System.out.println("This is a public method");
    }
    //private method 
    private void privateMethod(){
        System.out.println("This is a private method");
    }
     public static void main(String[] args) {
        //object creatation
        Hello obj=new Hello();
        obj.privateMethod();//private method is accesible inside a class only
     }
}
