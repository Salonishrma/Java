import java.io.File; //import the File class library
import java.io.IOException; // Handling Exceptions
import java.io.FileWriter; // for  writing a file
public class File_Handling {
    public static void main(String[] args){
        //myfile.txt
        try{
            //writing a file
            FileWriter myWriter =new FileWriter("myfile.txt");
            myWriter.write("File in java adding Financial text super easy.hurrah!");
            myWriter.close();
            System.out.println("Successfully written on file....");
        }
        catch (IOException e){
            System.out.println("Error occured....");
            e.printStackTrace();
        }

    }
}
