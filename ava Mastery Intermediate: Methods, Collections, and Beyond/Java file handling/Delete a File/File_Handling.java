import java.io.File; //import the File class library
public class File_Handling {
    public static void main(String[] args){
        //myfile.txt
       File myObj=new File("myfile.txt");
       if(myObj.delete()){
           System.out.println("File deleted Successfully "+myObj.getName());
       }
       else{
           System.out.println("File Not Found... or set correct path");
       }
    }
}
