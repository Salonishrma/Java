interface StrFun{
    String run(String str);
}
public class Lambda_Method {
    public static void main(String[] args) {
    StrFun exclaim =(s) -> s+ "!!";
    StrFun query =(s) -> s+"??";
    ask_query("Hello",exclaim);
    ask_query("Hello",query);
    }
    public static  void ask_query(String str,StrFun format){
      String result=format.run(str);
      System.out.println(result);
    }
}
