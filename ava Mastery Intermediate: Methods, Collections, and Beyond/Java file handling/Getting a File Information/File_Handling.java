import java.io.File; //import the File class library
public class File_Handling {
    public static void main(String[] args){
        //myfile.txt
       File myObj=new File("myfile.txt");
       if(myObj.exists()){
           System.out.println("File Name: "+myObj.getName());
           System.out.println("Absolute Path: "+myObj.getAbsolutePath());
           System.out.println("Writable : "+myObj.canWrite());
           System.out.println("Readable : "+myObj.canRead());
           System.out.println("File size in bytes  : "+myObj.length());
       }
       else{
           System.out.println("file not found");
       }
    }
}
