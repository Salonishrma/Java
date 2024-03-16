public class Rectangle{
    public int area(int length,int breadth){
        return length * breadth;
    }
     public int perimeter(int length,int breadth){
        return 2*(length + breadth);
    }
    public static void main(String[] args) {
      Rectangle ob =new Rectangle();
      int result =ob.area(2,3);
      int perimet =ob.area(5,3);
      System.out.println("area is : " +result);
      System.out.println("perimter is : " +perimet);
    }
}
