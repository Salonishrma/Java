import java.io.File; //import the File class library
public class File_Handling {
    public static void main(String[] args){
        //myfile.txt
       File myObj=new File("/Users/salonisharma/Documents/myproject");
       if(myObj.delete()){
           System.out.println("Directory deleted Successfully "+myObj.getName());
       }
       else{
           System.out.println("Directory Not Found... or set correct path");
       }
    }
}
