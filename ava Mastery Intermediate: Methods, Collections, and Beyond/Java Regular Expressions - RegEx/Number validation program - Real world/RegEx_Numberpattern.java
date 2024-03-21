import java.util.regex.Matcher; //to matching data
import java.util.regex.Pattern; //pattern to compile

public class RegEx_Numberpattern {
    public static void main(String[] args){
        //sample array data creation
        String[] strings={
                "12345",
                "987.65",
                "70.9",
                "abc",
                "-987",
                "abc6",
                "+700",
                "98755d"
        };
        //pattern creation
        String numberPattern="[-+]?\\d+\\.?\\d+";
        Pattern regex =Pattern.compile(numberPattern);

        for(String str:strings){
            Matcher matcher=regex.matcher(str);
            if(matcher.matches()){
                System.out.println(str +" is a valid number");
            }
            else {
                System.out.println(str + " is a invalid number");
            }
        }
    }
}
