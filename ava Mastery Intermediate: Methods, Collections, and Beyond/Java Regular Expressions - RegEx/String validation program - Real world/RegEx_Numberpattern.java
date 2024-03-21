import java.util.regex.Matcher; //to matching data
import java.util.regex.Pattern; //pattern to compile

public class RegEx_Numberpattern {
    public static void main(String[] args){
        //sample array data creation
        String[] strings={
                "12345",
                "Java Code",
                "70.9",
                "abc",
                "reg_ex",
                "abc6",
                "Kiran_",
                "Saloni",
                "98755d"
        };
        //regular expression for number to validate
        String pattern="^[a-zA-Z_][a-zA-Z0-9_]*$";
        Pattern regex =Pattern.compile(pattern);

        for(String str:strings){
            Matcher matcher=regex.matcher(str);
            if(matcher.matches()){
                System.out.println(str +" is a valid string");
            }
            else {
                System.out.println(str + " is a invalid string");
            }
        }
    }
}
