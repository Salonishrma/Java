import java.io.File; //import the File class library
import java.util.Scanner; //import this class to read a text file
import java.io.FileNotFoundException; //to handle erros
public class File_Handling {
    public static void main(String[] args){
        //myfile.txt
        try{
          File myObj =new File("myfile.txt");
          Scanner myReader =new Scanner(myObj);
          while(myReader.hasNextLine()){
              String data =myReader.nextLine();
              System.out.println(data);
          }
          myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error Raised....");
            e.printStackTrace();
        }

    }
}
