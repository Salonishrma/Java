import java.io.File; //import the File class library
import java.io.IOException;
public class File_Handling {
    public static void main(String[] args){
        //New file object creation
        //filepath  "C:\\Users\\MyName(foder name)\\filename.txt
        // path for mac, linux --  /Users/name/filename.txt
        try {
                File myObj = new File("myfile.txt");
                if(myObj.createNewFile()) {
                System.out.println("File created " + myObj.getName());
            }
            else{
                System.out.println("File already exist. ");
            }
        }
        catch(IOException e){
            System.out.println("An error Occourred. ");
            e.printStackTrace();
        }
    }
}
